package MVPtest.view;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class eersteView extends TilePane {
    private Rectangle dier;

    //private Button myButton;
    public eersteView() {

        this.initialiseNodes();
        this.layoutNodes();

    }

    public void initialiseNodes() {

        //myButton=new Button("klik voor 2");

    }

    //niet alleen de nodes, ook
    public void layoutNodes() {
        this.setBackground(Background.fill(Color.SILVER));
     for(int i=0;i<23;i++) {
         System.out.println("gedaan");
         Dier dier=new Dier();
         //dier.setUserData(i);
         this.getChildren().addAll(dier);
     }
//TilePane.setFill(Color.BLUE);
//this.getChildren().addAll(tekstveldje,myButton);


    }


    Rectangle getRectangle(){
        return dier;

    }
}

   /* TextField getTekstveldje() {
        return tekstveldje;
    }
   Button getMyButton(){return myButton;}

}
*/