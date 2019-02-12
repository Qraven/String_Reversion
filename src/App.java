/*
*This is a simple app made in Java. It can reverse a given String.
*
* @author Qraven
* @version 1.0
* Created on 12.09.2019 (dd/mm/rr)
* 
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        //Defining variables
        String input;

        //Creating scanner instance
        Scanner sc = new Scanner(System.in);

        //Taking input from a user
        input = sc.next();

        //Creating a table of characters of length equivalent to a length of a given String
        char reverse[] = new char[input.length()];

        //This loop is assigning last character from the given String to the first place of a prevoiusly created table
        for(int i = 0; i < input.length(); i++)
        {
            reverse[i] = input.charAt(input.length() - (i+1));
        }

        //Printing out the result
        System.out.println(reverse);
    }

}
