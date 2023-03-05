package MVPtest.view;

import MVPtest.model.Spel;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import org.w3c.dom.NodeList;
import javafx.event.ActionEvent;
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
                if (event.getTarget().toString().contains("id")) {
                    id1 = event.getTarget().toString().split("id=")[1].substring(0, 2);


                    String id;
                    if (id1.contains(",")) {
                        id = id1.split(",")[0];
                    } else {
                        id = id1.split("]")[0];
                    }
                   // System.out.println(id);
                    if (view.titel.getText().equals("Kies een kaart")) {

                        model.setGekozenPersoon1(model.getSpelbord1().getAllePersonen().get(Integer.parseInt(id)));
                        System.out.println(model.getGekozenPersoon1().getNaam());
                        VBox mijnKaartje = view.getMijnKaartje();
                        Text TekstKaartje = (Text) mijnKaartje.getChildren().get(0);
                        TekstKaartje.setText(model.getGekozenPersoon1().getNaam());
                        ImageView ImageKaartje = (ImageView) mijnKaartje.getChildren().get(1);

                        ImageKaartje.setImage(new Image("MogelijkeFotos.PNG"));
                        ImageKaartje.setVisible(true);
//Hier ook de foto Aanpassen
                    }
                    //getter voor titel
                    else if (view.titel.getText().equals("Ja")||view.titel.getText().equals("Nee")||view.getBevestigKnop().getText().equals("Klaar met bord")||view.getBevestigKnop().getText().equals("Ja")) {
                   //wat zou notifyAll doen()?
                  //String klasseKaartje= String.valueOf(event.getTarget().getClass());
                   if(! view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().contains("uitgeschakeld")){
                       view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().add("uitgeschakeld");
                  // System.out.println(  view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().contains("uitgeschakeld"));
                   } else {
                       view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().remove("uitgeschakeld");
                   }
                  String erStaatErNogMaarEenRecht= model.draaiKaartjeOm(Integer.parseInt(id));
                  //   String HuidigeTitel=   String.valueOf(view.titel.getText());
                    if(!erStaatErNogMaarEenRecht.equals("meerDanEen")){
                    view.titel.setUserData(view.titel.getText());
                        view.titel.setText("Denk je dat "+erStaatErNogMaarEenRecht+" de persoon is?");
                        view.getBevestigKnop().setText("Ja");
                        }
                    else{
                        if(view.titel.getUserData()!=null) {
                            view.titel.setText((String) view.titel.getUserData());
                            view.titel.setUserData(null);
                        }
                        view.getBevestigKnop().setText("Klaar met bord");


                    }
                    }
                }
            }

        });
        Button bevestigbutton=view.getBevestigKnop();
        bevestigbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                //Maak getter voor titel
              //  System.out.println("JA");
                if(view.titel.getText().equals("Kies een kaart")&&!model.getGekozenPersoon1().getNaam().equals("anoniem")){

                    view.titel.setText("Welke vraag zou je willen stellen?");
                    view.getVragen().setVisible(true);


                }
                else if(view.titel.getText().equals("Welke vraag zou je willen stellen?")){
                    if(view.getBevestigKnop().getUserData()!=null){

                     // System.out.println(model.vraagBeantwoorden(view.getBevestigKnop().getUserData().toString()));
                      boolean antwoord= model.vraagBeantwoorden(view.getBevestigKnop().getUserData().toString());
                        System.out.println(antwoord);
                      if(antwoord){    view.titel.setText("Ja");}
                      else{view.titel.setText("Nee");}
                        view.getBevestigKnop().setText("Klaar met bord");
                      view.getVragen().setVisible(false);

                    }
                }
                        if(view.getBevestigKnop().getText().equals("Klaar met bord")){

                            try {
                                String vraagCompurt=model.computerSteltVraag();
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }


                        }



            }});

        GridPane vragen = view.getVragen();

        for(Node child:   vragen.getChildren()){
            if(child instanceof Button){
child.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent event) {
                                //System.out.println(event.getSource().toString().split("'")[1]);
                            view.getBevestigKnop().setUserData(event.getSource().toString().split("'")[1]);
                               // System.out.println(bevestigbutton.getUserData());
                            }



        });
            }}}


       /*
        });*/



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



}
}



