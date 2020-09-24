package com.lazerycode.selenium.arrays;

public class StudentRunner {
  public static void main (String [] args){
    int[] marks = {99, 98, 100};
    Student student = new Student ("Ranga", marks);
    int number = student.getNumberOgMarks();
    System.out.println("number of marks : " + number);

  }
}
