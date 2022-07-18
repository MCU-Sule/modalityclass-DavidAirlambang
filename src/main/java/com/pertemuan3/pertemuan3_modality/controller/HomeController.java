package com.pertemuan3.pertemuan3_modality.controller;

import com.pertemuan3.pertemuan3_modality.HelloApplication;
import com.pertemuan3.pertemuan3_modality.model.Coffee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Comparator;

public class HomeController {

    private Stage stage;
    public ListView menuList;
    public Button addButton;
    private ObservableList<Coffee> makanan;
//    private Comparator<Coffee> comparator;

    public ObservableList<Coffee> getMakanan() {
        return makanan;
    }

    public void initialize(){
        stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);

        makanan = FXCollections.observableArrayList(
                new Coffee("espresso",20000,0.0F),
                new Coffee("espresso",40000,0.1F)
        );
        menuList.setItems(makanan);
    }

    public void add(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        if(stage.getOwner() == null) {
            stage.initOwner(addButton.getScene().getWindow());
        }
        AddController tambah = fxmlLoader.getController();
        tambah.setHome(this);

        stage.setScene(scene);
        stage.show();
    }
}
