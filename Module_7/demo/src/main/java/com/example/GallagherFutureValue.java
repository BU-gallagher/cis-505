package com.example;
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to enter a unique id, name, and genre for music composers. 
     * Declaring, creating, and assigning three private data types indicating its assigned default values.
     * Declaring the no-argument constructor using the default value declare by the problem. 
     * Declaring the accessor and mutator methods for the three data fields.
     * @return prints the results to the console window
     * toString method that allows users to use default values or provide new values for specifications transaction expenses.
     */


//Importing seven builtin JavaFX classes
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class GallagherFutureValue extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //Declaring two TextField UI controls
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();

    //Declaring one TextArea UI controls
    private TextArea txtResults = new TextArea();

    //Declaring four Label UI controls
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");

    //Declaring one ComboBox with integer data field UI control
    private ComboBox<Integer> cboYears = new ComboBox<>();

    //Declaring two Button UI controls
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");


    @Override
    public void start(Stage primaryStage) {
        
        // Create GridPane layout
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Add labels and text fields
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(txtMonthlyPayment, 1, 0);

        pane.add(lblInterestRate, 0, 1);
        pane.add(txtInterestRate, 1, 1);

        //Interest rate format label set to red colored text
        lblInterestRateFormat.setTextFill(Color.RED); //Set the font color of the interest rate instructions to red
        pane.add(lblInterestRateFormat, 1, 2);//Add the label to the grid pane
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); //Position the label to the right of the pane

        // Years ComboBox
        pane.add(lblYears, 0, 3);
        pane.add(cboYears, 1, 3);

        // Add values to ComboBox
        for (int i = 1; i <= 30; i++) {
            cboYears.getItems().add(i);
        }
    

        //HBox for buttons
        HBox actionBtnContainer = new HBox(); //Create a new HBox container
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)); //Set the containers padding
        actionBtnContainer.setSpacing(10); //Set the containers spacing
        actionBtnContainer.getChildren().add(btnClear); //Add btnClear to the container
        actionBtnContainer.getChildren().add(btnCalculate); //Add the btnCalculate to the container
        pane.add(actionBtnContainer, 1, 4); //Add teh container to the GridPanel
    
        // Text area for output
        pane.add(txtResults, 0, 5, 2, 1);
        txtResults.setPrefRowCount(5);
        txtResults.setPrefColumnCount(20);

        // Setup stage
        Scene scene = new Scene(pane, 350, 300);
        primaryStage.setTitle("GallagherFuture Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Future Value calculation method
    private void calculateFutureValue() {
        try {
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double annualInterestRate = Double.parseDouble(txtInterestRate.getText());
            int years = cboYears.getValue();

            double monthlyInterestRate = annualInterestRate / 100 / 12;
            int months = years * 12;

            double futureValue = monthlyPayment * (Math.pow(1 + monthlyInterestRate, months) - 1) / monthlyInterestRate;

            txtResults.setText(String.format(
                "Monthly Payment: $%,.2f%n" +
                "Interest Rate: %.2f%%%n" +
                "Years: %d%n" +
                "Future Value: $%,.2f",
                monthlyPayment, annualInterestRate, years, futureValue));

        } catch (NumberFormatException ex) {
        txtResults.setText("Error: Please enter valid numbers.");
        } catch (NullPointerException ex) {
        txtResults.setText("Error: Please select a year value.");
        }
    }

    // Clear all fields
    private void clearFields() {
        txtMonthlyPayment.clear();
        txtInterestRate.clear();
        cboYears.setValue(null);
        txtResults.clear();
}
}












