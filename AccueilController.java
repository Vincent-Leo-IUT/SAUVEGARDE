package fr.univ_amu.iut;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AccueilController extends GridPane implements Initializable {
    @FXML
    private GridPane Grid;

    @FXML
    private Rectangle menu;

    @FXML
    private Rectangle banniere;

    @FXML
    private Text banniereText;

    @FXML
    private Text connexion;

    @FXML
    private Text menu1;

    @FXML
    private Text menu2;

    @FXML
    private Text menu3;

    @FXML
    private Text menu4;

    @FXML
    private Text menu5;

    @FXML
    private Text menu6;

    public AccueilController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AccueilView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
