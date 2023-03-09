package MVPtest.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Geheel extends GridPane {
    private TilePane bord;
    private VBox mijnKaartje;

    private GridPane vragen;
    final Label label1 = new Label("");
    final Label label2 = new Label("");
    final Label titel = new Label("");
    private Button bevestigKnop;
    final Label label5 = new Label("");
    final Label label6 = new Label("");
    final Label label7 = new Label("");

    private HBox knoppenPosEnNeg;



    public Geheel() {
        this.initialiseNodes();
        this.layoutNodes();


    }

    private void initialiseNodes() {
        this.bord = new Bord();
        this.mijnKaartje = new MijnKaartje();
        this.vragen=new Vragen();
        this.bevestigKnop=new Button("bevestig Keuze");
    this.knoppenPosEnNeg=new KnoppenPosEnNeg();

    }

    private void layoutNodes() {
        this.bord.setMinWidth(800);
        this.mijnKaartje.setMinWidth(300);
        this.label2.setMinWidth(200);
        this.label7.setMinHeight(400);
        titel.setText("Kies een kaart");
        titel.getStyleClass().add("titel");
       // setPercentWidth
        this.add(label1,0,0);
        this.add(label2,1,0);
        this.add(bevestigKnop,2,3);
        this.add(titel,2,0);
        this.add(label5,1,1);
        this.add(label6,1,2);
        knoppenPosEnNeg.setVisible(false);
        this.add(knoppenPosEnNeg,2,3);




        mijnKaartje.setMouseTransparent(true);




        this.add(bord,1,1,1,3);
        this.add(mijnKaartje,3,1);
        // @BUG
        this.vragen.setVisible(false);
        this.add(vragen,2,1,1,2);
    }

    TilePane getBord(){

        return bord ;

    }

    VBox getMijnKaartje(){

        return mijnKaartje;

    }
    GridPane getVragen(){

        return vragen;

    }

    Button getBevestigKnop(){

        return bevestigKnop;

    }

    HBox getKnoppenPosEnNeg(){

        return knoppenPosEnNeg;

    }

}