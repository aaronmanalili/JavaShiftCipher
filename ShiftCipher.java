package shiftCipher;

import java.util.Scanner;

// CSIT 270-01 Shift Cipher Project by Aaron Manalili

public class ShiftCipher {

	public static String Encryption(String message, int shift) 
	{
		message = message.toUpperCase();
		String s = "";
		
		for(int i = 0; i < message.length(); i++) 
		{
			char c = (char)(message.length() + shift);
			if(c > 'z') 
			{
				s += (char)(message.charAt(i) - (26 - shift));
			}
			else 
			{
				s += (char)(message.charAt(i) + shift);
			}
		}
		
		return s;
	}
	public static String Decryption(String message, int shift) 
	{
		
		String s = "";
		
		for(int i = 0; i < message.length(); i++) 
		{
			char c = message.charAt(i);
			
			if(c >= 'a' && c <= 'a') 
			{
				if(c < 'a') 
				{
					c = (char)(c + 'z' - 'a' + 1);
				}
				
				s += c;
			}
			else if(c >= 'A' && c <= 'Z') 
			{
				if(c < 'A') 
				{
					c = (char)(c + 'Z' - 'A' + 1);
				}
				s += c;
			}
			else 
			{
				s += c;
			}
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message;
		int shift;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in a random message: ");
		message = scan.nextLine();
		
		System.out.println("Enter the Shift Key: ");
		shift = scan.nextInt();
		
		System.out.println("Message of the user before encryption: " + message);
		System.out.println("The user inputed a message: " + message + ", by encrypting with shift cipher, the corresponding Encrypted message is: " + Encryption(message, shift));
		
		System.out.println("The encrypted message is: " + Encryption(message, shift) + ", by deciphering with shift cipher, the corresponding Decrypted message is: " + Decryption(message, shift));
	}
	
	

}
