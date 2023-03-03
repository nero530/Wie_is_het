package MVPtest.view;

import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Persoon extends VBox {

    private Text naam;
    private ImageView fotoPersoon;
    private Text eenTekst1;
    private Text eenTekst2;


    public Persoon() {

        this.initialiseNodes();
        this.layoutNodes();

    }

    public void initialiseNodes() {
        this.naam=new Text();
        this.eenTekst1=new Text();
        this.eenTekst2=new Text();


        this.fotoPersoon = new ImageView("Cheeseburger.jpg");



    }
    public void layoutNodes(){
        fotoPersoon.isPreserveRatio();
        fotoPersoon.setFitHeight(150);
        fotoPersoon.setFitWidth(150);

        naam.setText("cheeseBurger");

        // naam.setStyle("-fx-text-fill: inputMijnKaartje");

        naam.setMouseTransparent(true);

        eenTekst1.setText("");

        eenTekst2.setText("");


        this.getChildren().addAll(naam,fotoPersoon,eenTekst1,eenTekst2);


    }

    ImageView getFotoPersoon(){
        return fotoPersoon;


    }

    Text getNaam(){

        return naam;



    }









}

