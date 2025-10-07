module org.mantisph.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mantisph.workshopjavafx to javafx.fxml;
    exports org.mantisph.workshopjavafx;
}