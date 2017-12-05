package application.Control;

import java.io.IOException;
import com.jfoenix.controls.JFXButton;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller{

	@FXML
	private JFXButton boton;
	
	@FXML
	private JFXButton button;
	@FXML
	private void GetStarted(){
	            try {
	            	FXMLLoader loader = new FXMLLoader();
		            loader.setLocation(Main.class.getResource("vista/FreeSolo.fxml"));
					AnchorPane page = (AnchorPane) loader.load();
					Stage sendStage = new Stage();
		            Scene scene = new Scene(page);
					sendStage.setScene(scene);
					sendStage.initStyle(StageStyle.UNDECORATED);
					sendStage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	@FXML
	private void exit(){
		System.exit(0);
	}
}
