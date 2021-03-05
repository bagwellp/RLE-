/*
 * Patty Bagwell
 * 10/13/2017
 * Data Structures - Dr. Murimi
 */
package rle;

import java.util.Scanner;

public class RLE
{

    
    public static void main(String[] args)
    {
     
    Scanner input = new Scanner(System.in); //creates scanner for input
    System.out.println("Enter string:");//requests string from user
    String str = input.nextLine();//assigns user's string to varibale str

    System.out.println("Input: " + str);//confirms the input being used

    String compressed = ""; //creates an empty string variable called compressed


    for (int x = 0; x < str.length(); x++) //sets up iteration 
    {
     int count = 1; //create and initialize count varibale to 1 for the 
                    //initial count of the first character of the string

     while (x+1 < str.length() && str.charAt(x)==str.charAt(x+1))
                    // makes sure the x value is not out of bounds 
                    //and compares two values of the string
        {
        count++;// increases the count if the two variable are a match
        x++;//increase the value of x for the next comparrison

        }

     compressed = compressed + count + str.charAt(x); 
                //appends the count and characher to the ompressed string
    }

    System.out.println("Compressed: "+ compressed);//Prints compressed 
}
      
}