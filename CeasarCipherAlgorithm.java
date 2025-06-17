import java.util.*;
import java.lang.*;
import java.io.*;

class CeasarCipherAlgorithm
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter message for Encryption or Decryption : ");
        String message = s.nextLine();
        System.out.print("\nEnter shift Value : ");
        int shiftValue = s.nextInt();
        System.out.print("\nEnter Encryption or Decryption : ");
        String type = s.next();
        StringBuilder sb = new StringBuilder();
        if (type.equalsIgnoreCase("Encryption")) {
            for (int i = 0; i < message.length(); i++) {
                char present = message.charAt(i);
                if (Character.isLetter(present)) {
                    char base = (present >= 'a' && present <= 'z') ? 'a' : 'A';
                    char required = (char)((present + shiftValue - base) % 26 + base);
                    sb.append(required);
                } else sb.append(present);
            }
            System.out.print("\nEncrypted message is " + sb.toString());
        } else if (type.equalsIgnoreCase("Decryption")) {
            for (int i = 0; i < message.length(); i++) {
                char present = message.charAt(i);
                if (Character.isLetter(present)) {
                    char base = (present >= 'a' && present <= 'z') ? 'a' : 'A';
                    char required = (char)((present - shiftValue - base + 26) % 26 + base);
                    sb.append(required);
                } else sb.append(present);
            }
            System.out.print("\nDecrypted message is " + sb.toString());
        } else {
            System.out.print("\nSelect 'Encryption' or 'Decryption' correctly.");
        }
    }
}