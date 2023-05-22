package MVPtest;

//buttons ovalen
//

import MVPtest.model.Spel;
import MVPtest.view.Geheel;
import MVPtest.view.eerstePresenteer;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.binding.When;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableObjectValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Optional;

import static javafx.beans.binding.Bindings.booleanValueAt;
import static javafx.beans.binding.Bindings.createBooleanBinding;


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
        Scene scene = new Scene(view,1000,600);

        scene.getStylesheets().add("Opmaak.css");
        stage.setTitle("Wie is het?");
        //stage.setFullScreen(true);
        stage.setResizable(true);

        stage.setScene(scene);
        stage.show();
       BorderPane verzamelelement=view.getVerzamelElement();
Scene scene2=new Scene(verzamelelement,1000,625);


splash.setScene(scene2);
        splash.initOwner(stage);
splash.initStyle(StageStyle.UNDECORATED);
        splash.initModality(Modality.APPLICATION_MODAL);
//

        splash.showAndWait();
        ObservableBooleanValue gezocht= createBooleanBinding(()->((view.getBevestigKnop().getScene().lookup("#focusButton")!=null)));
        ObservableBooleanValue isEreenPersoonAanwezig = createBooleanBinding(()->(model.getGekozenPersoon1().getNaam().equals("anoniem")));
        BooleanBinding persoonAangeduid= view.getMijnKaartje().visibleProperty().not();
        //BooleanBinding isEreenKnopAangeduid = new SimpleBooleanProperty(gezocht.isEmpty()).not();
       // BooleanBinding X=new SimpleBooleanProperty().not().and((isEreenPersoonAanwezig).not().and(isEreenKnopAangeduid));
        // werkt :view.getBevestigKnop().disableProperty().bind(gezocht);
     //werkt voor eerste   view.getBevestigKnop().disableProperty().bind(persoonAangeduid);
       /*  ObjectProperty<Node> node = new SimpleObjectProperty<>((view.getBevestigKnop().getScene().lookup("#focusButton")));
       BooleanProperty bool=new SimpleBooleanProperty(model.getGekozenPersoon1().getNaam().equals("anoniem"));

        view.getBevestigKnop().disableProperty().bind(persoonAangeduid.or(Bindings.isNotNull(node).and(bool)));
*/
      //  tooltip.().bind()
      // view.getBevestigKnop().disableProperty().bind(createBooleanBinding((()-> view.getMijnKaartje().isVisible()/*||((gezocht).or(isEreenPersoonAanwezig)*/)))
        /*.or(isEreenPersoonAanwezig.and(gezocht)));
        System.out.println(gezocht);

      //  view.getBevestigKnop().disableProperty().bind(isEreenKnopAangeduid/*.or(isEreenPersoonAangeduid).not()*/;

       // view.getBevestigKnop().disableProperty().bind(Bindings.or(view.getMijnKaartje().visibleProperty().not(),(isEreenPersoonAanwezig.or(isEreenKnopAangeduid.not()))));
       // BooleanBinding debinding = view.getMijnKaartje().visibleProperty().or(Bindings.isNotNull(view.getBevestigKnop().getScene().lookup("#focusButton")));
      //  createButton.disableProperty().bind(accountBind);


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




        PauseTransition delay = new PauseTransition(Duration.seconds(5));
        delay.setOnFinished(e-> {
            splash.close(); });
        delay.play();


    }




}