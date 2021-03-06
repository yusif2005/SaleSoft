package com.salesoft;

import com.salesoft.util.MyFXMLLoader;
import com.salesoft.util.*;
import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * MainApp - Proqramin Esas main olan Class-i dir butun proqram burdan bashlayir
 *
 * @author Ramin
 */
public class MainApp extends Application {

    public MainApp() {

        // ilk Hazirliqlarimizi Inicializasiyamizi edek
        // qovluqlarimizi yoxlayaq her shey yolundadirmi deye
        //1-ci Fayl ve Qovluqlarimizi Hazirlayaq
        Initializator.initFoldersAndFiles();

        //2 - ci ise Properties Fayllarimizi hazirlayaq, artiq emin ola bilerik ki FileNotFoundException CIXMAYACAQ
        Initializator.initMyProperties();

        //3-cu olaraq ise, S
        // Server ile elaqe Qurmaga Calishaq, 
        // Sonuludurse Bildirek, 
        // Melumat bazasinin qurulu olub olmadigini yoxlayaq ve deyilse QURUR
        Initializator.initDataBase();

    }

    //Consolumuzu Fayla yazmaq ucun bu obyektden istifade edeceyik
    //PrintStream out = RLogger.logConsoleToFile();
    private static Stage primaryStage;

    //bunu static eledimki obiri classlardan bunu ala bilim
    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    @Override
    public void start(Stage primaryStage) {
        MainApp.primaryStage = primaryStage;

        //ALL_PROPERTIES = AllPropertiesGetDAO.getAllProperties();
        String loginViewTitle = MyProperties.getUIProperties().getApplicationTitle();

        /**
         * Login Sehifemizin URL addressi
         */
        URL loginViewURL = MyProperties.getURLProperties().getLoginFxmlURL();

        /**
         * Login Sehifemizin Scene obyekti
         */
        Scene loginViewScene = MyFXMLLoader.getSceneFromURL(loginViewURL);

        primaryStage.setScene(loginViewScene);

        primaryStage.setTitle(loginViewTitle);

        primaryStage.getIcons().add(new Image("com/salesoft/image/icon.png"));
        primaryStage.setMaximized(false);
        primaryStage.setMinHeight(500.0);
        primaryStage.setMinWidth(850.0);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
