package MVPtest.view.welkomsScherm;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class VerzamelElement extends GridPane {

    private Text Begroeting;

    private ImageView WelkomsAfbeelding;

    private Text Auteurs;

    private Text Versie;
public VerzamelElement(){
  this.initialiseNodes();
        this.layoutNodes();
}

public void initialiseNodes(){

    Begroeting=new Text("Wie is het?");
    Auteurs = new Text("Wannes en Eliah"); //Miss volledige naam
Versie=new Text("Versie 1");
WelkomsAfbeelding=new ImageView(new Image("WieIsHet.PNG"));



}

public void layoutNodes(){

this.add(Begroeting,1,0);
this.add(Auteurs,0,1);
this.add(Versie,0,2);
this.add(WelkomsAfbeelding,3,1,2,2);
//Afsluitknop spel voorzien



}




}
