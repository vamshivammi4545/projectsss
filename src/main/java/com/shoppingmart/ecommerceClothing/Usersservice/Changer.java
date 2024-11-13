package com.shoppingmart.ecommerceClothing.Usersservice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Changer {

    public static  String convert(String ss) throws NoSuchAlgorithmException
    {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(ss.getBytes());
        
        // Step 2: Convert the hash to a hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }
        
        // Step 3: Take the first 16 characters of the hexadecimal hash
        String hexHash = hexString.toString().substring(0, 16);
        
        // Step 4: Convert the first 16 hex characters to a long number
        long hashCode = Long.parseLong(hexHash, 16) % 10000000000000000L;  // Ensure it's a 16-digit number
        
        // Step 5: Return the 16-digit hash code as a string (with leading zeros if necessary)
        return String.format("%016d", hashCode);
    }
}
