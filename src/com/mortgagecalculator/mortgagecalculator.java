package com.mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalculator {

  public static void main(String[] args) {
    final byte MONTHS = 12;
    final byte PERCENTAGE = 100;

    int principal = 0;
    float annualInterest = 0;
    float monthlyInterest = 0;
    int period = 0;
    int periodMonths = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Principal ($1k - $1M): ");
      principal = scanner.nextInt();
      if ((principal >= 1000) && (principal <= 1_000_000)) {
        break;
    }
      System.out.println("Please enter number between 1000 and 1,000,000");
    }
    System.out.println("Entry: " + principal);

     

    while (true) {
      System.out.print("Annual Interest Rate: ");
      annualInterest = scanner.nextFloat();
      if ((annualInterest >= 1) && (annualInterest <= 30)) {
        monthlyInterest = (annualInterest/ PERCENTAGE) / MONTHS;
        break;
      }
      System.out.println("Please enter a value between 1 and 30");
    
  }
    System.out.println("Entry: " + annualInterest);
    

    while (true) {
    System.out.print("Period (Years): ");
    period = scanner.nextInt();
    if ((period >= 1) && (period <= 100)) {
      periodMonths = (period * MONTHS);
      break;
    }
    System.out.println("Please enter value between 1 and 100");
  }
    System.out.println("Entry: " + period);

    double mortgage = principal * 
      ((monthlyInterest * Math.pow((1 +monthlyInterest), periodMonths)) / 
      ((Math.pow((1 +monthlyInterest), periodMonths)) - 1));
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String mortgageString = formatter.format(mortgage);
    System.out.println("Mortgage: " + mortgageString);

  }

}
