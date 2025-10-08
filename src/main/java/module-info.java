module org.mantisph.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.mantisph.workshopjavafx to javafx.fxml;
    opens model.entities to javafx.base;
    exports org.mantisph.workshopjavafx;
}