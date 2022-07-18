module com.pertemuan3.pertemuan3_modality {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pertemuan3.pertemuan3_modality to javafx.fxml;
    opens com.pertemuan3.pertemuan3_modality.controller to javafx.fxml;
    opens com.pertemuan3.pertemuan3_modality.model to javafx.fxml;
    exports com.pertemuan3.pertemuan3_modality;
    exports com.pertemuan3.pertemuan3_modality.controller;
    exports com.pertemuan3.pertemuan3_modality.model;
}