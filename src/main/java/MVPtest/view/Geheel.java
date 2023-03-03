package MVPtest.view;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class Geheel extends GridPane {
    private TilePane bord;
    private VBox mijnKaartje;

    final Label label1 = new Label("");
    final Label label2 = new Label("");
    final Label label3 = new Label("");
    final Label label4 = new Label("");
    final Label label5 = new Label("");
    final Label label6 = new Label("");
    final Label label7 = new Label("");

    public Geheel() {
        this.initialiseNodes();
        this.layoutNodes();


    }

    private void initialiseNodes() {
        this.bord = new Bord();
        this.mijnKaartje = new MijnKaartje();

    }

    private void layoutNodes() {
        this.bord.setMinWidth(800);
        this.mijnKaartje.setMinWidth(300);
        this.label2.setMinWidth(200);
        this.label7.setMinHeight(400);
       // setPercentWidth
        this.add(label1,0,0);
        this.add(label2,1,0);
        this.add(label3,2,0);
        this.add(label4,1,0);
        this.add(label5,1,1);
        this.add(label6,1,2);
        this.add(label7,2,1);




        this.add(bord,1,1,1,2);
        this.add(mijnKaartje,2,2);
    }

    TilePane getBord(){

        return bord ;

    }
    VBox getMijnKaartje(){

        return mijnKaartje;

    }

}