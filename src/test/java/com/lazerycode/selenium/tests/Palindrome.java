package com.lazerycode.selenium.tests;

import java.util.Scanner;

public class Palindrome {
  public static void main (String[] args){
    String input, reverse="";
    Scanner sentence = new Scanner (System.in);
    input=sentence.nextLine();

    for(int a=input.length()-1; a>=0; a--)
      reverse= reverse + input.charAt(a);
    if (input.equals(reverse)){
      System.out.println("True");}
    else {System.out.println("False");}
  }

}
