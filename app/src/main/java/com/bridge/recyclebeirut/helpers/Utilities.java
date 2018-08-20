package com.bridge.recyclebeirut.helpers;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by freny.john on 12-Feb-18.
 */

public class Utilities {

    ProgressDialog progressDialog;

    Context context;
    public Utilities(Context context) {
        super();
        this.context = context;
    }



    public void showLoadingDialog(String message) {
if(this.progressDialog != null &&progressDialog.isShowing())
{
    progressDialog.dismiss();
}
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void dismissLoadingDialog() {

        if (this.progressDialog != null && this.progressDialog.isShowing()) {
            this.progressDialog.dismiss();
        }
    }








}
