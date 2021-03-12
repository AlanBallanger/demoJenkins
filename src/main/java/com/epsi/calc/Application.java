package com.epsi.calc;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Application {
  /** Description */
  public static void main(String[] args) {
    System.out.println("Hello world");

    Scanner myObj = new Scanner(System.in, Charset.defaultCharset());
    System.out.println("Enter a random number");
    String number = myObj.nextLine();
    System.out.println("You chose: " + number);
  }
}
