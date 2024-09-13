
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class StringFunction {
    
    public static String generateOTP(int length) {
        String numbers = "1234567890";
        String realOTP = "";
        Random random = new Random();
        char[] otp = new char[length];

        for (int i = 0; i < length; i++) {
            otp[i] = numbers.charAt(random.nextInt(numbers.length()));
            realOTP += otp[i];
        }
        return realOTP;
    }
    
}
