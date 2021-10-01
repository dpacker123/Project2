package com.company;

import java.util.ArrayList;

public class Customer {
    private ArrayList<ShippingAddress> addresses;
    private String name;
    private int customerID;

    public Customer(String customerName, int custID){
        customerID = custID;
        name = customerName;
        addresses = new ArrayList<ShippingAddress>();

    }
    public String getName(){
        return name;
    }
    //public ShippingAddress addAddress() {
      //  var newAddress = new ShippingAddress();
       // newAddress.
   // }
}
