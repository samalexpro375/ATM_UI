module space.dev.atm_ui {
    requires javafx.controls;
    requires javafx.fxml;


    opens space.dev.atm_ui to javafx.fxml;
    exports space.dev.atm_ui;
}