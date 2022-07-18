package com.pertemuan3.pertemuan3_modality.controller;

import com.pertemuan3.pertemuan3_modality.HelloApplication;
import com.pertemuan3.pertemuan3_modality.model.Coffee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AddController {
    public TextField namaMenu;
    public TextField hargaMenu;
    public ComboBox discount;
    public Button custom;
    public Button addMenu;
    private Stage stage;

    public ObservableList<Float> getDiskon() {
        return diskon;
    }

    private ObservableList<Float> diskon;

    public void setHome(HomeController home) {
        this.home = home;
    }

    private HomeController home;

    public void initialize(){
        stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        diskon = FXCollections.observableArrayList(
                0.0F,0.1F,0.2F,0.3F,0.4F,0.5F,0.6F,0.7F,0.8F,0.9F);
        discount.setItems(diskon);
    }

    public void addMenu(ActionEvent actionEvent) {
        float potongan = 0.0F;
        String nama = namaMenu.getText();
        float harga = Float.parseFloat((hargaMenu.getText()));
            if(custom.getText() == null) {
                potongan = (float) discount.getValue();
            } else {
                potongan = Float.parseFloat(custom.getText());
            }
        home.getMakanan().add(new Coffee(nama, harga, potongan));
        addMenu.getScene().getWindow().hide();
        System.out.println(potongan);
        System.out.println(harga);
        System.out.println(custom.getText());
    }

    public void addCustom(ActionEvent actionEvent) throws IOException {
        if (stage.getOwner()==null) {
            stage.initOwner(namaMenu.getScene().getWindow());
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("diskon.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        DiskonController diskonnya = fxmlLoader.getController();
        diskonnya.setAdd(this);

        stage.setScene(scene);
        stage.show();
    }
}
