package MVPtest.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

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



    }
   void layoutNodes() {
 vraagEen.setUserData("vrouw");





this.add(vraagEen,0,0);
this.add(vraagTwee,0,1);
this.add(vraagDrie,0,2);
this.add(vraagVier,0,3);
this.add(vraagVijf,0,4);
this.add(vraagZes,0,5);
this.add(vraagZeven,0,6);
this.add(oogkleurBlauw,0,7);
this.add(oogkleurBruin,1,7);
this.add(oogkleurGrijs,2,7);
this.add(vraagAcht,0,8);
this.add(haarKleurBlond,0,9);
this.add(haarKleurZwart,1,9);
this.add(haarKleurBruin,2,9);

   }




}
