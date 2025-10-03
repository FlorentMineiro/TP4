package sio.tp4.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TP1Controller implements Initializable {

    @javafx.fxml.FXML
    private TableColumn tcNomSecteur;
    @javafx.fxml.FXML
    private TableView tvRayons;
    @javafx.fxml.FXML
    private TableView tvEmployesRayon;
    @javafx.fxml.FXML
    private TableColumn tcNumeroEmployeAll;
    @javafx.fxml.FXML
    private TableView tvEmployesAll;
    @javafx.fxml.FXML
    private TableColumn tcDateEmployeRayon;
    @javafx.fxml.FXML
    private TableColumn tcNumeroRayon;
    @javafx.fxml.FXML
    private TableColumn tcNumeroEmployeRayon;
    @javafx.fxml.FXML
    private TableColumn tcNomRayon;
    @javafx.fxml.FXML
    private DatePicker dpDate;
    @javafx.fxml.FXML
    private TextField txtTotalRayon;
    @javafx.fxml.FXML
    private TextField txtTotalSecteur;
    @javafx.fxml.FXML
    private Button btnAjouter;
    @javafx.fxml.FXML
    private TableView tvSecteurs;
    @javafx.fxml.FXML
    private TextField txtNbHeures;
    @javafx.fxml.FXML
    private TableColumn tcNomEmployeAll;
    @javafx.fxml.FXML
    private TableColumn tcNomEmployeRayon;
    @javafx.fxml.FXML
    private TableColumn tcHeureEmployeRayon;
    @javafx.fxml.FXML
    private TableColumn tcNumeroSecteur;

    @javafx.fxml.FXML
    public void tvSecteursClicked(Event event) {
    }

    @javafx.fxml.FXML
    public void tvRayonsClicked(Event event) {
    }

    @javafx.fxml.FXML
    public void btnAjouterAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}