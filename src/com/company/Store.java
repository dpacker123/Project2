package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Store {
   private ArrayList<Order> Orders;
   private ArrayList<String> Customers;

   public static void main(String[] args) {

   }
   public void runStore(){
      var userInput = new Scanner(System.in);
      System.out.println("");
      while(true){
         Menu();
         var userChoice = userInput.nextInt();
         switch (userChoice){
            case 1:
               addCustomer(userInput);
            case 2:
               selectCustomer(userInput);
               break;
            case 3:
              break;


         }
      }
   }

   private void selectCustomer(Scanner userInput) {
      userInput.nextLine();
      System.out.println("Type the name of the customer you would like" +
              "to select");
      var selectCust = userInput.nextLine();
      System.out.println("The customer " +selectCust + " Has been selected");

   }

   private void Menu() {
      System.out.println("===========================================");
      System.out.println("What would you like to do?");
      System.out.println("     [1] Add a new Customer");
      System.out.println("     [2] Select a Customer");
      System.out.println("     [3] Exit the program");
      System.out.println("===========================================");
   }

   private void addCustomer(Scanner userInput) {
      userInput.nextLine();
      System.out.println("Please type the name of the " +
              "customer you wish to add");
      var newCustomer = userInput.nextLine();
      Customers.add(newCustomer);
      System.out.println("Thank you for adding " +newCustomer+ " to the list");





   }


}
