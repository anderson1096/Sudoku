/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ADMIN
 */

    
public class PrincipalController implements Initializable {
    
    @FXML
    private AnchorPane anchor = new AnchorPane();
   
    
    String portada = "sources/fondos/portada2.jpg";
    
    
    @FXML
    private void traditional(ActionEvent event) throws IOException{
        Parent aux = FXMLLoader.load(getClass().getResource("SudokuView.fxml"));
        Scene scene = new Scene(aux); 
        Stage NextStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        NextStage.setScene(scene);
        NextStage.setTitle("Tradicional");
        NextStage.centerOnScreen();
        NextStage.show();
        
    }
    
    @FXML
    private void close(ActionEvent event) throws IOException{
        
        Stage NextStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        NextStage.close();
    }
    
    @FXML
    private void serpent(ActionEvent event) throws IOException{
        Parent aux = FXMLLoader.load(getClass().getResource("SerpentView.fxml"));
        Scene scene = new Scene(aux); 
        Stage NextStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        NextStage.setScene(scene);
        NextStage.setTitle("Serpent");
        NextStage.centerOnScreen();
        NextStage.show();
       
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      anchor.setStyle("-fx-background-image: url('" + portada + "');" /*+ "-fx-background-position: center center; "*/ + "-fx-background-repeat: stretch;");
    }    
    
}
