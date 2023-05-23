package MVPtest.view.welkomsScherm;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
    Auteurs = new Text("Eliah Verbeemen");


wieIsHet=new Image("vraagtekens.jpg");

this.setBackground(new Background(WelkomsAfbeelding));
WelkomsAfbeelding=new BackgroundImage(wieIsHet, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
        new BackgroundSize(100,100,true,true,true,false));



}

public void layoutNodes(){

Begroeting.getStyleClass().add("achtergrondTekst");
Begroeting.setStyle("-fx-font-weight: bold;");
Begroeting.setStyle("-fx-font-size: 100;");
this.setCenter(Begroeting);
this.setBackground(new Background(WelkomsAfbeelding));
BorderPane.setAlignment(Auteurs, Pos.BOTTOM_RIGHT);
//heb deze classe in verkeerde map gestoken
    Auteurs.setFill(Color.WHITE);
Auteurs.setStyle("-fx-font-weight:bold;");

Auteurs.setStyle("-fx-font-size:25");




this.setBottom(Auteurs);



}




}
