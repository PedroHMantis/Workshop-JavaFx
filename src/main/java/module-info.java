module org.mantisph.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mantisph.workshopjavafx to javafx.fxml;
    opens model.entities to javafx.base;
    exports org.mantisph.workshopjavafx;
}