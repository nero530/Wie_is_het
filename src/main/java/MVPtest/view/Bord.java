package MVPtest.view;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Bord extends TilePane {
    private Rectangle persoon;

    //private Button myButton;
    public Bord() {

        this.initialiseNodes();
        this.layoutNodes();

    }

    public void initialiseNodes() {

        //myButton=new Button("klik voor 2");

    }

    //niet alleen de nodes, ook
    public void layoutNodes() {
        this.setBackground(Background.fill(Color.SILVER));
     for(int i=0;i<20;i++) {

         Persoon persoon =new Persoon();
         //persoon.setUserData(i);
        persoon.getProperties().put("nummer",i);
         persoon.setId(Integer.toString(i));
         this.getChildren().addAll(persoon);
     }
//TilePane.setFill(Color.BLUE);
//this.getChildren().addAll(tekstveldje,myButton);


    }


    Rectangle getPersoon(){
        return persoon;

    }
}

   /* TextField getTekstveldje() {
        return tekstveldje;
    }
   Button getMyButton(){return myButton;}

}
*/