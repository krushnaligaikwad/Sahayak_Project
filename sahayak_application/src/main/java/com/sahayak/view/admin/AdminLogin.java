package com.sahayak.view.admin;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdminLogin extends Application {

    @Override
    public void start(Stage stage) {

        HBox root = new HBox();

        root.setPrefSize(1280, 800);

        root.setStyle(
                "-fx-background-color: #F8FAFC;" +
                "-fx-font-family: 'Poppins', 'Segoe UI', 'Arial';"
        );

        VBox leftPanel = new VBox();

        leftPanel.setPrefWidth(550);
        leftPanel.setMinWidth(512);
        leftPanel.setMaxWidth(575);

        leftPanel.setAlignment(Pos.TOP_CENTER);
        leftPanel.setSpacing(20);

        leftPanel.setStyle(
                "-fx-background-color: linear-gradient(" +
                "to bottom right, #1E3A8A, #1B3277);" +
                "-fx-padding: 56 48 40 48;"
        );

        VBox logoBox = new VBox();

        logoBox.setAlignment(Pos.CENTER);
        logoBox.setPrefHeight(90);

        
        Image logoImage = new Image("assests\\icons\\logo.png");

        ImageView logo = new ImageView(logoImage);
        logo.setFitWidth(68);
        logo.setFitHeight(68);
        logo.setPreserveRatio(true);
        logo.setSmooth(true);

        logoBox.getChildren().add(logo);


        Label appName = new Label("Sahayak");

        appName.setStyle(
                "-fx-text-fill: #FFFFFF;" +
                "-fx-font-size: 34px;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 18 0 0 0;"
        );

        Label tagline = new Label(
                "Empowering migrants with accessible services opportunities and support."
        );

        tagline.setWrapText(true);
        tagline.setMaxWidth(380);
        tagline.setAlignment(Pos.CENTER);

        tagline.setStyle(
                "-fx-text-fill: #BFDBFE;" +
                "-fx-font-size: 14px;" +
                "-fx-font-style: italic;" +
                "-fx-padding: 8 0 30 0;"
        );

        Label portalHeading =
                new Label("Admin Portal");

        portalHeading.setStyle(
                "-fx-text-fill: #FFFFFF;" +
                "-fx-font-size: 34px;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 0 0 14 0;"
        );

        Label description = new Label(
                "Securely manage users, services, jobs, " +
                "applications and administrative operations " +
                "from one centralized portal."
        );

        description.setWrapText(true);
        description.setMaxWidth(380);
        description.setAlignment(Pos.CENTER);

        description.setStyle(
                "-fx-text-fill: #D6E4FA;" +
                "-fx-font-size: 13.5px;" +
                "-fx-padding: 0 0 40 0;"
        );

       
        leftPanel.getChildren().addAll(
                logoBox,
                appName,
                tagline,
                portalHeading,
                description
        );


        VBox rightPanel = new VBox();

        rightPanel.setAlignment(Pos.TOP_CENTER);

        rightPanel.setStyle(
                "-fx-background-color: #F8FAFC;" +
                "-fx-padding: 40;"
        );

        HBox.setHgrow(
                rightPanel,
                Priority.ALWAYS
        );

        VBox loginCard = new VBox();

        loginCard.setPrefWidth(560);
        loginCard.setMaxWidth(560);

        loginCard.setAlignment(Pos.TOP_CENTER);
        loginCard.setSpacing(0);

        loginCard.setStyle(
                "-fx-background-color: #FFFFFF;" +
                "-fx-background-radius: 16;" +
                "-fx-padding: 40;" +
                "-fx-effect: dropshadow(" +
                "gaussian, rgba(15,23,42,0.14), " +
                "28, 0, 0, 10);"
        );


        Label heading =
                new Label("Admin Login");

        heading.setStyle(
                "-fx-text-fill: #0F172A;" +
                "-fx-font-size: 28px;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 18 0 4 0;"
        );

    
        Label subtitle =
                new Label(
                        "Sign in to access the Sahayak " +
                        "administration portal"
                );

        subtitle.setStyle(
                "-fx-text-fill: #64748B;" +
                "-fx-font-size: 14px;" +
                "-fx-padding: 0 0 28 0;"
        );

        Label usernameLabel =
                new Label("Username / Email");

        usernameLabel.setStyle(
                "-fx-text-fill: #0F172A;" +
                "-fx-font-size: 14px;" +
                "-fx-font-weight: bold;"
        );


        TextField username =
                new TextField();

        username.setPromptText(
                "Enter your username or email"
        );

        username.setStyle(
                "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;" +
                "-fx-padding: 8 4 8 0;" +
                "-fx-font-size: 15px;" +
                "-fx-text-fill: #0F172A;"
        );

        HBox.setHgrow(
                username,
                Priority.ALWAYS
        );

        HBox usernameBox = new HBox();

        usernameBox.setAlignment(
                Pos.CENTER_LEFT
        );

        usernameBox.setMinHeight(46);

        usernameBox.setStyle(
                "-fx-background-color: #F8FAFC;" +
                "-fx-border-color: #E2E8F0;" +
                "-fx-border-width: 1.4;" +
                "-fx-background-radius: 10;" +
                "-fx-border-radius: 10;" +
                "-fx-padding: 4 10 4 12;" +
                "-fx-margin: 6 0 0 0;"
        );

        usernameBox.getChildren().addAll(
                username
        );

        Label passwordLabel =
                new Label("Password");

        passwordLabel.setStyle(
                "-fx-text-fill: #0F172A;" +
                "-fx-font-size: 14px;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 18 0 0 0;"
        );


        PasswordField password =
                new PasswordField();

        password.setPromptText(
                "Enter your password"
        );

        password.setStyle(
                "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;" +
                "-fx-padding: 8 4 8 0;" +
                "-fx-font-size: 15px;" +
                "-fx-text-fill: #0F172A;"
        );

        HBox.setHgrow(
                password,
                Priority.ALWAYS
        );

        Button showPassword =
                new Button("Show");

        showPassword.setStyle(
                "-fx-background-color: transparent;" +
                "-fx-text-fill: #2563EB;" +
                "-fx-font-size: 12.5px;" +
                "-fx-font-weight: bold;" +
                "-fx-border-color: transparent;"
        );

        HBox passwordBox = new HBox();

        passwordBox.setAlignment(
                Pos.CENTER_LEFT
        );

        passwordBox.setMinHeight(46);

        passwordBox.setStyle(
                "-fx-background-color: #F8FAFC;" +
                "-fx-border-color: #E2E8F0;" +
                "-fx-border-width: 1.4;" +
                "-fx-background-radius: 10;" +
                "-fx-border-radius: 10;" +
                "-fx-padding: 4 10 4 12;" +
                "-fx-margin: 6 0 0 0;"
        );

        passwordBox.getChildren().addAll(
                password,
                showPassword
        );


        CheckBox remember =
                new CheckBox("Remember me");

        remember.setStyle(
                "-fx-text-fill: #0F172A;" +
                "-fx-font-size: 13.5px;"
        );

        Hyperlink forgot =
                new Hyperlink("Forgot Password?");

        forgot.setStyle(
                "-fx-text-fill: #2563EB;" +
                "-fx-font-size: 13.5px;" +
                "-fx-font-weight: bold;" +
                "-fx-border-color: transparent;" +
                "-fx-padding: 0;"
        );

        Label space = new Label(
                "                    "
        );

        HBox options = new HBox();

        options.setAlignment(
                Pos.CENTER_LEFT
        );

        options.setMinHeight(30);

        options.setStyle(
                "-fx-padding: 14 0 10 0;"
        );

        options.getChildren().addAll(
                remember,
                space,
                forgot
        );

        Label loginError =
                new Label();

        loginError.setWrapText(true);

        loginError.setVisible(false);
        loginError.setManaged(false);

        loginError.setStyle(
                "-fx-text-fill: #DC2626;" +
                "-fx-background-color: #FEF2F2;" +
                "-fx-background-radius: 8;" +
                "-fx-padding: 10 12;" +
                "-fx-font-size: 12px;"
        );

        Button loginButton =
                new Button("Login");

        loginButton.setMaxWidth(
                Double.MAX_VALUE
        );

        loginButton.setMinHeight(48);
        loginButton.setPrefHeight(48);

        loginButton.setDefaultButton(true);

        loginButton.setStyle(
                "-fx-background-color: #2563EB;" +
                "-fx-text-fill: #FFFFFF;" +
                "-fx-font-size: 16px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 10;" +
                "-fx-border-radius: 10;" +
                "-fx-cursor: hand;"
        );


        Label separator =
                new Label("OR");

        separator.setStyle(
                "-fx-text-fill: #64748B;" +
                "-fx-font-size: 12.5px;" +
                "-fx-padding: 20 0;"
        );

        Button backButton =
                new Button("Back to Home");

        backButton.setMaxWidth(
                Double.MAX_VALUE
        );

        backButton.setMinHeight(48);
        backButton.setPrefHeight(48);

        backButton.setStyle(
                "-fx-background-color: #FFFFFF;" +
                "-fx-text-fill: #2563EB;" +
                "-fx-border-color: #2563EB;" +
                "-fx-border-width: 1.6;" +
                "-fx-background-radius: 10;" +
                "-fx-border-radius: 10;" +
                "-fx-font-size: 15px;" +
                "-fx-font-weight: bold;" +
                "-fx-cursor: hand;"
        );


        Label footer =
                new Label(
                        "Authorized administrators only. " +
                        "All activities are monitored for security."
                );

        footer.setWrapText(true);
        footer.setMaxWidth(450);
        footer.setAlignment(Pos.CENTER);

        footer.setStyle(
                "-fx-text-fill: #64748B;" +
                "-fx-font-size: 12px;" +
                "-fx-padding: 26 0 0 0;"
        );


        loginCard.getChildren().addAll(
                heading,
                subtitle,
                usernameLabel,
                usernameBox,
                passwordLabel,
                passwordBox,
                options,
                loginError,
                loginButton,
                separator,
                backButton,
                footer
        );


        rightPanel.getChildren().add(
                loginCard
        );


        root.getChildren().addAll(
                leftPanel,
                rightPanel
        );


        Scene scene =
                new Scene(root, 1280, 800);

        stage.setTitle(
                "Sahayak Application"
        );

        stage.setScene(scene);
        stage.show();
    }

    
}
