// Jaime Nunez
// 9/28/17
// CS-2003
// Palindrome Lab
package palindromeChecker;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		String testString = in.nextLine();
		
		if (isaPalindrome(testString))
		{
			System.out.println("The string " + testString + " is a palindrome!"); 
		}
		else
		{
			System.out.println("The string " + testString + " is not a palindrome."); 
		}

		in.close();
	}
	
	public static boolean isaPalindrome(String expression)
	{
		//determine the length of the string expression
		int strLength = expression.length();
		//grab the first character in the expression
		char firstValueInString = expression.charAt(0);
		//grab the last character in the expression
		char lastValueInString = expression.charAt(expression.length()-1);
		//check the base case
		if(strLength <= 1)
		{
			return true;
		}
		//check if it is not a palindrome
		else if(firstValueInString != lastValueInString)
		{
			return false;
		}
		//otherwise call the recursive function
		else 
		{
			//if the expression length has at least 3 characters
			if(strLength > 2)
			{
				return isaPalindrome(expression.substring((1), strLength-1));
			}
			//if the expression length only has two characters left
			else
			{
				return isaPalindrome(expression.substring((0), strLength-1));

			}
		}
	}
	


}
