import java.util.Scanner;

public class PalindromeString {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String");
		String Word = scan.nextLine();
		int length = Word.length();
		String a= "";
		
		
		for(int i = length-1;i>=0;i--)
		{
			a=a+Word.charAt(i);
		}
		
	
		
		if(a.equalsIgnoreCase(Word))
		{
			System.out.println(Word + " is a Palindrome String");
		}
		else
		{
			System.out.println(Word + " is not a Palindrome String");
		}

		
		// Reverse of string using Reverse Function.
		String Reverse = new StringBuffer(Word).reverse().toString();
		System.out.println(Reverse);
	}

}
