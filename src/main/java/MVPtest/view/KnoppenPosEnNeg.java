package MVPtest.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class KnoppenPosEnNeg extends GridPane {
   private Button positief;
   private Button negatief;

   private Text foutiefAntwoord;

    public KnoppenPosEnNeg(){
      this.initialiseNodes();
        this.layoutNodes();
}



    void initialiseNodes(){
       positief=new Button("Ja");
       negatief=new Button("Nee");
        foutiefAntwoord=new Text("Ben je daar wel zeker van?");

    }
    void layoutNodes(){
        foutiefAntwoord.setVisible(false);
        positief.getStyleClass().add("positiefEnNegatief");
        negatief.getStyleClass().add("positiefEnNegatief");
        this.add(positief,0,0);
        this.add(negatief,1,0);
        this.add(foutiefAntwoord,0,1,2,1);
        foutiefAntwoord.getStyleClass().add("foutiefAntwoord");
        positief.getStyleClass().add("posEnNeg");
        negatief.getStyleClass().add("posEnNeg");
        this.setMargin(positief,new Insets(0,30,0,0));
        this.setAlignment(Pos.CENTER);

    }
Button getPositief(){
      return this.positief ;

}

   public Button getNegatief(){
        return this.negatief ;

    }
    public Text getFoutiefAntwoord() {
        return foutiefAntwoord;
    }

    public void setFoutiefAntwoord(Text foutiefAntwoord) {
        this.foutiefAntwoord = foutiefAntwoord;
    }

}
