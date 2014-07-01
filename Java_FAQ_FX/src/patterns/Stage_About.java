package patterns;


import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by javadev on 17.03.14.
 */
public class Stage_About extends Stage{

    public Stage_About(int heigt, int weight) {

        StackPane sp = new StackPane();
        Scene scene = new Scene(sp);
        Image img = new Image("http://imageshack.com/a/img809/6513/weo3.png");
        ImageView imgView = new ImageView(img);
        sp.getChildren().add(imgView);
        setScene(scene);
        getIcons().add(new Image("main_package/img/iconframe.jpg"));
        show();
    }
}
