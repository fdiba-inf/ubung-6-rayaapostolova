package exercise6;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    String number = input.next();
    int parseInt = Integer.parseInt(number);
    assert parseInt > 0 : "Wrong number!";
    boolean isPalindrome = true;
    String[] strArray = number.split("");
    int[] intArray = new int[strArray.length];
    for (int i = 0; i < strArray.length; i++) 
    {
      intArray[i] = Integer.parseInt(strArray[i]);
    }
    for (int index = 0; index < intArray.length / 2; index++) 
    {
      if (intArray[index] != intArray[(intArray.length - 1) - index]) 
      {
        isPalindrome = false;
      }
    }
    System.out.println("Palindrome: " + isPalindrome);
  }
}

