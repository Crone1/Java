import java.util.Scanner;

public class LengthOfName
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        int len = name.length();
        // Use the length() method of the String class.
        System.out.println("Hello " + name + ", your name has " + len + " letters.");
    }
}
