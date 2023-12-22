package tk.mosqitotorpedo;

import javax.crypto.*;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws Exception {

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String plainText = "You can't see me!";
        byte[] encryptedData = cipher.doFinal(plainText.getBytes());

        System.out.println("Text: " + plainText + "\n\nEncrypted Text: " + Base64.getEncoder().encodeToString(encryptedData));


    }
}
