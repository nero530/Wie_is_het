package MVPtest.view.welkomsScherm;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class VerzamelElement extends BorderPane {

    private Text Begroeting;

    private BackgroundImage WelkomsAfbeelding;

    private Text Auteurs;

    private Text Versie;

    private Image wieIsHet;
public VerzamelElement(){
  this.initialiseNodes();
        this.layoutNodes();
}

public void initialiseNodes(){

    Begroeting=new Text("Wie\n  is \nhet?");
    Auteurs = new Text("Eliah Verbeemen"); //Miss volledige naam


wieIsHet=new Image("vraagtekens.jpg");

this.setBackground(new Background(WelkomsAfbeelding));
WelkomsAfbeelding=new BackgroundImage(wieIsHet, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
        BackgroundSize.DEFAULT);



}

public void layoutNodes(){
   /* WelkomsAfbeelding.setImage(wieIsHet);
    WelkomsAfbeelding.setFitWidth(100);

WelkomsAfbeelding.isPreserveRatio();*/
Begroeting.getStyleClass().add("achtergrondTekst");
Begroeting.setStyle("-fx-font-weight: bold;");
    Begroeting.setStyle("-fx-font-size: 100;");
this.setCenter(Begroeting);
this.setBackground(new Background(WelkomsAfbeelding));
BorderPane.setAlignment(Auteurs, Pos.BOTTOM_RIGHT);
this.setBottom(Auteurs);
//this.add(WelkomsAfbeelding,3,1,1,1);

//Afsluitknop spel voorzien



}




}
