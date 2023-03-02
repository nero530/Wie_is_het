package MVPtest;

import MVPtest.view.eerstePresenteer;
import MVPtest.view.eersteView;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        eersteView view=new eersteView();
        eerstePresenteer presenteer=new eerstePresenteer(view);
        Scene scene = new Scene(view);
        stage.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("mouse click detected! " + mouseEvent.getSource());
            }



        });




        stage.setTitle("Hello!");
        //stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}