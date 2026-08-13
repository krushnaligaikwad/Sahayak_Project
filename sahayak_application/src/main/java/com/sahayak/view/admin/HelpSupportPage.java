package com.sahayak.view.admin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelpSupportPage extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);
        root.setSpacing(0);
        root.setStyle(
            "-fx-background-color: #FAF9F4;"
        );

         VBox content = new VBox();
        content.setPrefWidth(976);
        content.setMaxWidth(976);
        content.setSpacing(0);
        content.setPadding(new Insets(55, 0, 50, 0));

        HBox backBox = new HBox();
        backBox.setAlignment(Pos.CENTER_LEFT);
        backBox.setPrefHeight(30);

        Button backButton = new Button("<- Back to home");

        backButton.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-text-fill: #006B6B;" +
            "-fx-font-size: 16px;" +
            "-fx-font-family: 'Arial';" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;" +
            "-fx-padding: 0;"
        );

        backButton.setOnAction(e -> {
            System.out.println("Back to Home clicked");
        });

        backBox.getChildren().add(backButton);

        HBox titleBox = new HBox();
        titleBox.setAlignment(Pos.CENTER_LEFT);
        titleBox.setSpacing(15);
        titleBox.setPadding(new Insets(35, 0, 5, 0));

       
        Label title = new Label("Help & Support");

        title.setStyle(
            "-fx-text-fill: #071D26;" +
            "-fx-font-size: 34px;" +
            "-fx-font-family: 'Arial';" +
            "-fx-font-weight: bold;"
        );

        titleBox.getChildren().addAll( title);

        Label description = new Label(
            "Simple answers for common tasks. If you are stuck, call or write to us" +
            "support is available in English, Hindi and Marathi."
        );

        description.setWrapText(true);
        description.setStyle(
            "-fx-text-fill: #506779;" +
            "-fx-font-size: 17px;" +
            "-fx-font-family: 'Arial';"
        );

        description.setPadding(new Insets(0, 0, 38, 0));

         HBox contactBox = new HBox();
        contactBox.setAlignment(Pos.CENTER);
        contactBox.setSpacing(18);

        // Helpline
        VBox helplineCard = createContactCard(
            "Helpline",
            "1800 233 4455 (9 AM - 8 PM)"
        );

        // Email
        VBox emailCard = createContactCard(
            "Email",
            "support@sahayak.in"
        );

        // Walk-in
        VBox walkInCard = createContactCard(
            "Walk-in desk",
            "Sahayak Kendra, Pune & Nashik"
        );

        contactBox.getChildren().addAll(
            helplineCard,
            emailCard,
            walkInCard
        );

        VBox faqBox = new VBox();
        faqBox.setSpacing(14);
        faqBox.setPadding(new Insets(38, 0, 0, 0));

        // FAQ 1
        VBox faq1 = createFAQ(
            "How do I apply for a job?",
            "Open the Jobs section from your dashboard, select a suitable job, " +
            "check the job details and click Apply. Make sure your profile and " +
            "required documents are complete before applying."
        );

        // FAQ 2
        VBox faq2 = createFAQ(
            "Why can I not see a job I heard about?",
            "Jobs may not appear if they have expired, are not yet verified, " +
            "or are available only for a specific location or skill category."
        );

        // FAQ 3
        VBox faq3 = createFAQ(
            "My document was rejected. What now?",
            "Check the rejection reason shown in your profile. Upload a clear, " +
            "valid document again and make sure all required information is visible."
        );

         // FAQ 4
        VBox faq4 = createFAQ(
            "How do I contact a room owner?",
            "Open the Rooms section, select the room you are interested in and " +
            "use the available contact option to communicate with the room owner."
        );

        faqBox.getChildren().addAll(
            faq1,
            faq2,
            faq3,
            faq4
        );

         content.getChildren().addAll(
            backBox,
            titleBox,
            description,
            contactBox,
            faqBox
        );
         root.getChildren().add(content);
         Scene scene = new Scene(root, 1440, 850);

        stage.setTitle("Sahayak - Help & Support");
        stage.setWidth(1280);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.show();
    }
         private VBox createContactCard(
            String headingText,
            String detailText) {

        VBox card = new VBox();

        card.setPrefWidth(313);
        card.setMinWidth(313);
        card.setPrefHeight(130);

        card.setSpacing(8);
        card.setPadding(new Insets(20, 23, 18, 23));

        card.setStyle(
            "-fx-background-color: #FFFFFF;" +
            "-fx-border-color: #D6E1E2;" +
            "-fx-border-width: 1px;" +
            "-fx-border-radius: 18px;" +
            "-fx-background-radius: 18px;"
        );
       
        // Heading
        Label heading = new Label(headingText);

        heading.setStyle(
            "-fx-text-fill: #071D26;" +
            "-fx-font-size: 17px;" +
            "-fx-font-family: 'Arial';" +
            "-fx-font-weight: bold;"
        );

        // Details
        Label detail = new Label(detailText);

        detail.setStyle(
            "-fx-text-fill: #587080;" +
            "-fx-font-size: 16px;" +
            "-fx-font-family: 'Arial';"
        );
        card.getChildren().addAll(
            heading,
            detail
        );

        return card;
    }
    private VBox createFAQ(
            String questionText,
            String answerText) {

        VBox faqContainer = new VBox();

        faqContainer.setSpacing(0);

        faqContainer.setStyle(
            "-fx-background-color: #FFFFFF;" +
            "-fx-border-color: #D6E1E2;" +
            "-fx-border-width: 1px;" +
            "-fx-border-radius: 18px;" +
            "-fx-background-radius: 18px;"
        );
        Button questionButton = new Button(
            "-> " + questionText
        );

        questionButton.setPrefWidth(976);
        questionButton.setMinHeight(80);
        questionButton.setAlignment(Pos.CENTER_LEFT);

        questionButton.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-text-fill: #071D26;" +
            "-fx-font-size: 20px;" +
            "-fx-font-family: 'Arial';" +
            "-fx-font-weight: bold;" +
            "-fx-padding: 0 22px;" +
            "-fx-cursor: hand;"
        );
        Label answer = new Label(answerText);

        answer.setWrapText(true);
        answer.setPrefWidth(920);

        answer.setStyle(
            "-fx-text-fill: #587080;" +
            "-fx-font-size: 16px;" +
            "-fx-font-family: 'Arial';" +
            "-fx-line-spacing: 4px;"
        );

        VBox answerBox = new VBox();
        answerBox.setPadding(new Insets(0, 25, 22, 48));
        answerBox.getChildren().add(answer);

        // Initially hidden
        answerBox.setVisible(false);
        answerBox.setManaged(false);
         questionButton.setOnAction(e -> {

            boolean currentlyVisible = answerBox.isVisible();

            answerBox.setVisible(!currentlyVisible);
            answerBox.setManaged(!currentlyVisible);

            if (currentlyVisible) {

                questionButton.setText(
                    "->" + questionText
                );

            } else {

                questionButton.setText(
                    "| " + questionText
                );
            }
        });

        faqContainer.getChildren().addAll(
            questionButton,
            answerBox
        );

        return faqContainer;
    }

    }
    

    

