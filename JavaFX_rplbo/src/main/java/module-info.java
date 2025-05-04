module id.ac.ukdw.www.rpblo.javafx_rplbo {
    requires javafx.controls;
    requires javafx.fxml;


    opens id.ac.ukdw.www.rpblo.javafx_rplbo to javafx.fxml;
    exports id.ac.ukdw.www.rpblo.javafx_rplbo;
}