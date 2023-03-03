package MVPtest.view;

import MVPtest.model.Persoon;
import MVPtest.model.Spel;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import org.w3c.dom.NodeList;

import java.util.Objects;

public class eerstePresenteer {
    private final Geheel view;
    private Spel model;

    public eerstePresenteer(Geheel view,Spel model) {
        this.model=model;
        this.view = view;
        this.addEventFilters();
        this.addEventHandlers();
        this.updateView();

    }


    private void addEventFilters() {
/*view.getScene().getWindow().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent mouseEvent) {
        System.out.println("mouse click detected! " + mouseEvent.getSource());
    }



    });*/
    }

    private void addEventHandlers() {
        Bord bord = (Bord) view.getBord();
        bord.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String id1=event.getTarget().toString().split("id=")[1].substring(0,2);
               String id;
                if(id1.contains(",")){
                    id=id1.split(",")[0];
                }
                else{
                    id=id1.split("]")[0];
                }
                System.out.println(id);
                //model.setGekozenPersoon1();
            }
        });
    }

    ;


        /*view.getMyButton().setOnAction( new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {;
view.getTekstveldje().setText("Er is gedrukt");




    }

});
*/


    //updateView is updaten met modelData
    private void updateView() {

 for(int i=0;i<20;i++) {
    Node doelpersoon= view.getBord().getChildren().get(0);//.getChildren().get(i);//.get(i);
     System.out.println(doelpersoon);



 }





   if (model.getGekozenPersoon1().getNaam() == "anoniem") {
       VBox mijnKaartje=view.getMijnKaartje();

    Text tekst=(Text) mijnKaartje.getChildren().get(0);
tekst.setText("Kies Een kaartje");

        }


}
}



