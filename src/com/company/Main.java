package com.company;


import com.company.Classes.Customer;
import com.company.Classes.Employee;
import com.company.Classes.StaticMethods;
import com.company.Classes.UserClass;

public class Main {

    public static void main(String[] args) {

        byte byteNumber = 127;
        int firstNumber = 1;
        long longNumber = 1L;
        float floatNumber = 3.14f;
        double doubleNumber = 3.23231d;
        char charVariable = 'd';
        boolean booleanVariable = true;
        String stringValue = "This is a String. Okay!\n";

        System.out.println("byte: " + byteNumber);
        System.out.println("int: " + firstNumber);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + charVariable);
        System.out.println("boolean: " + booleanVariable);
        System.out.println("String: " + stringValue);







      //Employee
        System.out.println("=====EMPLOYEE====\n");

        Employee firstEmployee = new Employee();

        firstEmployee.setFirstName("Kwang Soo");
        firstEmployee.setLastName("Lee");
        firstEmployee.setAge(35);
        firstEmployee.setEmail("lkwangsoo@gmail.com");
        firstEmployee.setUserName("lkgiraffee");
        firstEmployee.setPassWord("******");
        firstEmployee.setPassWordAgain("******");
        firstEmployee.setDepartment("Finance Office");
        firstEmployee.setPayGrade("11000");
        firstEmployee.setEmployeeID("W0017960\n");

        String fUserFirstName = firstEmployee.getFirstName();
        String fUserLastName = firstEmployee.getLastName();
        int fUserAge = firstEmployee.getAge();
        String fUserEmail = firstEmployee.getEmail();
        String fUserUserName = firstEmployee.getUserName();
        String fUserPassWord = firstEmployee.getPassWord();
        String fUserPassWordAgain = firstEmployee.getPassWordAgain();
        String fUserDepartment = firstEmployee.getDepartment();
        String fUserPayGrade = firstEmployee.getPayGrade();
        String fUserEmployeeID = firstEmployee.getEmployeeID();

        System.out.println("First Name: " + fUserFirstName);
        System.out.println("Last Name: " + fUserLastName);
        System.out.println("Age: " + fUserAge);
        System.out.println("Email: " + fUserEmail);
        System.out.println("Username: " + fUserUserName);
        System.out.println("Password: " + fUserPassWord);
        System.out.println("Password Again: " + fUserPassWordAgain);
        System.out.println("Department: " + fUserDepartment);
        System.out.println("Pay Grade: " + fUserPayGrade);
        System.out.println("Employee ID: " + fUserEmployeeID);
        System.out.println("=====INTRODUCE YOURSELF======");
        System.out.println(firstEmployee.introduceYourself("Song", "Ji Hyo!", 20));



        //CUSTOMER
        System.out.println("====CUSTOMER====\n");
        Customer firstCustomer = new Customer();

        firstCustomer.setFirstName("Jae Suk");
        firstCustomer.setLastName("Yoo");
        firstCustomer.setAge(45);
        firstCustomer.setEmail("yjae_suk@gmail.com");
        firstCustomer.setUserName("yjaesuk");
        firstCustomer.setPassWord("**********");
        firstCustomer.setPassWordAgain("**********");
        firstCustomer.setAddress("Incheon,Seoul");
        firstCustomer.setTelephoneNumber("340-5487");
        firstCustomer.setCustomerID("00543\n");

        String sUserFirstName = firstCustomer.getFirstName();
        String sUserLastName = firstCustomer.getLastName();
        int sUserAge = firstCustomer.getAge();
        String sUserEmail = firstCustomer.getEmail();
        String sUserUserName = firstCustomer.getUserName();
        String sUserPassWord = firstCustomer.getPassWord();
        String sUserPassWordAgain = firstCustomer.getPassWordAgain();
        String sUserAddress = firstCustomer.getAddress();
        String sUserTelephoneNumber = firstCustomer.getTelephoneNumber();
        String sUserCustomerID = firstCustomer. getCustomerID();

        System.out.println("First Name: " + sUserFirstName);
        System.out.println("Last Name: " + sUserLastName);
        System.out.println("Age: " + sUserAge);
        System.out.println("Email: " + sUserEmail);
        System.out.println("Username: " + sUserUserName);
        System.out.println("Password: " + sUserPassWord);
        System.out.println("Password Again: " + sUserPassWordAgain);
        System.out.println("Address: " + sUserAddress);
        System.out.println("Telephone Number: " + sUserTelephoneNumber);
        System.out.println("Customer ID: " + sUserCustomerID);


