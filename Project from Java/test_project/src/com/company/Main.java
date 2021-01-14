package com.company;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.login.LoginException;
import java.security.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LoginException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Cipher cipher = Cipher.getInstance("RSA");
		KeyPairGenerator pairgen = KeyPairGenerator.getInstance("RSA");
		KeyPair keyPair = pairgen.generateKeyPair();
		Key publicKey = keyPair.getPublic();
		Key privateKey = keyPair.getPrivate();
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] bytes = cipher.doFinal(s.getBytes());
		for (byte b : bytes){
			System.out.print(b);
		}
		System.out.print("\n");
		Cipher decriptCirpher = Cipher.getInstance("RSA");
		decriptCirpher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] decriptedBytes = decriptCirpher.doFinal(bytes);
		for (byte b : decriptedBytes){
			System.out.print((char) b);
		}
	}
}
