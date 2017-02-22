package com.company.Classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class UserClass {


    String firstName;
    String lastName;
    String email;
    String userName;
    String passWord;
    String passWordAgain;
    int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWordAgain() {
        return passWordAgain;
    }

    public void setPassWordAgain(String passWordAgain) {
        this.passWordAgain = passWordAgain;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduceYourself(String fName, String lName) {

        return "I am " + fName + " " + lName;
    }



    }
