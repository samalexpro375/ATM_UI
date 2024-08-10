package space.dev.atm_ui;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InsertMoneyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button insertMoneyButton;

    @FXML
    private TextField insertmoneyField;

    @FXML
    void initialize() {
        insertMoneyButton.setOnAction(event ->{
            try{
                new DataUser().money += Integer.valueOf(insertmoneyField.getText());
                insertmoneyField.setText("Успешно!");
            }
            catch (Exception e){
                insertmoneyField.setText("Ошибка!");
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
