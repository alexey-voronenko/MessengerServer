package messenger.Controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import messenger.Model.ChatServer;
import messenger.Model.ClientHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class OnlineUsersController  {
    private static final Logger log = LoggerFactory.getLogger(OnlineUsersController.class);

    @FXML
    private TextArea onlineUsersTextAera;
    @FXML
    private Button okButton;


    @FXML
    private void onOkButtonClick() {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
        log.info("Online Users window was closed");
    }
    @FXML
    private void initialize(){
        for(ClientHandler ch: ChatServer.online){
            onlineUsersTextAera.appendText(ch.getUsername()+'\n');
        }
    }
}
