
/*
    Liang, Y.D. (2020). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.), Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Mark Gallagher 2025
*/

    /*
     * Method which allows the user to enter a firstName, lastNAme, course, and grade to collect and list student information.
     * Declaring, creating, and assigning multiple private data types indicating its assigned default values.
     * Start Method which defines the GridPane layout, label fields, and text fields.
     * Declaring, creating, and assigning HBox and VBox for buttons, Text area for output results, and setup stage.
     * Methods to connect buttons, save entry fields, view entry fields, clear entry fields, and create a "grade.csv" file.
     * @return prints the results to the console window.
     */


//Importing builtin JavaFX classes
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

//Importing builtin Java classes
import java.io.*;
import java.nio.file.*;
import java.util.*;


public class GallagherGradeBookApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //Declaring three TextField UI Controls
    private TextField firstNameField, lastNameField, courseField;

    //Declaring one ComboBox with String data field UI control
    private ComboBox<String> gradeComboBox;

    //Declaring one TextField UI controls
    private TextArea resultArea;



    //Creating a method to create a csv file named "grades.csv"
    private static final String FILE_NAME = "grades.csv";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Grade Book Application");

        //Declaring four Label UI controls
        Label firstNameLabel = new Label("First Name:");
        firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name:");
        lastNameField = new TextField();

        Label courseLabel = new Label("Course:");
        courseField = new TextField();

        Label gradeLabel = new Label("Grade:");
        gradeComboBox = new ComboBox<>();
        gradeComboBox.getItems().addAll("A", "B", "C", "D", "F");

        //Declaring two Button UI controls
        Button saveButton = new Button("Save Grade");
        Button clearButton = new Button("Clear Form");
        Button viewButton = new Button("View Grades");

        saveButton.setOnAction(e -> saveGrade());
        clearButton.setOnAction(e -> clearForm());
        viewButton.setOnAction(e -> viewGrades());

        //Creating results output
        resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setPromptText("Results will appear here...");

        //Creating layout display GUI
        GridPane formGrid = new GridPane();
        formGrid.setHgap(10);
        formGrid.setVgap(10);
        formGrid.setPadding(new Insets(15));
        formGrid.add(firstNameLabel, 0, 0);
        formGrid.add(firstNameField, 1, 0);
        formGrid.add(lastNameLabel, 0, 1);
        formGrid.add(lastNameField, 1, 1);
        formGrid.add(courseLabel, 0, 2);
        formGrid.add(courseField, 1, 2);
        formGrid.add(gradeLabel, 0, 3);
        formGrid.add(gradeComboBox, 1, 3);

        //HBox for buttons
        HBox buttonBox = new HBox(15, saveButton, clearButton, viewButton);
        buttonBox.setAlignment(Pos.CENTER);

        //VBox for buttons
        VBox root = new VBox(15, formGrid, buttonBox, resultArea);
        root.setPadding(new Insets(20));

        //Setup scene and stage
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        initializeCSV();
    }

    //Creating a method to add a new entry to the existing "grades.csv" file or throw an error exception
    private void initializeCSV() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                FileWriter writer = new FileWriter(FILE_NAME);
                writer.write("firstName,lastName,course,grade\n");
                writer.close();
            }
        } catch (IOException e) {
            resultArea.setText("Error initializing CSV: " + e.getMessage());
        }
    }

    //Creating a method to save grade information or throw an error exception
    private void saveGrade() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String course = courseField.getText().trim();
        String grade = gradeComboBox.getValue();

        if (firstName.isEmpty() || lastName.isEmpty() || course.isEmpty() || grade == null) {
            resultArea.setText("Please fill out all fields.");
            return;
        }

        Student student = new Student(firstName, lastName, course, grade);

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(String.format("%s,%s,%s,%s\n", firstName, lastName, course, grade));
            resultArea.setText("Saved:\n" + student.toString());
            clearForm();
        } catch (IOException e) {
            resultArea.setText("Error saving grade: " + e.getMessage());
        }
    }

    //Creating a method to clear all fields
    private void clearForm() {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
        resultArea.clear();
    }

    //Creating a method to view the current list of students, courses, and grades or throw an error exception
    private void viewGrades() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            StringBuilder content = new StringBuilder("Saved Grades:\n\n");
            for (int i = 1; i < lines.size(); i++) { // skip header
                String[] data = lines.get(i).split(",");
                if (data.length == 4) {
                    Student s = new Student(data[0], data[1], data[2], data[3]);
                    content.append(s.toString()).append("\n");
                }
            }
            resultArea.setText(content.toString());
        } catch (IOException e) {
            resultArea.setText("Error reading grades: " + e.getMessage());
        }
    }

}