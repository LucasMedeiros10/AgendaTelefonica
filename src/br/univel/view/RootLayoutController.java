package br.univel.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RootLayoutController {

    @FXML
    private Label labelID;

    @FXML
    private Label labelNome;

    @FXML
    private Label labelTelefone;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnLimpar;

    @FXML
    private TableView<?> GridRegistros;

    @FXML
    private TableColumn<?, ?> ColunaID;

    @FXML
    private TableColumn<?, ?> ColunaNome;

    @FXML
    private TableColumn<?, ?> ColunaTelefone;

}
