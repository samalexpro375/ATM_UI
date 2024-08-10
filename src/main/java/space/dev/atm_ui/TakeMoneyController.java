package space.dev.atm_ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TakeMoneyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button takeMoneyButton;

    @FXML
    private TextField takemoneyField;

    @FXML
    void initialize() {
        takeMoneyButton.setOnAction(event ->{
            try{
                new DataUser().money -= Integer.valueOf(takemoneyField.getText());
                takemoneyField.setText("Успешно!");
            }
            catch (Exception e){
                takemoneyField.setText("Ошибка!");
            }
            try (FileWriter fileWriter = new FileWriter(DataUser.filePath)){
                fileWriter.write("" + DataUser.money);
            }
            catch (IOException io)
            {
                System.out.println("Ошибка! " + io.getMessage());
            }
        });
    }

}
