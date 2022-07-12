package com.mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalculator {

  public static void main(String[] args) {
    final byte MONTHS = 12;
    final byte PERCENTAGE = 100;

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
    double rate = (interestDble / PERCENTAGE) / MONTHS;

    Scanner periodScanner = new Scanner(System.in);
    System.out.print("Period (Years): ");
    String periodEntry = periodScanner.nextLine().trim();
    byte periodInt = Byte.parseByte(periodEntry);
    int period = periodInt * MONTHS;
    System.out.println("Entry: " + periodInt);

    double mortgage = principalInt * 
      ((rate * Math.pow((1 + rate), period)) / 
      ((Math.pow((1 + rate), period)) - 1));
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String mortgageString = formatter.format(mortgage);
    System.out.println("Mortgage: " + mortgageString);

  }

}
