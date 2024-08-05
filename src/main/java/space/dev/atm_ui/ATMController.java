package space.dev.atm_ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ATMController {
    public Stage checkMoneyS = new Stage();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button checkMoney;

    @FXML
    private Button insertMoney;

    @FXML
    private Button quitATM;

    @FXML
    private Button takeMoney;

    @FXML
    void initialize() {
        checkMoney.setOnAction(event -> {
            try {

                new Main().ToCheckMoney(checkMoneyS);
            }
            catch (IOException io)
            {
                System.out.println("Ошибка!");
            }
        });
        quitATM.setOnAction(event ->{
            System.exit(0);
        });
    }

}
