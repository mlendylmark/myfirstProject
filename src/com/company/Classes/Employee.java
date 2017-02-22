package com.company.Classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class Employee extends UserClass {

    private String department;
    private String payGrade;
    private String employeeID;


    public Employee(){

    }
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String introduceYourself(String fName, String lName, int age) {

        return "I am " + fName + " " + lName + " .I am now " + age + " years old.";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }


}