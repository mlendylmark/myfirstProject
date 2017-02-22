package com.company.Classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class Customer extends UserClass{

    private String address;
    private String telephoneNumber;
    private String customerID;




    public Customer(){

    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    //POLYMORPHISM(OVERLOADING)
    public String introduceYourself(String fName, String lName,int age, String address, String workplace,
                                    String position) {

        return "I am " + fName + " " + lName + "I am " + age + ", I lived in " + address + ".I am currently working at "
                + workplace + "as " + position;


    }



    }