        System.out.println("======INTRODUCE YOURSELF=======");
        System.out.println(firstCustomer.introduceYourself("Lee", "KWang Soo", 18, "Lilo-an", "ON Semiconductors",
                "Maintenance Equipment Technician.\n"));



         //PERSON CLASS(USER CLASS)
        System.out.println("===PERSON CLASS(USERCLASS)===\n");


        UserClass FirUser = new UserClass();
        UserClass SecUser = new UserClass();


        SecUser.setFirstName("Lendyl Mark");
        SecUser.setLastName("Malnegro");
        SecUser.setEmail("mlendylmark@gmail.com");
        SecUser.setUserName("SGK_Prole");
        SecUser.setPassWord("**********");
        SecUser.setPassWordAgain("**********");
        SecUser.setAge(15);

        FirUser.setFirstName("JONG KOOK");
        FirUser.setLastName("KIM");
        FirUser.setEmail("jkookie@gmail.com");
        FirUser.setUserName("jkookie");
        FirUser.setPassWord("******");
        FirUser.setPassWordAgain("******");



        System.out.println("FirUser First Name:\t\t\t " + SecUser.getFirstName());
        System.out.println("FirUser Last Name:\t\t\t " + SecUser.getLastName());
        System.out.println("FirUser Email:\t\t\t\t " + SecUser.getEmail());
        System.out.println("FirUser UserName:\t\t\t " + SecUser.getUserName());
        System.out.println("FirUser Password:\t\t\t " + SecUser.getPassWord());
        System.out.println("FirUser Password Again:\t\t " + SecUser.getPassWordAgain());
        System.out.println("FirUser Age:\t\t\t\t " + SecUser.getAge());


        System.out.println("SecUser First Name:\t\t\t " + FirUser.getFirstName());
        System.out.println("SecUser Last Name:\t\t\t " + FirUser.getLastName());
        System.out.println("SecUser Email:\t\t\t\t " + FirUser.getEmail());
        System.out.println("SecUser Username:\t\t\t " + FirUser.getUserName());
        System.out.println("SecUser Password:\t\t\t " + FirUser.getPassWord());
        System.out.println("SecUser Password Again:\t\t " + FirUser.getPassWordAgain());
        System.out.println("SecUser Age:\t\t\t\t " + FirUser.getAge());

        System.out.println("====INTRODUCE YOURSELF=====\n");
        UserClass introduceYourself = new UserClass();
        System.out.println(introduceYourself.introduceYourself("Mark", "Lee!\n"));



        System.out.println("=====CLASS OVERLOAD=====\n");
        //Customer customer1 = new Customer();
        Customer  customer1 = new Customer("Neil", "Agbay\n");
        System.out.println("I am "  + customer1.getFirstName() + " " + customer1.getLastName());


        Employee employee1 = new Employee("Ha", "Dong Hoon\n");
        System.out.println("I am " + employee1.getFirstName() + " " + employee1.getLastName());



        System.out.println("***************");
        System.out.println("* Lendyl Mark *");
        System.out.println("***************\n");



	// while loop
        System.out.println("====WHILE LOOP=====\n");
        int num = 0;
        while(num < 10) {
            num = num + 1;
            System.out.print(num + " ");

        }

    // do-while loop
        System.out.println("\n\n====DO-WHILE LOOP=====\n");
        int num1 = 0;
        do{
            num1 = num1 + 1;
            System.out.print(num1 + " ");
        }
        while(num1 < 10);

    // for loop
        System.out.println("\n\n=====FOR LOOP=====\n");
        int num2 = 1;
        for(num2 = 1;num2 < 11;num2++){
            System.out.print(num2 + " ");

        }

        System.out.println("\n\n=====LOOP PROBLEM=====\n");
    // LOOP PROBLEM
        StaticMethods.myMethod(6);
        System.out.println(StaticMethods.myMethod(6));

    //AVERAGE
        System.out.println("\n\n=====FACTORIAL=====\n");

        int fact = 1;
        int number = 0;

        for(int f = 1;f <= 7; f++){
            fact = f * fact;

        }
        System.out.println(fact + " ");


   }
}
