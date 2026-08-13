package com.sahayak.view.admin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminDashboard extends Application{

    @Override
    public void start(Stage stage) throws Exception {
       
        VBox sidebar = new VBox();

        sidebar.setPrefWidth(293);
        sidebar.setMinWidth(293);
        sidebar.setMaxWidth(293);
        sidebar.setStyle("-fx-background-color: #003B3B;");
        sidebar.setAlignment(Pos.TOP_LEFT);
        sidebar.setPadding(new Insets(28, 14, 20, 14));

        Image logoImage = new Image("assests\\icons\\logo.png");
        ImageView logoView = new ImageView(logoImage);
        logoView.setFitWidth(28);
        logoView.setFitHeight(28);
        logoView.setPreserveRatio(true);

        HBox logBox = new HBox(5);
        logBox.setSpacing(5);
        
        VBox logoText = new VBox();
        logoText.setSpacing(2);

        Label logoTitle = new Label("Sahayak");
        logoTitle.setStyle("-fx-font-size: 22px;" +"-fx-font-weight: bold;" +"-fx-text-fill: white;");
        Label logoSubtitle = new Label("Work.Stay.Support");
        logoSubtitle.setStyle("-fx-font-size: 14px;" +"-fx-text-fill: #B8CCCC;");

        logoText.getChildren().addAll(logoTitle,logoSubtitle);
        logBox.getChildren().addAll(logoView,logoText);

        ListView<String> menuList = new ListView<>();
        menuList.getItems().addAll("Dashboard",
            "Verify Jobs",
            "Verify Properties",
            "Users & Accounts",
            "Local Services",
            "Reports"
        );

        menuList.setPrefHeight(400);
        menuList.setMaxWidth(Double.MAX_VALUE);
        menuList.setFocusTraversable(false);
        menuList.setStyle("-fx-background-color: transparent;" +"-fx-border-color: transparent;" +"-fx-padding: 0;");

        menuList.setCellFactory(list -> new ListCell<String>() {

    {
        setPrefHeight(52);
        setMaxWidth(Double.MAX_VALUE);

        setStyle(
            "-fx-background-color: transparent;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 17px;" +
            "-fx-padding: 0 16 0 16;"
        );
    }

    @Override
    protected void updateItem(String item, boolean empty) {

        super.updateItem(item, empty);

        if (empty || item == null) {

            setText(null);

            setStyle(
                "-fx-background-color: transparent;"
            );

        } else {

            setText(item);

            setStyle(
                "-fx-background-color: transparent;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 17px;" +
                "-fx-padding: 0 16 0 16;" +
                "-fx-background-radius: 14;"
            );

            if (getIndex() == 0) {

                setStyle(
                    "-fx-background-color: #F9A825;" +
                    "-fx-text-fill: #0F1720;" +
                    "-fx-font-size: 17px;" +
                    "-fx-padding: 0 16 0 16;" +
                    "-fx-background-radius: 14;"
                );
            }
        }
    }
});


menuList.setOnMouseClicked(event -> {

    int index = menuList.getSelectionModel().getSelectedIndex();

    switch (index) {

        case 0 -> System.out.println("Dashboard");

        case 1 -> System.out.println("Verify Jobs");

        case 2 -> System.out.println("Verify Properties");

        case 3 -> System.out.println("Users & Accounts");

        case 4 -> System.out.println("Local Services");

        case 5 -> System.out.println("Reports");
    }
});



Region sidebarSpacer = new Region();

VBox.setVgrow(sidebarSpacer, Priority.ALWAYS);

ListView<String> bottomList = new ListView<>();

bottomList.getItems().addAll(
    "Help & Support",
    "Logout"
);

bottomList.setPrefHeight(110);
bottomList.setFocusTraversable(false);

bottomList.setStyle(
    "-fx-background-color: transparent;" +
    "-fx-border-color: transparent;" +
    "-fx-padding: 0;"
);

bottomList.setCellFactory(list -> new ListCell<String>() {

    {
        setPrefHeight(52);

        setStyle(
            "-fx-background-color: transparent;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 17px;" +
            "-fx-padding: 0 16 0 16;"
        );
    }
     @Override
    protected void updateItem(String item, boolean empty) {

        super.updateItem(item, empty);

        if (empty || item == null) {

            setText(null);

            setStyle(
                "-fx-background-color: transparent;"
            );

        } else {

            setText(item);

            setStyle(
                "-fx-background-color: transparent;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 17px;" +
                "-fx-padding: 0 16 0 16;"
            );
        }
    }
});

Separator separator = new Separator();

separator.setStyle(
    "-fx-background-color: #185555;"
);

sidebar.getChildren().addAll(
    logBox,
    menuList,
    sidebarSpacer,
    separator,
    bottomList
);


        HBox topBar = new HBox();

        topBar.setPrefHeight(75);
        topBar.setAlignment(Pos.CENTER_LEFT);
        topBar.setPadding(new Insets(0, 30, 0, 36));
        topBar.setStyle(
        "-fx-background-color: #FFFFFF;" +
        "-fx-border-color: #D9E2E2;" +
        "-fx-border-width: 0 0 1 0;");

        Label pageTitle = new Label("Sahayak - Your Companion for Work, Stay & a Better Start");
        pageTitle.setStyle("-fx-font-size: 20px;" +"-fx-font-weight: bold;" +"-fx-text-fill: #0F1720;");

        Region topSpacer = new Region();
        HBox.setHgrow(topSpacer,Priority.ALWAYS);
        Button notificationButton = new Button("♧");

        notificationButton.setPrefSize(48, 48);
        notificationButton.setMinSize(48, 48);
        notificationButton.setMaxSize(48, 48);

        notificationButton.setStyle("-fx-background-color: #FFFFFF;" +"-fx-border-color: #D9E2E2;" +"-fx-border-width: 1;" +"-fx-border-radius: 14;" +
        "-fx-background-radius: 14;" +"-fx-font-size: 24px;" +"-fx-text-fill: #0F1720;");

        Label notificationCount = new Label("");

        notificationCount.setPrefSize(21, 21);
        notificationCount.setMinSize(21, 21);
        notificationCount.setMaxSize(21, 21);

        notificationCount.setAlignment(Pos.CENTER);
        notificationCount.setStyle("-fx-background-color: #D32F2F;" +"-fx-background-radius: 50%;" +"-fx-text-fill: white;" 
        +"-fx-font-size: 12px;" +"-fx-font-weight: bold;");

        StackPane notificationBox = new StackPane();

        notificationBox.setPrefSize(46, 46);

        notificationBox.getChildren().addAll(
        notificationButton,
        notificationCount);
        StackPane.setAlignment(notificationCount,Pos.TOP_RIGHT);

        VBox adminInfo = new VBox(2);

        adminInfo.setAlignment(Pos.CENTER_RIGHT);
        adminInfo.setSpacing(2);

        Label adminName = new Label("Administrator");
        adminName.setStyle("-fx-font-size: 16px;" +"-fx-font-weight: bold;" +"-fx-text-fill: #0F1720;");

        Label adminRole = new Label("Sahayak Control Desk");

        adminRole.setStyle("-fx-font-size: 14px;" +"-fx-text-fill: #64748B;");

        adminInfo.getChildren().addAll(adminName,adminRole);

        topBar.getChildren().addAll(pageTitle,topSpacer,notificationBox,adminInfo);



        VBox mainContent = new VBox();

        mainContent.setSpacing(28);
        mainContent.setPadding(new Insets(34, 36, 40, 36));
        mainContent.setStyle("-fx-background-color: #F8FAFC;");

        VBox welcomeCard = new VBox();

        welcomeCard.setSpacing(10);
        welcomeCard.setPadding(new Insets(28, 30, 28, 30));
        welcomeCard.setStyle("-fx-background-color: #FFFFFF;" 
        +"-fx-border-color: #D9E2E2;"
        +"-fx-border-radius: 18;" 
        +"-fx-background-radius: 18;");

        Label title = new Label("Administrator control desk");
        title.setStyle(
        "-fx-font-size: 29px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: #0F1720;");

        Label subtitle = new Label("Nothing reaches migrants until you approve it. Clear the pending queues first.");
        subtitle.setStyle(
        "-fx-font-size: 17px;" +
        "-fx-text-fill: #64748B;");

        welcomeCard.getChildren().addAll(title,subtitle);
        
        HBox statsBox = new HBox(5);

        Text titlecard1 = new Text("Registered migrants");
        VBox card1 = new VBox(titlecard1);
        card1.setStyle("-fx-background-color: white; -fx-background-radius: 12;-fx-padding: 20; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.06), 8, 0, 0, 2);");

        Text titlecard2 = new Text("Employers");
        VBox card2 = new VBox(titlecard2);
        card2.setStyle("-fx-background-color: white; -fx-background-radius: 12;-fx-padding: 20; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.06), 8, 0, 0, 2);");

        Text titlecard3 = new Text("Providers");
        VBox card3 = new VBox(titlecard3);
        card3.setStyle("-fx-background-color: white; -fx-background-radius: 12;-fx-padding: 20; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.06), 8, 0, 0, 2);");

        Text titlecard4 = new Text("Pending approvals");
        VBox card4 = new VBox(titlecard4);
        card4.setStyle("-fx-background-color: white; -fx-background-radius: 12;-fx-padding: 20; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.06), 8, 0, 0, 2);");





        statsBox.getChildren().addAll(card1,card2,card3,card4);

        mainContent.getChildren().addAll(welcomeCard,statsBox);

        
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #F8FAFC;");
        root.setLeft(sidebar);
        root.setTop(topBar);
        root.setCenter(mainContent);
        
        Scene scene = new Scene(root, 1280, 800);

        stage.setTitle("Sahayak Application" );
        stage.setScene(scene);
        stage.show();

    }
    
}
