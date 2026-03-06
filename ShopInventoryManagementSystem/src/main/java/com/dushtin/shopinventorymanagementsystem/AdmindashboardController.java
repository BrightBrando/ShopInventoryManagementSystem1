    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dushtin.shopinventorymanagementsystem;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.DefaultStringConverter;

public class AdmindashboardController {
    
// this finds the id=button in the fxml which is in the admindashboard.fxml and the others thats has an fx:id =""
    @FXML 
    private Button buttonInventory, buttonSalesRecording, buttonStockMonitoring, buttonReporting, logoutButton;
    
    @FXML
    private StackPane Centerpane;
    
// this is the logic
    @FXML
    public void initialize() {
        // to give function for the buttons in the left sidepart
        buttonInventory.setOnAction(e -> showInventory());
        buttonSalesRecording.setOnAction(e -> showSalesRecording());
        buttonStockMonitoring.setOnAction(e -> showStockMonitoring());
        buttonReporting.setOnAction(e -> showReporting());
        logoutButton.setOnAction(e -> {
            try {
                App.setRoot("lOGin"); // itll work with or without strings ince the app.setroot is already in the app.java named login
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
    
    public void showInventory() {
        
    Centerpane.getChildren().clear();
    
    TableView<Product> table = new TableView<>(); // this basically create a table to view that named table like litral
    
    TableColumn<Product, String> prdctidCol = new TableColumn<>("Product Name");
    prdctidCol.setCellValueFactory(new PropertyValueFactory<>("productID"));
    
    TableColumn<Product, String> nameCol = new TableColumn<>("Product Name");
    nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
    
    TableColumn<Product, String> ctgryCol = new TableColumn<>("Category");
    ctgryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
    
    // ---------- commented shit since i havent tried it ---------//
//     ctgryCol.setCellFactory(TextFieldTableCell.forTableColumn(new DefaultStringConverter()));
//     ctgryCol.setOnEditCommit(event -> {
//      Product product = event.getRowValue();
//            product.setCategory(event.getNewValue());
//     });
     
    TableColumn<Product, Integer> qtyCol = new TableColumn<>("Quantity");
    qtyCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
     
    
//       qtyCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
//        qtyCol.setOnEditCommit(event -> {
//            Product product = event.getRowValue();
//            product.setQuantity(event.getNewValue());
//        });
//     
    TableColumn<Product, Double> prcCol = new TableColumn<>("Price");
    prcCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    
    table.getColumns().addAll(prdctidCol, nameCol, ctgryCol, qtyCol, prcCol);
    
    ObservableList<Product> inventory = FXCollections.observableArrayList(
        new Product("P001", "Coca Cola", "Drinks", 50, 20.00),
        new Product("P002", "Lucky Me Pancit", "Instant Noodles", 30, 15.00),
        new Product("P003", "Gardenia Bread", "Bakery", 20, 45.00),
        new Product("P004", "Nescafe Coffee", "Beverage", 40, 10.00)
    );
    
    table.setItems(inventory);
    table.setEditable(true);
    Centerpane.getChildren().add(table);
    }
    


    private void showSalesRecording() {
    Centerpane.getChildren().clear();
    Label label = new Label("Sales Recording Page");
    label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
    Centerpane.getChildren().add(label);
    
    }
    
    private void showStockMonitoring() {
    Centerpane.getChildren().clear();
    Label label = new Label("Stock Monitoring Page");
    label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
    Centerpane.getChildren().add(label);
    
    }
    
    private void showReporting() {
    Centerpane.getChildren().clear();
    Label label = new Label("Sales Reporting Page");
    label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
    Centerpane.getChildren().add(label);
    
    }



    
    
    
}