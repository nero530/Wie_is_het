package MVPtest.view;

import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Vragen extends GridPane {
private Button vraagEen;
private Button vraagTwee;
private Button vraagDrie;
private Button vraagVier;
private Button vraagVijf;
private Button vraagZes;
private Label vraagZeven;
private Button oogkleurBlauw;
private Button oogkleurBruin;
private Button oogkleurGrijs;
private Label vraagAcht;
private Button haarKleurBlond;
private Button haarKleurZwart;
private Button haarKleurBruin;

private HBox haarKleuren;
private HBox oogKleuren;



    public Vragen() {

        this.initialiseNodes();
        this.layoutNodes();

    }
    void initialiseNodes(){
        vraagEen=new Button("Is het een vrouw?");
        vraagTwee=new Button("Draagt je persoon een bril?");
        vraagDrie=new Button("Heeft je persoon een baard?");
        vraagVier=new Button("Is je persoon kaal?");
        vraagVijf=new Button("heeft je persoon een hoofddeksel?");
        vraagZes=new Button("heeft je persoon een snor?");
        vraagZeven=new Label("Is de oogkleur...?");
        oogkleurBlauw=new Button("Blauw");
        oogkleurBruin=new Button("Bruin");
        oogkleurGrijs=new Button("Grijs");
        vraagAcht=new Label("Is de haarkleur...?");
        haarKleurBlond=new Button("blond");

        haarKleurZwart=new Button("zwart");
        haarKleurZwart.setStyle("-fx-background-color: yellow");
        haarKleurBruin=new Button("bruin");
        oogKleuren=new HBox(oogkleurBlauw,oogkleurBruin,oogkleurGrijs);
        haarKleuren=new HBox(haarKleurBlond,haarKleurZwart,haarKleurBruin);



    }
   void layoutNodes() {
 vraagEen.setUserData("vrouw");

this.setMaxHeight(500);
       oogKleuren.setSpacing(7);
       haarKleuren.setSpacing(7);
this.setStyle("-fx-background-color: green");
this.setMouseTransparent(false);

this.add(vraagEen,0,0);
this.add(vraagTwee,0,1);
this.add(vraagDrie,0,2);
this.add(vraagVier,0,3);
this.add(vraagVijf,0,4);
this.add(vraagZes,0,5);
this.add(vraagZeven,0,6);


this.add(vraagAcht,0,8);
this.add(haarKleuren,0,9);
 this.add(oogKleuren,0,7);
this.setVgap(7);


   }




}
