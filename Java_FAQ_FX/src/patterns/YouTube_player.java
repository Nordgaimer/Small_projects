package patterns;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Created by javadev on 16.03.14.
 */
public class YouTube_player  {
    public YouTube_player(String url) {
        final Group root = new Group();
        //Scene scene = new Scene(root, 870, 495);
        Scene scene = new Scene(root, 870, 490);

        final Stage stage = new Stage();
        final WebView webView = new WebView();
        final WebEngine webEngine = webView.getEngine();
        webView.setPrefSize(900, 500);

        webEngine.loadContent(url);
        root.getChildren().add(webView);
        stage.setTitle("YouTube Player");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.getIcons().add(new Image("main_package/img/iconframe.jpg"));
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>(){

            @Override
            public void handle(WindowEvent event) {
                webView.getEngine().load(null);
            }
        });

    }
}
