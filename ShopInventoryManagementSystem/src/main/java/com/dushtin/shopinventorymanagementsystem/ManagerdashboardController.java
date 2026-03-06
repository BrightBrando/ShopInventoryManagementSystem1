package com.dushtin.shopinventorymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class ManagerdashboardController {

    @FXML
    private StackPane centerPane;

    @FXML
    private Button inventoryButton, salesRecordingButton, stockMonitoringButton, reportingButton, logoutButton;

    @FXML
    public void initialize() {
        // Sidebar buttons
        inventoryButton.setOnAction(e -> showInventory());
        salesRecordingButton.setOnAction(e -> showSalesRecording());
        stockMonitoringButton.setOnAction(e -> showStockMonitoring());
        reportingButton.setOnAction(e -> showReporting());

        // Logout button HAHHAHAHAHAHAHAH
        logoutButton.setOnAction(e -> {
            try {
                App.setRoot("login"); 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    // to basically show the table in rightparts
    // ---------- NOTE MUCH BETTER NA YUNG NASA ADMIN, DONT FORGET TO ADD HERE SINCE I FINISH IT THERE FIRST 
    // TECHNICALL NOT FINISH BUT U KNOW WHTA I MEAN ----------//
    
    private void showInventory() {
        centerPane.getChildren().clear();
    TableView<String> table = new TableView<>();
    TableColumn<String, String> prdctidCol = new TableColumn<>("Product ID");
    TableColumn<String, String> nameCol = new TableColumn<>("Product Name");
    TableColumn<String, String> ctgryCol = new TableColumn<>("Category");
    TableColumn<String, String> qtyCol = new TableColumn<>("Quantity");  
    TableColumn<String, String> prcCol = new TableColumn<>("Price");
    

    table.getColumns().addAll(prdctidCol, nameCol, ctgryCol, qtyCol, prcCol );

       

        centerPane.getChildren().add(table);
    }

    private void showSalesRecording() {
        centerPane.getChildren().clear();
        Label label = new Label("Sales Recording Page");
        label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        centerPane.getChildren().add(label);
    }

    private void showStockMonitoring() {
        centerPane.getChildren().clear();
        Label label = new Label("Stock Monitoring Page");
        label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        centerPane.getChildren().add(label);
    }

    private void showReporting() {
        centerPane.getChildren().clear();
        Label label = new Label("Reporting Page");
        label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        centerPane.getChildren().add(label);
    }
}