package MVPtest;

//buttons ovalen
//

import MVPtest.model.Spel;
import MVPtest.view.Geheel;
import MVPtest.view.eerstePresenteer;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Optional;


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
        stage.setTitle("Wie is het?");
        //stage.setFullScreen(true);
        stage.setResizable(true);

        stage.setScene(scene);
        stage.show();
       GridPane verzamelelement=view.getVerzamelElement();
Scene scene2=new Scene(verzamelelement,700,700);
splash.setScene(scene2);
        splash.initOwner(stage);
splash.initStyle(StageStyle.UNDECORATED);
        splash.initModality(Modality.APPLICATION_MODAL);
//

        splash.showAndWait();

scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

    final KeyCombination escape = new KeyCodeCombination(KeyCode.ESCAPE);
    @Override
    public void handle(KeyEvent keyEvent) {
        if(escape.match(keyEvent)){

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("");
            alert.setTitle("");
            alert.setContentText("ben dat je het spel wilt verlaten?");

            Optional<ButtonType> reageren =alert.showAndWait();
            if(reageren.isPresent()&&reageren.get()==ButtonType.OK){

                Platform.exit();


            }

        }
    }
});


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