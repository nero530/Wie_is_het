package MVPtest.view;

import MVPtest.model.Spel;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
             String id1;
              if(event.getTarget().toString().contains("id")){
                  id1 = event.getTarget().toString().split("id=")[1].substring(0, 2);


               String id;
                if(id1.contains(",")){
                    id=id1.split(",")[0];
                }
                else{
                    id=id1.split("]")[0];
                }
                System.out.println(id);
                model.setGekozenPersoon1(model.getSpelbord1().getAllePersonen().get(Integer.parseInt(id)));
                System.out.println(model.getGekozenPersoon1().getNaam());
            }}

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
     String tekst=model.getSpelbord1().getAllePersonen().get(i).getNaam();
     VBox X =(VBox)(view.getBord().getChildren().get(i));
     Text bordnaam=(Text)X.getChildren().get(0);

     bordnaam.setText(tekst);

//Onderstaande code werkt even goed zou he voorzien op ongekend aantal vakjes
     /*Text naam=new Text(tekst);
     naam.setId(String.valueOf(i));
     ImageView fotoPersoon=new ImageView("Cheeseburger.jpg");
    fotoPersoon.setId(String.valueOf(i));
     fotoPersoon.setFitHeight(150);
     fotoPersoon.setFitWidth(150);
//view.getChildren().
    view.getBord().getChildren().add(new VBox(naam,fotoPersoon));//.getChildren().get(i);//.get(i);
    */


 }





   if (model.getGekozenPersoon1().getNaam() == "anoniem") {
       VBox mijnKaartje=view.getMijnKaartje();

    Text tekst=(Text) mijnKaartje.getChildren().get(0);
tekst.setText("Kies Een kaartje");

        }
   else{

       VBox mijnKaartje=view.getMijnKaartje();

       Text tekst=(Text) mijnKaartje.getChildren().get(0);
       tekst.setText("b");


   }


}
}



