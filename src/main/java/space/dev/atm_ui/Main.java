package space.dev.atm_ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("log.fxml"));
        Scene loginScene = new Scene(fxmlLoader.load(), 392, 482);
        stage.setTitle("Space-Bank");
        stage.setResizable(false);
        stage.setScene(loginScene);
        stage.show();
    }

    public void ToATM(boolean verify, Stage stage) throws IOException{
        if(verify == true)
        {
            FXMLLoader ATMchooseLoad = new FXMLLoader(Main.class.getResource("ATMchoose.fxml"));
            Scene ATM = new Scene(ATMchooseLoad.load(), 564, 343);
            stage.setTitle("Space-Bank");
            stage.setResizable(false);
            stage.setScene(ATM);
            stage.show();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}