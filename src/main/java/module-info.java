module sio.tp4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires spring.context;
    requires spring.beans;
    requires spring.data.jpa;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    opens sio.tp4 to javafx.fxml;
    exports sio.tp4;
    exports sio.tp4.controllers;
    opens sio.tp4.controllers to javafx.fxml;
}