package com.pertemuan3.pertemuan3_modality.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DiskonController {

    public TextField valueDiscount;

    public String getValueDiscount() {
        return valueDiscount.getText();
    }

    public Button tambahDiscount;
    private Stage stage;

    public void setAdd(AddController add) {
        this.add = add;
    }

    private AddController add;

    public void tambahDiscount(ActionEvent actionEvent){
        float kirim = Float.parseFloat(valueDiscount.getText())/100;
        add.getDiskon().add(kirim);
        add.custom.setText(String.valueOf(kirim));
        tambahDiscount.getScene().getWindow().hide();
    }
}
