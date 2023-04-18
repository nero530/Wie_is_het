package MVPtest;

import MVPtest.model.Spel;
import MVPtest.view.Geheel;
import MVPtest.view.Overlay;
import MVPtest.view.eerstePresenteer;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class HelloApplication extends Application {


    Stage splash = new Stage();

    @Override
    public void start(Stage stage) throws IOException {

        Geheel view=new Geheel();



        Spel model=new Spel();

        eerstePresenteer presenteer=new eerstePresenteer(view,model);
        Scene scene = new Scene(view);

        scene.getStylesheets().add("Opmaak.css");
        stage.setTitle("Hello!");
        stage.setFullScreen(true);
        stage.setResizable(true);

        stage.setScene(scene);
        stage.show();
       GridPane verzamelelement=view.getVerzamelElement();
Scene scene2=new Scene(verzamelelement,800,800);
splash.setScene(scene2);
        splash.initOwner(stage);
splash.initStyle(StageStyle.UNDECORATED);
        splash.initModality(Modality.APPLICATION_MODAL);
//

        splash.showAndWait();




    }

    public static void main(String[] args) {
        launch();
    }



    @Override
    public void init(){




        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(e-> {
            splash.close(); });
        delay.play();


    }




}