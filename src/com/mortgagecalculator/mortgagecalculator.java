package com.mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalculator {

  public static void main(String[] args) {
    Scanner principalScanner = new Scanner(System.in);
    System.out.print("Principal: ");
    String principal = principalScanner.nextLine().trim();
    int principalInt = Integer.parseInt(principal);
    System.out.println("Entry: " + principalInt);

    Scanner interestScanner = new Scanner(System.in);
    System.out.print("Annual Interest Rate: ");
    String interest = interestScanner.nextLine().trim();
    double interestDble = Double.parseDouble(interest);
    System.out.println("Entry: " + interestDble);
    double r = (interestDble / 100) / 12;

    Scanner periodScanner = new Scanner(System.in);
    System.out.print("Period (Years): ");
    String period = periodScanner.nextLine().trim();
    int periodInt = Integer.parseInt(period);
    int n = periodInt * 12;
    System.out.println("Entry: " + periodInt);

    double mortgage = principalInt * ((r * Math.pow( (1 + r), n)) / ((Math.pow( (1 + r), n))-1)); 
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String mortgageString = formatter.format(mortgage);
    System.out.println("Mortgage: " + mortgageString);
    
  }
  
}
