package MVPtest;

import MVPtest.model.Spel;
import MVPtest.view.Geheel;
import MVPtest.view.eerstePresenteer;
import MVPtest.view.Bord;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Geheel view=new Geheel();
        Spel model=new Spel();
        System.out.println(model);
        eerstePresenteer presenteer=new eerstePresenteer(view,model);
        Scene scene = new Scene(view);





        stage.setTitle("Hello!");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}