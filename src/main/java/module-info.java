module com.example.dio_project_beer_api {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dio_project_beer_api to javafx.fxml;
    exports com.example.dio_project_beer_api;
}