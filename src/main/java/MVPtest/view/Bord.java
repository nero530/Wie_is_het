package MVPtest.view;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Bord extends TilePane {
    private VBox persoon;


    public Bord() {

        this.initialiseNodes();
        this.layoutNodes();

    }

    public void initialiseNodes() {



    }


    public void layoutNodes() {
        this.setBackground(Background.fill(Color.SILVER));
     for(int i=0;i<20;i++) {

         Persoon persoon =new Persoon();
        persoon.getProperties().put("nummer",i);
         persoon.setId(Integer.toString(i));
         persoon.setUserData(Integer.toString(i));
        persoon.getFotoPersoon().setId(Integer.toString(i));
         persoon.getFotoPersoon().setUserData(Integer.toString(i));
         persoon.getStyleClass().add("persoon");
         this.getChildren().addAll(persoon);

     }
        this.setVgap(0);
        this.getStyleClass().add("bord");
        this.setAlignment(Pos.CENTER);
    }


    VBox getPersoon(){
        return persoon;

    }
}

