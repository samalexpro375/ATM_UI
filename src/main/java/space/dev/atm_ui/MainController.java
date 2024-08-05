package space.dev.atm_ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

    private DataUser dataUser = new DataUser();
    public Stage ATM_M = new Stage();
    public boolean VerifyUser = false;
    private byte x = 0; //Переменная которая будет подсчитывать действия. Если она равна 2, то VerifyUser будет true.


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button login_b;

    @FXML
    private TextField numcard_user;

    @FXML
    private TextField pin_user;

    @FXML
    void initialize() {
        login_b.setOnAction(event ->{
            if(numcard_user.getText().length() == 19){
                dataUser.GetNumCard(numcard_user.getText());
                x++;
            }
            else{
                numcard_user.setText("Введите заново!");
                x = 0;
                VerifyUser = false;
            }
            if(pin_user.getText().length() == 4){
                dataUser.GetPin(pin_user.getText());
                x++;
            }
            else {
                pin_user.setText("Введите заново!");
                x = 0;
                VerifyUser = false;
            }
            if(x == 2){
                VerifyUser = true;
            }
            if(VerifyUser == false)
            {
                x = 0;
            }
            if (VerifyUser == true)
            {
                try {

                    new Main().ToATM(VerifyUser, ATM_M);
                }
                catch (IOException io)
                {
                    System.out.println("Ошибка!");
                }
            }
            System.out.println(VerifyUser);
            System.out.println(x);
        });
    }

}
