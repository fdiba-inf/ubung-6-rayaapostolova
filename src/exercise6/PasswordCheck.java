package exercise6;

import java.util.Scanner;

public class PasswordCheck 
{
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.next();
        int l = password.length();
        //assert l >= 8 : "Password too short!";
        boolean letterAndNumber = false;
        int counter = 0;
        String[] strArray = password.split("");
        for (int i = 0; i < strArray.length; i++)
        {
            if (Character.isLetterOrDigit(strArray[i].charAt(0)))
            {
                letterAndNumber = true;
            }
            if (Character.isDigit(strArray[i].charAt(0)))
            {
                counter++;
            }
        }
        if (letterAndNumber = true && counter >= 2 && l >= 8)
        {
            System.out.println("Password valid!");
        }
        else
        {
            System.out.println("Password invalid!");
        }   
    }
}
