package patterns;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import resources.Additional_lections_info;

/**
 * Created by javadev on 16.03.14.
 */
public class Stage_Additional_Lections extends Stage {
    public Stage_Additional_Lections() {
        Group root = new Group();
        Scene scene = new Scene(root,760,600);
        final VBox vBox_frame = new VBox(10);
        HBox hBox_1_top = new HBox(10);
        HBox hBox_2_top = new HBox(10);
        HBox hBox_3_top = new HBox(10);
        HBox hBox_4_top = new HBox(10);
        HBox hBox_5_top = new HBox(10);

        ScrollBar sc = new ScrollBar();
        sc.setLayoutX(scene.getWidth()-sc.getWidth());
        sc.setMin(0);
        sc.setOrientation(Orientation.VERTICAL);
        sc.setPrefHeight(760);
        sc.setMax(1200);
        sc.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                vBox_frame.setLayoutY(-new_val.doubleValue());
            }
        });

        Label textField_1_top = new Label();
        Label textField_2_top = new Label();
        Label textField_3_top = new Label();
        Label textField_4_top = new Label();
        Label textField_5_top = new Label();

        textField_1_top.setText(Additional_lections_info.core_tkach);
        textField_2_top.setText(Additional_lections_info.advanced_generics_tkach);
        textField_3_top.setText(Additional_lections_info.advanced_concurency_tkach);
        textField_4_top.setText(Additional_lections_info.advanced_coll_tkach);
        textField_5_top.setText(Additional_lections_info.other_kornev);
        vBox_frame.setAlignment(Pos.TOP_CENTER);

        hBox_1_top.setAlignment(Pos.CENTER);
        hBox_2_top.setAlignment(Pos.CENTER);
        hBox_3_top.setAlignment(Pos.CENTER);
        hBox_4_top.setAlignment(Pos.CENTER);
        hBox_5_top.setAlignment(Pos.CENTER);

        Btn_core btn_core = new Btn_core("Смотреть");
        Btn_core btn_generics = new Btn_core("Смотреть");
        Btn_core btn_concurrnecy = new Btn_core("Смотреть");
        Btn_core btn_collections = new Btn_core("Смотреть");
        Btn_core btn_other = new Btn_core("Смотреть");

        btn_core.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new WebBrowser("http://www.youtube.com/playlist?list=PLB0276A0A62BDEF06");
            }
        });
        btn_generics.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new WebBrowser("http://www.youtube.com/playlist?list=PL6jg6AGdCNaX1yIJpX4sgALBTmTVc_uOJ");
            }
        });
        btn_collections.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new WebBrowser("http://www.youtube.com/playlist?list=PL6jg6AGdCNaWtTjsYJ9t0VaITpIZm4pMt");
            }
        });
        btn_concurrnecy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new WebBrowser("http://www.youtube.com/playlist?list=PL6jg6AGdCNaXo06LjCBmRao-qJdf38oKp");
            }
        });
        btn_other.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new WebBrowser("http://compscicenter.ru/program/course/java2011");
            }
        });
        hBox_1_top.getChildren().addAll(textField_1_top, btn_core);
        hBox_2_top.getChildren().addAll(textField_2_top, btn_generics);
        hBox_3_top.getChildren().addAll(textField_3_top, btn_concurrnecy);
        hBox_4_top.getChildren().addAll(textField_4_top, btn_collections);
        hBox_5_top.getChildren().addAll(textField_5_top, btn_other);
        vBox_frame.getChildren().addAll(hBox_1_top,hBox_2_top,hBox_3_top,hBox_4_top,hBox_5_top);


        root.getChildren().add(vBox_frame);
        root.getChildren().add(sc);

        centerOnScreen();
        setResizable(false);
        setScene(scene);
        setTitle("Дополнительные лекции");
        getIcons().add(new javafx.scene.image.Image("main_package/img/iconframe.jpg"));
        show();
    }
}
