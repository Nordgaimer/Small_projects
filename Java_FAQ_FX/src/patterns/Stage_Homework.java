package patterns;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Created by javadev on 16.03.14.
 */
public class Stage_Homework extends Stage {
    public Stage_Homework(String txt) {
        final Group root = new Group();
        final Scene scene = new Scene(root,800,600);
        ScrollBar sc = new ScrollBar();
        sc.setLayoutX(scene.getWidth()-sc.getWidth());
        sc.setMin(0);
        sc.setOrientation(Orientation.VERTICAL);
        sc.setPrefHeight(1200);
        sc.setMax(800);
        sc.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
               root.setLayoutY(-new_val.doubleValue());
            }
        });
        Label textField = new Label();
        textField.setText(txt);
        root.getChildren().add(textField);
        root.getChildren().add(sc);
        centerOnScreen();
        setResizable(false);
        setTitle("Homework_easy");
        getIcons().add(new Image("main_package/img/iconframe.jpg"));
        setScene(scene);
        show();
    }
}
