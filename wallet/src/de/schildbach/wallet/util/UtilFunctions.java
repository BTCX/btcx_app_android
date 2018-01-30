package de.schildbach.wallet.util;

import android.util.Log;

/**
 * Created by kaushikg on 30-01-2018.
 */

/*Created to put common Util functions and use it globally in a whole app*/

public class UtilFunctions {

        public static boolean checkPasswordStrength(String pw){
                    // .*[A-Za-z].*   check for the presence of at least one letter
                    // .*[0-9].*      check for the presence of at least one number
                    // [A-Za-z0-9]*   check that only numbers and letters compose this string
            String text = pw;
            //if (text.matches(".*[A-Za-z].*") && text.matches(".*[0-9].*") && text.matches("[A-Za-z0-9]*")) {
            if (text.matches(".*[A-Z].*") &&text.matches(".*[a-z].*") &&
                    text.matches(".*[0-9].*") && text.matches("[A-Za-z0-9]*")) {
                Log.i("checkPasswordStrength","Its Alphanumeric");
                return true;
            } else {
                Log.i("checkPasswordStrength","Its NOT Alphanumeric");
                return false;
            }
        }

}
