module com.gui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gui to javafx.fxml;
    exports com.gui;
}
