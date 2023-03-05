package MVPtest.view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class KnoppenPosEnNeg extends HBox {
   private Button positief;
   private Button negatief;

    public KnoppenPosEnNeg(){
      this.initialiseNodes();
        this.layoutNodes();
}

    void initialiseNodes(){
       positief=new Button("Ja");
       negatief=new Button("Nee");

    }
    void layoutNodes(){

this.getChildren().addAll(positief,negatief);
    }
Button getPositief(){
      return this.positief ;

}

   public Button getNegatief(){
        return this.negatief ;

    }


}
