package com.example.demo4;

import java.io.IOException;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, String> workerCredentials = new HashMap<String, String>();
    static HashMap<String, String> adminCredentials = new HashMap<String, String>();
    public TextField passwordTextFieldADMIN;
    public TextField usernameTextFieldADMIN;
    public TextField usernameTextFieldWORKER;
    public TextField passwordTextFieldWORKER;
    public TextField loginUsernameTF;
    public TextField loginPasswordTF;
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML


    //newLogin method allows to register a new user

    void newLogin(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminOrWorker.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Register New User");
        stage.setScene(new Scene(root, 700, 700));
        stage.show();

    }


    @FXML
    void loginFunction(MouseEvent event) {
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


    //adminRegister method allows user to add a new admin user through a choice of either admin or worker
    @FXML
    void adminRegisterBTN(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("adminRegisterUI.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Register New Admin");
        stage.setScene(new Scene(root, 700, 700));
        stage.show();
    }
//adminConfirmRegBTN stores the username and password to the adminCredentials hashmap
    @FXML
    void adminConfirmRegBTN(MouseEvent event) {
        String usernameTF = usernameTextFieldADMIN.getText();
        String passwordTF = passwordTextFieldADMIN.getText();

        adminCredentials.put(usernameTF, passwordTF);
        System.out.println("Admin Added");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registration Successful");
        alert.setHeaderText(null);
        alert.setContentText("Admin has been successfully added!");

        alert.show();
    }

    //adminRegister method allows user to add a new worker user through a choice of either admin or worker
    @FXML
    void workerRegisterBTN(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerRegisterUI.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Register New Worker");
        stage.setScene(new Scene(root, 700, 700));

        stage.show();

    }



    //workerConfirmRegBTN stores the username and password to the workerCredentials hashmap
    @FXML
    void workerConfirmRegBTN(MouseEvent event) {
        String usernameTF = usernameTextFieldWORKER.getText();
        String passwordTF = passwordTextFieldWORKER.getText();

        workerCredentials.put(usernameTF, passwordTF);
        System.out.println("Worker Added");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registration Successful");
        alert.setHeaderText(null);
        alert.setContentText("Worker has been successfully added!");

        alert.show();
    }
//function that allows to choose login method. Either admin or worker
    @FXML
    void adminLoginChoice(MouseEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginAdminOrWorker.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(new Scene(root, 700, 700));
        stage.show();

    }




    @FXML
    void adminConfirmLoginBTN(MouseEvent event) {
            String usernameTF = loginUsernameTF.getText();
            String passwordTF = loginPasswordTF.getText();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setHeaderText(null);
            alert.setContentText("Login successful!");

            if (adminCredentials.containsKey(usernameTF)) {
                if (adminCredentials.get(usernameTF).equals(passwordTF)) {
                    alert.show();
                } else {
                    System.out.println("Wrong Credentials");
                }
            }





        }






    @FXML
    void adminLoginCredentialsCheck(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("adminLoginUI.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(new Scene(root, 700, 700));
        stage.show();
    }



    @FXML
    void workerLoginBTN(MouseEvent event) {





    }







}
