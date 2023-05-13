package MVPtest;

import MVPtest.model.Spel;
import MVPtest.view.Geheel;
import MVPtest.view.eerstePresenteer;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;


public class HelloApplication extends Application {


    public static Stage getSplash() {
        return splash;
    }

    public static void setSplash(Stage splash) {
        HelloApplication.splash = splash;
    }

    private static Stage  splash;

    @Override
    public void start(Stage stage) throws IOException {
splash=new Stage();
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