module edu.bellevue {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.bellevue to javafx.fxml;
    exports edu.bellevue;
}
