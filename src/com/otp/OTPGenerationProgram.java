package com.otp;

import java.security.SecureRandom;
import java.util.Random;

public class OTPGenerationProgram {
    public static void main(String[] args) {
        Random random = new Random();
        String otp4digit = String.format("%04d",random.nextInt(1000));
        System.out.println(otp4digit);

        SecureRandom secureRandom = new SecureRandom();
        int otp6digit = secureRandom.nextInt(999999);
        System.out.println(otp6digit);
    }
}
