package com.mycompany.javafxestudiantes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {

    @FXML
    private TableColumn<Estudiantes, String> colApellido;

    @FXML
    private TableColumn<Estudiantes, Integer> colEdad;

    @FXML
    private TableColumn<Estudiantes, String> colNombre;

    @FXML
    private Button primaryButton;

    @FXML
    private TableView<Estudiantes> tblEstudiantes;
    
    private ObservableList<Estudiantes> estudiantes;

    @FXML
    private void initialize() {
        // Configurar columnas
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));

        // Crear lista de estudiantes
        estudiantes = FXCollections.observableArrayList();

        // Vincular datos a la tabla
        tblEstudiantes.setItems(estudiantes);
    }
    
    @FXML
    void switchToSecondary(ActionEvent event) {
         
        estudiantes.addAll(
            new Estudiantes("Juan", "Pérez", 20),
            new Estudiantes("Ana", "Gómez", 22),
            new Estudiantes("Luis", "Martínez", 19),
            new Estudiantes("Sofía", "López", 21)
        );
    }  
    
}