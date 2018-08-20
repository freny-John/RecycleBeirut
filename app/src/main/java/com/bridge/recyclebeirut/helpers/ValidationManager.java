package com.bridge.recyclebeirut.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by freny.john on 11-Jan-18.
 */

public class ValidationManager {



//Email Validator

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }



//Password validator
    public static boolean isValidPassword(final String password) {
        if (password.trim().length() >= 4 && password.trim().length() <= 20) {
            Pattern pattern;
            Matcher matcher;
            final String PASSWORD_PATTERN = "[a-zA-Z0-9\\!\\@\\#\\$\\%\\^\\&\\+\\*\\(\\)\\_\\-\\'\\\"\\.\\?\\<\\>\\,\\{\\}\\;]{4,20}";

            pattern = Pattern.compile(PASSWORD_PATTERN);
            matcher = pattern.matcher(password);

            return matcher.matches();
        } else {
            return false;
        }
    }



}
