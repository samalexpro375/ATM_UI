package space.dev.atm_ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class CheckMoneyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text moneyText;

    @FXML
    void initialize() {
        moneyText.setText(new DataUser().money + " RUB");
    }


}
