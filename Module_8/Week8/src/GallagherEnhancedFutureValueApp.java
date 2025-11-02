

/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to enter a monthly amount, interest rate, and years to calculate teh future value. 
     * Declaring, creating, and assigning eleven private data types indicating its assigned default values.
     * Start Method which defines the GridPane layout, label and text fields, and text color.
     * Declaring, creating, and assigning HBox for buttons, Text area for output results, and setup stage.
     * Methods to connect buttons, clear entry fields, and calculate the Future Value.
     * @return prints the results to the console window
     */


//Importing nine builtin JavaFX classes
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.text.SimpleDateFormat;
import java.util.Date;


public class GallagherEnhancedFutureValueApp extends Application {

    //Declaring two TextField UI controls
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();

    //Declaring one TextArea UI controls
    private TextArea txtResults = new TextArea();

    //Declaring four Label UI controls
    private Label lblMonthlyPayment = new Label("  Monthly Payment:");
    private Label lblInterestRate = new Label("  Interest Rate:");
    private Label lblInterestRateFormat = new Label("  Enter 11.1% as 11.1");
    private Label lblYears = new Label("  Years:");
    private Label lblFutureValueDate = new Label("");

    //Declaring one ComboBox with integer data field UI control
    private ComboBox<Integer> cbYears = new ComboBox<>();

    //Declaring two Button UI controls
    private Button btnClear = new Button("  Clear");
    private Button btnCalculate = new Button("  Calculate");




    @Override
    public void start(Stage primaryStage) {

        //Create GridPane layout
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        //Add labels and text fields
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(txtMonthlyPayment, 1, 0);

        pane.add(lblInterestRate, 0, 1);
        pane.add(txtInterestRate, 1, 1);

        //Interest rate format label
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        //Years ComboBox
        pane.add(lblYears, 0, 3);
        pane.add(cbYears, 1, 3);

        //Add values to ComboBox (1–30 years)
        for (int i = 1; i <= 30; i++) {
            cbYears.getItems().add(i);
        }

        //HBox for buttons
        HBox actionBtnContainer = new HBox(10);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.getChildren().addAll(btnClear, btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        //Future value date label
        pane.add(lblFutureValueDate, 0, 5, 2, 1);

        //Text area for output
        pane.add(txtResults, 0, 6, 2, 1);
        txtResults.setPrefRowCount(5);
        txtResults.setPrefColumnCount(20);

        //Connect buttons to methods
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());

        //Setup scene and stage
        Scene scene = new Scene(pane, 400, 350);
        primaryStage.setTitle("Enhanced Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }




    //Clear all fields
    private void clearFormFields() {
        txtMonthlyPayment.clear();
        txtInterestRate.clear();
        txtResults.clear();
        lblFutureValueDate.setText("");
        cbYears.getSelectionModel().clearSelection();
    }
    
    //Future Value calculation method
    private void calculateResults() {
        try {
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double rate = Double.parseDouble(txtInterestRate.getText());
            Integer years = cbYears.getValue();

            if (years == null) {
                txtResults.setText("Please select the number of years.");
                return;
            }

            double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);

            lblFutureValueDate.setText("Calculation as of " + getTodayDate());
            txtResults.setText(String.format("The future value is $%,.2f", futureValue));

        } catch (NumberFormatException e) {
            txtResults.setText("Please enter valid numbers for payment and interest rate.");
        } catch (Exception e) {
            txtResults.setText("An error occurred: " + e.getMessage());
        }
    }

    //Returns todays date in MM/dd/yyyy format.
    private String getTodayDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(new Date());
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}












