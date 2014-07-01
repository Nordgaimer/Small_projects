package patterns;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.effect.Blend;
import javafx.scene.effect.Bloom;
import javafx.scene.image.*;
import javafx.scene.image.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * Created by javadev on 15.03.14.
 */
public class Btn_core extends Button {
    public Btn_core(String title) {
       setText(title);
       setEffect(new Blend());
       setMaxWidth(Double.MAX_VALUE);
       setStyle("-fx-font: bold italic 20pt \"Arial\";\n" +
               "    -fx-effect: dropshadow( one-pass-box , black , 8 , 0.0 , 2 , 0 );");

    }



}
