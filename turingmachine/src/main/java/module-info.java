module com.turingmachine.gui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.turingmachine.gui to javafx.fxml;
    exports com.turingmachine.gui;
}
