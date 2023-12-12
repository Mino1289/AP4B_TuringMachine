module com.turingmachine {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.turingmachine to javafx.fxml;
    exports com.turingmachine;
}
