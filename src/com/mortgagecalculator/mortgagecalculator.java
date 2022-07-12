package com.mortgagecalculator;

import java.util.Scanner;

public class mortgagecalculator {

  public static void main(String[] args) {
    Scanner principalScanner = new Scanner(System.in);
    System.out.print("Principal: ");
    String principal = principalScanner.nextLine().trim();
    int principalInt = Integer.parseInt(principal);
    System.out.println(principalInt);
    Scanner interestScanner = new Scanner(System.in);
    System.out.print("Annual Interest Rate: ");
    String interest = interestScanner.nextLine().trim();
    
    Scanner periodScanner = new Scanner(System.in);
    System.out.print("Period (Years): ");
    String period = periodScanner.nextLine().trim();
  }

}
