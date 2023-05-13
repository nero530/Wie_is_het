package MVPtest.view;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import static javafx.scene.text.TextAlignment.JUSTIFY;
import static javafx.scene.text.TextAlignment.LEFT;

public class MijnKaartje extends VBox {
private Text naam;
private ImageView fotoPersoon;
private Text eenTekst1;
private Text eenTekst2;
    private Text eenTekst3;
    private Text eenTekst4;
    private Text eenTekst5;
    private Text eenTekst6;

    private Text eenTekst7;
    private Text eenTekst8;
    private Text eenTekst9;
    private Text eenTekst10;

    private  TextFlow textFlow;



    public MijnKaartje() {

        this.initialiseNodes();
        this.layoutNodes();

    }

    public void initialiseNodes() {
        this.naam=new Text();
        this.eenTekst1=new Text();
        eenTekst1.setTextAlignment(LEFT);
        this.eenTekst2=new Text();
        this.eenTekst3=new Text();
        this.eenTekst4=new Text();
        this.eenTekst5=new Text();
        this.eenTekst6=new Text();
        this.eenTekst7=new Text();
        this.eenTekst8=new Text();
        this.eenTekst9=new Text();
        this.eenTekst10=new Text();
        this.fotoPersoon = new ImageView("Cheeseburger.jpg");
//this.textFlow=new TextFlow(eenTekst1,eenTekst2,eenTekst3,eenTekst4,eenTekst5,eenTekst6,eenTekst7,eenTekst8,eenTekst9,eenTekst10);


    }
    public void layoutNodes(){
        fotoPersoon.isPreserveRatio();
        fotoPersoon.setFitHeight(200);
        fotoPersoon.setFitWidth(150);
       // fotoPersoon.getStyleClass().add("hidden2");
        fotoPersoon.setVisible(false);
setSpacing(2);
        // naam.setStyle("-fx-text-fill: inputMijnKaartje");


this.setStyle("-fx-background-color: blue");



        this.setMouseTransparent(true);
      this.getChildren().addAll(naam,fotoPersoon,eenTekst1,eenTekst2,eenTekst3,eenTekst4,eenTekst5,eenTekst6,eenTekst7,eenTekst8,eenTekst9,eenTekst10);

    //    this.getChildren().addAll(naam,fotoPersoon,textFlow);


    }


}
