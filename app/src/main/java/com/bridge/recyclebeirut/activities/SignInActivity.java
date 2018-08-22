package com.bridge.recyclebeirut.activities;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bridge.recyclebeirut.R;
import com.bridge.recyclebeirut.api.APIService;
import com.bridge.recyclebeirut.api.APIUrl;
import com.bridge.recyclebeirut.helpers.ConnectivityReceiver;
import com.bridge.recyclebeirut.helpers.ValidationManager;
import com.bridge.recyclebeirut.models.BaseResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    public String TAG = "SignInActivity";
    TextView title;
    ActionBar ab;
    TextView disclaimer;
    private EditText editTextEmail, editTextPassword;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setElevation(0);
        ab = getSupportActionBar();
        // Create a TextView programmatically.
        title = new TextView(getApplicationContext());
        // Create a LayoutParams for TextView
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        // Apply the layout parameters to TextView widget
        title.setLayoutParams(lp);
        // Set text to display in TextView
        title.setText("SIGN IN");
        title.setTypeface(title.getTypeface(), Typeface.BOLD);
        // Set the text color of TextView
        title.setTextColor(Color.WHITE);
        // Set TextView text alignment to center
        title.setGravity(Gravity.CENTER);
        // Set the ActionBar display option
        ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        // Finally, set the newly created TextView as ActionBar custom view
        ab.setCustomView(title);


        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        buttonSignIn = (Button) findViewById(R.id.buttonSignIn);

       // disclaimer = (TextView) findViewById(R.id.disclaimer);

        buttonSignIn.setOnClickListener(this);


    }


    private void userSignIn() {

        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();


        if (ValidationManager.isValidEmail(email)) {

            if (ValidationManager.isValidPassword(password)) {

                final ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage("Signing In...");
                progressDialog.setCancelable(false);

                progressDialog.show();


                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(APIUrl.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                APIService service = retrofit.create(APIService.class);


                Call<BaseResponse> call = service.userLogin(email, password);

                call.enqueue(new Callback<BaseResponse>() {
                    @Override
                    public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                        progressDialog.dismiss();


                        Log.e("SERVER-RESPONSE-data", String.valueOf((response.body())));
                        if (response.body() != null) {
                            if (String.valueOf(response.body().getStatus()).equals("1")) {

//                                SharedPrefManager.getInstance(getApplicationContext()).userDetails(response.body().getData().getUser());
//                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                                finish();

                            } else {
                                Toast.makeText(getApplicationContext(), "User Not Found!", Toast.LENGTH_LONG).show();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Server not responding, please try again later", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                        }

                    }

                    @Override
                    public void onFailure(Call<BaseResponse> call, Throwable t) {
                        progressDialog.dismiss();

                        Toast.makeText(getApplicationContext(), t.getMessage() + t.toString() + t.getCause(), Toast.LENGTH_LONG).show();
                        Log.d(TAG, t.getMessage() + t.toString() + t.getCause());

                    }
                });

            } else {
                Toast.makeText(getApplicationContext(), "Enter a valid password", Toast.LENGTH_LONG).show();

            }

        } else {
            Toast.makeText(getApplicationContext(), "Enter a valid Email", Toast.LENGTH_LONG).show();

        }

    }

    @Override
    public void onClick(View view) {
        if (view == buttonSignIn) {


            if (ConnectivityReceiver.isConnected()) {

                // userSignIn();

                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();


            } else {
                Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_LONG).show();

            }

        }
    }
}
