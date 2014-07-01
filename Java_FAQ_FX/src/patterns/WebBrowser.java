package patterns;

/**
 * Created by javadev on 16.03.14.
 */
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.WindowEvent;


/**
 * Demonstrates a WebView object accessing a web page.
 *
 * @see javafx.scene.web.WebView
 * @see javafx.scene.web.WebEngine
 */
public class WebBrowser  {
    public WebBrowser(String url) {
        Group root = new Group();
        Scene scene = new Scene(root, 1150, 600);
        final Stage stage = new Stage();
        final WebView webView = new WebView();
        final WebEngine webEngine = webView.getEngine();
        webEngine.load(url);
        webView.setPrefSize(1150,600);

        final TextField locationField = new TextField(url);
        webEngine.locationProperty().addListener(new ChangeListener<String>() {
            @Override public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                locationField.setText(newValue);
            }
        });
        EventHandler<ActionEvent> goAction = new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                webEngine.load(locationField.getText().startsWith("http://")
                        ? locationField.getText()
                        : "http://" + locationField.getText());
            }
        };
        locationField.setOnAction(goAction);

        Button goButton = new Button("Go");
        goButton.setDefaultButton(true);
        goButton.setOnAction(goAction);

        // Layout logic
        HBox hBox = new HBox(5);
        hBox.getChildren().setAll(locationField, goButton);
        HBox.setHgrow(locationField, Priority.ALWAYS);

        VBox vBox = new VBox(5);
        vBox.getChildren().setAll(hBox, webView);
        VBox.setVgrow(webView, Priority.ALWAYS);

        root.getChildren().add(vBox);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("main_package/img/iconframe.jpg"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>(){

            @Override
            public void handle(WindowEvent event) {
                webView.getEngine().load(null);
            }
        });
    }
    public WebBrowser(String url,int heigt, int weight) {
        Group root = new Group();
        Scene scene = new Scene(root, heigt, weight);
        final Stage stage = new Stage();


        Label textField_1 = new Label();
        TextField text = new TextField();
        Label textField_2 = new Label();
        textField_1.setText("Download link for smth.\n");
        text.setText(        "http://us.ua/1370987/\n" +
                "\n\n");
        textField_2.setText("Разработчики данного програмного обеспечения\n"+
        "не несут ответсвенности за загружаемый\n" +
                "Вами контент.\n" +
                " ");
        textField_1.setAlignment(Pos.CENTER);
        textField_2.setAlignment(Pos.CENTER);

        textField_1.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 16));
        textField_2.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 16));
        final InnerShadow innerShadow = new InnerShadow();
        innerShadow.setRadius(5d);
        innerShadow.setOffsetX(2);
        innerShadow.setOffsetY(2);
        final DropShadow dropShadow = new DropShadow();


        VBox vBox = new VBox(5);
        vBox.getChildren().setAll(textField_1,text,textField_2);
        stage.setResizable(false);
        root.getChildren().add(vBox);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("main_package/img/iconframe.jpg"));
        stage.setScene(scene);
        stage.show();

    }
}