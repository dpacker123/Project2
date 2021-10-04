package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;



public class Store {

   private ArrayList<String> Customers;
   private ArrayList<Order> Orders;

   public Store(){
      Customers = new ArrayList<String>();
      Orders = new ArrayList<Order>();
   }


  public static void main(String[] args) throws IOException {
       // reading customer.txt into the customers array list (does not work)
      var filename = "Customers.txt";
      var getFile = Paths.get(filename);
      var Customers = Files.readAllLines(getFile);
      System.out.println("" + Customers);


  }
   public void runStore(){
      var userInput = new Scanner(System.in);// creates scanner for user input
      System.out.println(""); // had to put this in so the code works :(
      while(true){
         Menu();
         var userChoice = userInput.nextInt(); // assigns user input to a variable, int because it is 1 -3.
         switch (userChoice){ //creates a switch that goes through the cases, still having issues
            case 1:
               addCustomer(userInput);
            case 2:
               selectCustomer(userInput);
               break;
            case 3:
              ManageCustomer();
              case 4:
                 break;


         }
      }
   }

   private String selectCustomer(Scanner userInput) {
      userInput.nextLine(); // eats \n from previous call to next int
      System.out.println("Type the name of the customer you would like" +
              "to select");
      var selectCust = userInput.nextLine(); // saves user input as a new variable
      System.out.println("The customer " +selectCust + " Has been selected");
      return selectCust;
      // this breaks the program :(


   }

   private void Menu() { //basic menu Self explanatory
      System.out.println("===========================================");
      System.out.println("" + Customers );// test to make sure customer list is being updated
      System.out.println("What would you like to do?");
      System.out.println("     [1] Add a new Customer");
      System.out.println("     [2] Select a Customer");
      System.out.println("     [3] Manage a Customer");
      System.out.println("     [4] Exit the program");
      System.out.println("===========================================");
   }

   private void addCustomer(Scanner userInput) {
      userInput.nextLine(); // eats \n from previous from previous call
      System.out.println("Please type the name of the " +
              "customer you wish to add");
      var newCustomer = userInput.nextLine();//saves user input as new variabe
      Customers.add(newCustomer); // adds users input to customers array list
      System.out.println("Thank you for adding " +newCustomer+ " to the list");
      System.out.println("Here is the updated list " + Customers);





   }
   public void ManageCustomer(){
       var userInput = new Scanner(System.in);
       System.out.println("");
       while(true){
           secondMenu();
           var userChoice = userInput.nextInt();
           switch (userChoice){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
           }



       }
   }

    private void secondMenu() {
       System.out.println("===================================");
       System.out.println("Please select one of the following choices:");
       System.out.println("     [1] Add an Address");
       System.out.println("     [2] Make an order");
       System.out.println("     [3] Go Back");
       System.out.println("===================================");

    }


}
