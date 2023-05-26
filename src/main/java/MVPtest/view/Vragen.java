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

// Dit deel van de view representeert de vragenknoppen (bovenaan midden view)

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
        haarKleurBruin=new Button("bruin");
        oogKleuren=new HBox(oogkleurBlauw,oogkleurBruin,oogkleurGrijs);
        haarKleuren=new HBox(haarKleurBlond,haarKleurZwart,haarKleurBruin);



    }
   void layoutNodes() {
 vraagEen.setUserData("vrouw");

this.setMaxHeight(500);
       oogKleuren.setSpacing(7);
       haarKleuren.setSpacing(7);

    this.setMouseTransparent(false);


       vraagEen.getStyleClass().add("vragenButton");
       vraagTwee.getStyleClass().add("vragenButton");
       vraagDrie.getStyleClass().add("vragenButton");
       vraagVier.getStyleClass().add("vragenButton");
       vraagVijf.getStyleClass().add("vragenButton");
       vraagZes.getStyleClass().add("vragenButton");
       oogkleurBlauw.getStyleClass().add("vragenButton");
       oogkleurBruin.getStyleClass().add("vragenButton");
       oogkleurGrijs.getStyleClass().add("vragenButton");
       haarKleurBlond.getStyleClass().add("vragenButton");
       haarKleurZwart.getStyleClass().add("vragenButton");
       haarKleurBruin.getStyleClass().add("vragenButton");

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
    this.setVgap(20);


   }




}
