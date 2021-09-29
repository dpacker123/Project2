package com.company;

import java.util.Scanner;

public class ShippingAddress {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    
    public String ShippingAddress{
        var ShippingAddress = new ShippingAddress(addressLine1, 
                city, state, postalCode);
        ShippingAddress.add(addressLine2);
    }

    private void add(String addressLine2) {
    }

    private void printMenu(){
        System.out.println("enter address");

    }

    public void toString(){
        var inputReader = new Scanner(System.in);
        while(true){
            printMenu();
            var userInput = inputReader.nextInt();
            switch (userInput)

        }

    }

}
