package patterns;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by javadev on 15.03.14.
 */

public class Stage_Video_Lections extends Stage {
    public Stage_Video_Lections(String title, String url_text,
                                final String url_video_p1) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        VBox vBox_buttons = new VBox(10);
        VBox vBox_frame = new VBox(10);
        HBox hBox = new HBox(10);
        Label textField = new Label();
        textField.setText(url_text);
        vBox_buttons.setAlignment(Pos.BASELINE_RIGHT);
        Btn_core b1 = new Btn_core("Watch");
        Btn_core b_additional = new Btn_core("Дополнительные видео лекции");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p1);
            }
        });
        b_additional.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new Stage_Additional_Lections();
            }
        });
        vBox_frame.getChildren().addAll(hBox, b_additional);
        vBox_buttons.getChildren().addAll(b1);
        hBox.getChildren().addAll(textField, vBox_buttons);
        root.getChildren().add(vBox_frame);
        centerOnScreen();
        setResizable(false);
        setTitle(title);
        setScene(scene);
        getIcons().add(new Image("main_package/img/iconframe.jpg"));
        show();

    }

    public Stage_Video_Lections(String title, String url_text,
                                final String url_video_p1, final String url_video_p2) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        VBox vBox_buttons = new VBox(10);
        VBox vBox_frame = new VBox(10);
        HBox hBox = new HBox(10);
        Label textField = new Label();
        textField.setText(url_text);
        vBox_buttons.setAlignment(Pos.BASELINE_CENTER);
        vBox_frame.setAlignment(Pos.CENTER_RIGHT);
        Btn_core b1 = new Btn_core("Part 1");
        Btn_core b2 = new Btn_core("Part 2");
        Btn_core b_additional = new Btn_core("Дополнительные видео лекции");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p1);
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p2);
            }
        });
        b_additional.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new Stage_Additional_Lections();
            }
        });
        vBox_frame.getChildren().addAll(hBox, b_additional);
        vBox_buttons.getChildren().addAll(b1, b2);
        hBox.getChildren().addAll(textField, vBox_buttons);
        root.getChildren().add(vBox_frame);
        centerOnScreen();
        setResizable(false);
        setTitle(title);
        setScene(scene);
        getIcons().add(new Image("main_package/img/iconframe.jpg"));
        show();
    }

    public Stage_Video_Lections(String title, String url_text,
                                final String url_video_p1, final String url_video_p2,
                                final String url_video_p3) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        VBox vBox_buttons = new VBox(10);
        VBox vBox_frame = new VBox(10);
        HBox hBox = new HBox(10);
        Label textField = new Label();
        textField.setText(url_text);
        vBox_buttons.setAlignment(Pos.BASELINE_RIGHT);
        Btn_core b1 = new Btn_core("Part 1");
        Btn_core b2 = new Btn_core("Part 2");
        Btn_core b3 = new Btn_core("Part 3");
        Btn_core b_additional = new Btn_core("Дополнительные видео лекции");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p1);
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p2);
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p3);
            }
        });
        b_additional.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new Stage_Additional_Lections();
            }
        });
        vBox_frame.getChildren().addAll(hBox, b_additional);
        vBox_buttons.getChildren().addAll(b1, b2, b3);
        hBox.getChildren().addAll(textField, vBox_buttons);
        root.getChildren().add(vBox_frame);
        centerOnScreen();
        setResizable(false);
        setTitle(title);
        setScene(scene);
        getIcons().add(new Image("main_package/img/iconframe.jpg"));
        show();
    }

    public Stage_Video_Lections(String title, String url_text,
                                final String url_video_p1, final String url_video_p2,
                                final String url_video_p3, final String url_video_p4) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        ;
        VBox vBox_buttons = new VBox(10);
        VBox vBox_frame = new VBox(10);
        HBox hBox = new HBox(10);
        Label textField = new Label();
        textField.setText(url_text);
        vBox_buttons.setAlignment(Pos.BASELINE_RIGHT);
        Btn_core b1 = new Btn_core("Part 1");
        Btn_core b2 = new Btn_core("Part 2");
        Btn_core b3 = new Btn_core("Part 3");
        Btn_core b4 = new Btn_core("Part 4");
        Btn_core b_additional = new Btn_core("Дополнительные видео лекции");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p1);
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p2);
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p3);
            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p4);
            }
        });
        b_additional.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new Stage_Additional_Lections();
            }
        });
        vBox_frame.getChildren().addAll(hBox, b_additional);
        vBox_buttons.getChildren().addAll(b1, b2, b3, b4);
        hBox.getChildren().addAll(textField, vBox_buttons);
        root.getChildren().add(vBox_frame);
        centerOnScreen();
        setResizable(false);
        setTitle(title);
        setScene(scene);
        getIcons().add(new Image("main_package/img/iconframe.jpg"));
        show();
    }

    public Stage_Video_Lections(String title, String url_text,
                                final String url_video_p1, final String url_video_p2,
                                final String url_video_p3, final String url_video_p4, final String url_video_p5) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        VBox vBox_buttons = new VBox(10);
        VBox vBox_frame = new VBox(10);
        HBox hBox = new HBox(10);
        Label textField = new Label();
        textField.setText(url_text);
        vBox_buttons.setAlignment(Pos.BASELINE_RIGHT);
        Btn_core b1 = new Btn_core("Part 1");
        Btn_core b2 = new Btn_core("Part 2");
        Btn_core b3 = new Btn_core("Part 3");
        Btn_core b4 = new Btn_core("Part 4");
        Btn_core b5 = new Btn_core("Part 5");
        Btn_core b_additional = new Btn_core("Дополнительные видео лекции");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p1);
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p2);
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p3);
            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p4);
            }
        });
        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new YouTube_player(url_video_p5);
            }
        });
        b_additional.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new Stage_Additional_Lections();
            }
        });
        vBox_frame.getChildren().addAll(hBox, b_additional);
        vBox_buttons.getChildren().addAll(b1, b2, b3, b4, b5);
        hBox.getChildren().addAll(textField, vBox_buttons);
        root.getChildren().add(vBox_frame);
        centerOnScreen();
        setResizable(false);
        setTitle(title);
        setScene(scene);
        getIcons().add(new Image("main_package/img/iconframe.jpg"));
        show();
    }

}

