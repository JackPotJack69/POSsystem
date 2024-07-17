package com.example.demo4;
import java.util.*;

import static javafx.application.Application.launch;

public class Login {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, String> workerCredentials = new HashMap<String, String>();
    static HashMap<String, String> adminCredentials = new HashMap<String, String>();
    String[] workerList;
    String[] adminList;



        public static void loginFunction() {
        System.out.println("Admin or Worker");
        String logType = input.nextLine();
        if (logType.equals("worker")) {
            System.out.println("Please enter your credentials");
            String username = input.nextLine();
            System.out.println("Please enter your password");
            String password = input.nextLine();
            if (workerCredentials.containsKey(username)) {
                if (workerCredentials.get(username).equals(password)) {
                    System.out.println("Login successful!");
                }

            }
            else {
                System.out.println("Wrong Credentials");
            }
        }
        else{
            System.out.println("Please enter your credentials");
            String username = input.nextLine();
            System.out.println("Please enter your password");
            String password = input.nextLine();
            if (adminCredentials.containsKey(username)) {
                if (adminCredentials.get(username).equals(password)) {
                    System.out.println("Login successful!");
                }
                else {
                    System.out.println("Wrong Credentials");
                }
            }
            else {
                System.out.println("Wrong Credentials");
            }

        }
    }



    public static void newLogin() {
        System.out.println("Do you wish to register a Worker Account or an Admin Account? Press 1 for Worker and 2 for Admin.");

        int option1 = input.nextInt();
        input.nextLine();

        if (option1 == 1) {
            System.out.println("Enter the Username: ");
            String name = input.nextLine();

            System.out.println("Input the Password: ");
            String pass = input.nextLine();
            workerCredentials.put(name, pass);
            System.out.println("The user has been added successfully");
        } else {
            System.out.println("Enter the Username: ");
            String name = input.nextLine();

            System.out.println("Input the Password: ");
            String pass = input.nextLine();
            adminCredentials.put(name, pass);
            System.out.println("The user has been added successfully");
        }
    }
    public static void main(String[] args) {

        newLogin();
loginFunction();
        for (Map.Entry<String, String> entry : adminCredentials.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }






}
