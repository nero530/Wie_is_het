package MVPtest.view;
import MVPtest.model.Persoon;
import MVPtest.model.Spel;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.util.Duration;
import java.io.*;
import java.nio.charset.StandardCharsets;



import static java.lang.Boolean.parseBoolean;

public class eerstePresenteer {
    private final Geheel view;
    private final Spel model;

    public eerstePresenteer(Geheel view,Spel model) {
        this.model=model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();




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
                    if (event.getButton().equals(MouseButton.PRIMARY)) {
                        //Dubbele klik was ook een optie geweest ipv rechter muisknop
                        //System.out.println(event.getClickCount());
                        if (view.titel.getText().equals("Kies een kaart")) {
                            view.getBevestigKnop().getStyleClass().remove("bevestiginsbuttonDisabled");
                            view.getBevestigKnop().setTooltip(null);
                            view.getBevestigKnopTooltip().setText("Je hebt geen vraag geselecteerd");
                            view.getMijnKaartje().setVisible(true);
                            model.setGekozenPersoon1(model.getSpelbord1().getAllePersonen().get(Integer.parseInt(id)));
                            System.out.println(model.getGekozenPersoon1().getNaam());
                            VBox mijnKaartje = view.getMijnKaartje();
                            Text naamKaartje = (Text) mijnKaartje.getChildren().get(0);
                            naamKaartje.setText(model.getGekozenPersoon1().getNaam());
                            Text geslacht = (Text) mijnKaartje.getChildren().get(2);
                            if (!model.getGekozenPersoon1().isVrouw()) {
                                geslacht.setText("♀");
                            } else {
                                geslacht.setText("♂");
                            }
                            Text bril = (Text) mijnKaartje.getChildren().get(3);
                            if (!model.getGekozenPersoon1().isBril()) {
                                bril.setText("bril: \uD83D\uDDF8");
                            } else {
                                bril.setText("bril: ❌");
                            }
                            Text baard = (Text) mijnKaartje.getChildren().get(4);
                            if (!model.getGekozenPersoon1().isBaard()) {
                                baard.setText("baard: \uD83D\uDDF8");
                            } else {
                                baard.setText("baard:❌");
                            }
                            Text kaal = (Text) mijnKaartje.getChildren().get(5);
                            if (!model.getGekozenPersoon1().isKaal()) {
                                kaal.setText("kaal: \uD83D\uDDF8");
                            } else {
                                kaal.setText("kaal: ❌");
                            }
                            Text hoofddeksel = (Text) mijnKaartje.getChildren().get(6);
                            if (!model.getGekozenPersoon1().isHoofddeksel()) {
                                hoofddeksel.setText("hoofddeksel: \uD83D\uDDF8");
                            } else {
                                hoofddeksel.setText("hoofddeksel: ❌");
                            }
                            Text snor = (Text) mijnKaartje.getChildren().get(7);
                            if (!model.getGekozenPersoon1().isSnor()) {
                                snor.setText("snor: \uD83D\uDDF8");
                            } else {
                                snor.setText("snor: ❌");
                            }


                            Text ogen = (Text) mijnKaartje.getChildren().get(8);
                            if ("GRIJS".equals(String.valueOf(model.getGekozenPersoon1().getOogkleur()))) {
                                ogen.setText("oogkleur: Grijs");
                            } else if ("BRUIN".equals(String.valueOf(model.getGekozenPersoon1().getOogkleur()))) {
                                ogen.setText("oogkleur: Bruin");
                            } else if ("ZWART".equals(String.valueOf(model.getGekozenPersoon1().getOogkleur()))) {
                                ogen.setText("oogkleur:Zwart");
                            }
                            Text haren = (Text) mijnKaartje.getChildren().get(9);
                            if ("ZWART".equals(String.valueOf(model.getGekozenPersoon1().getHaarkleur()))) {
                                haren.setText("haarkleur: Zwart");
                            }
                            if ("BRUIN".equals(String.valueOf(model.getGekozenPersoon1().getHaarkleur()))) {
                                haren.setText("haarkleur: Bruin");
                            }
                            if ("BLOND".equals(String.valueOf(model.getGekozenPersoon1().getHaarkleur()))) {
                                haren.setText("haarkleur:blond");
                            }

                            ImageView ImageKaartje = (ImageView) mijnKaartje.getChildren().get(1);
                            ImageKaartje.setImage(new Image(model.getGekozenPersoon1().getNaam().toLowerCase() + ".png"));
                            ImageKaartje.setVisible(true);

                        }
                        // 1) getter voor titel ontbreekt
                        // 2) Het spel hieronder is op te delen in fase. Een String property genaamd fase zou regels zoals deze hieronder mijden
                        //en het schrijven van de code veel gemakkelijker gemaakt hebben.
                        else if ((view.titel.getText().equals("ja") || view.titel.getText().equals("Nee") || view.getBevestigKnop().getText().equals("Klaar met bord") || view.getBevestigKnop().getText().equals("Ja")) && (view.titel.getText().charAt(view.titel.getText().length() - 1) != '?' && view.titel.getText().charAt(view.titel.getText().length() - 1) != '!' || view.getBevestigKnop().getText().equalsIgnoreCase("ja"))) {
                          int aantalUitgeschakeld=0;
                            for(int i=0;i<view.getBord().getChildren().size();i++ ){
                                if(view.getBord().getChildren().get(i).getStyleClass().contains("uitgeschakeld")){
                                  aantalUitgeschakeld++;
                                }



                            }

                            if(aantalUitgeschakeld==19&&!view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().contains("uitgeschakeld")){}


                            else{

                            if (!view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().contains("uitgeschakeld")) {
                                view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().add("uitgeschakeld");
                            } else {
                                view.getBord().getChildren().get(Integer.parseInt(id)).getStyleClass().remove("uitgeschakeld");
                            }
                            String erStaatErNogMaarEenRecht = model.draaiKaartjeOm(Integer.parseInt(id));

                            if (!erStaatErNogMaarEenRecht.equals("meerDanEen")) {
                                view.titel.setUserData(view.titel.getText());
                                view.titel.setText("Denk je dat " + erStaatErNogMaarEenRecht + " de persoon is?");
                                view.getBevestigKnop().setText("Ja");


                            } else {
                                if (view.titel.getUserData() != null) {
                                    view.titel.setText((String) view.titel.getUserData());
                                    view.titel.setUserData(null);
                                }
                                view.getBevestigKnop().setText("Klaar met bord");

                            }
                            }
                        }
                    }
                    else{

                        VBox aangeduideView=view.getAangeduideKaartje();
                      Persoon aangeduidModel=  model.getSpelbord1().getAllePersonen().get(Integer.parseInt(id));
                        Text naam= (Text)aangeduideView.getChildren().get(0);
                        naam.setText(aangeduidModel.getNaam());
                      Text geslacht=   (Text)aangeduideView.getChildren().get(2);
                        if (!aangeduidModel.isVrouw()) {
                            geslacht.setText("♂");
                        } else {
                            geslacht.setText("♀");
                        }
                        Text bril = (Text) aangeduideView.getChildren().get(3);
                        if (!aangeduidModel.isBril()) {
                            bril.setText("bril: \uD83D\uDDF8");
                        } else {
                            bril.setText("bril: ❌");
                        }
                        Text baard = (Text) aangeduideView.getChildren().get(4);
                        if (!aangeduidModel.isBaard()) {
                            baard.setText("baard: \uD83D\uDDF8");
                        } else {
                            baard.setText("baard:❌");
                        }
                        Text kaal = (Text) aangeduideView.getChildren().get(5);
                        if (!aangeduidModel.isKaal()) {
                            kaal.setText("kaal: \uD83D\uDDF8");
                        } else {
                            kaal.setText("kaal: ❌");
                        }
                        Text hoofddeksel = (Text) aangeduideView.getChildren().get(6);
                        if (!aangeduidModel.isHoofddeksel()) {
                            hoofddeksel.setText("hoofddeksel: \uD83D\uDDF8");
                        } else {
                            hoofddeksel.setText("hoofddeksel: ❌");
                        }
                        Text snor = (Text) aangeduideView.getChildren().get(7);
                        if (!aangeduidModel.isSnor()) {
                            snor.setText("snor: \uD83D\uDDF8");
                        } else {
                            snor.setText("hoofddeksel: ❌");
                        }


                        Text ogen = (Text) aangeduideView.getChildren().get(8);
                        if ("GRIJS".equals(String.valueOf(aangeduidModel.getOogkleur()))) {
                            ogen.setText("oogkleur: Grijs");
                        } else if ("BRUIN".equals(String.valueOf(aangeduidModel.getOogkleur()))) {
                            ogen.setText("oogkleur: Bruin");
                        } else if ("ZWART".equals(String.valueOf(aangeduidModel.getOogkleur()))) {
                            ogen.setText("oogkleur:Zwart");
                        }
                        Text haren = (Text) aangeduideView.getChildren().get(9);
                        if ("ZWART".equals(String.valueOf(aangeduidModel.getHaarkleur()))) {
                            haren.setText("haarkleur: Zwart");
                        }
                        if ("BRUIN".equals(String.valueOf(aangeduidModel.getHaarkleur()))) {
                            haren.setText("haarkleur: Bruin");
                        }
                        if ("BLOND".equals(String.valueOf(aangeduidModel.getHaarkleur()))) {
                            haren.setText("haarkleur:blond");
                        }

                        ImageView ImageKaartje = (ImageView) aangeduideView.getChildren().get(1);


                        ImageKaartje.setImage(new Image(aangeduidModel.getNaam().toLowerCase() + ".png"));
                        ImageKaartje.setVisible(true);
                        view.getAangeduideKaartje().setVisible(true);;


                    }

                } }




        });
        Button bevestigbutton=view.getBevestigKnop();
        bevestigbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                //de titel heeft geen getter...


                if(view.titel.getText().equals("Kies een kaart")&&!model.getGekozenPersoon1().getNaam().equals("anoniem")){

                    view.titel.setText("Welke vraag zou je willen stellen?");
                    view.getVragen().setVisible(true);

                   Text foutmelding= (Text)view.getKnoppenPosEnNeg().getChildren().get(2);

                    foutmelding.setVisible(false);
                    view.getBevestigKnop().setTooltip(view.getBevestigKnopTooltip());
                    view.getBevestigKnop().getStyleClass().add("bevestiginsbuttonDisabled");
                    view.getBevestigKnop().setTooltip(view.getBevestigKnopTooltip());

                }
                else if(view.titel.getText().equals("Welke vraag zou je willen stellen?")){


                    if(view.getBevestigKnop().getUserData()!=null){
                        final Node gezocht=  view.getBevestigKnop().getScene().lookup("#focusButton");
                        if(gezocht!=null){

                            gezocht.setId("");







                      boolean antwoord= model.vraagBeantwoorden(view.getBevestigKnop().getUserData().toString());
                      if(antwoord){    view.titel.setText("Ja");}
                      else{view.titel.setText("Nee");}
                        view.getBevestigKnop().setText("Klaar met bord");
                      view.getVragen().setVisible(false);
                    }

                    }
                }
                else if(view.getBevestigKnop().getText().equals("Ja")||view.titel.getText().contains("computer")) {

                        String verdachte = view.titel.getText();
                        verdachte = verdachte.replace("Denk je dat ", "");
                        verdachte = verdachte.replace(" de persoon is?", "");



                        PopupStage eindstage = new PopupStage();
                    eindstage.getOpnieuw().setOnAction(e->{

                        System.out.println(e);
                        Event.fireEvent(view.getMenu().getMenus().get(0).getItems().get(1),new ActionEvent());
                        eindstage.close();

                    } )  ;

                    eindstage.getStoppen().setOnAction(e->{


                        Platform.runLater(() ->{ try{ Platform.exit();} catch (Exception ignored) {

                   //   platform Runlater samen met Platform exit geeft een exception, maar doet zijn werk wel.

                        }


                        });

                    } )  ;



                        eindstage.initModality(Modality.APPLICATION_MODAL);
                        eindstage.initStyle(StageStyle.DECORATED);

                    Stage huidigeScene =(Stage) view.getScene().getWindow();
                    huidigeScene.setFullScreen(false);
                        if (model.getGekozenPersoon2().getNaam().trim().equals(verdachte.trim()) &&!view.titel.getText().contains("computer")) {

                            eindstage.getTitel().setText("Proficiat je hebt gewonnen");
                            eindstage.setTitle("proficiat");

                            eindstage.getAfbeelding().setImage(new Image("gewonnen.jpg"));
                        } else {
                            eindstage.getTitel().setText("Oei... Je hebt verloren \n De computer had " + model.getGekozenPersoon2().getNaam());
                            eindstage.getAfbeelding().setImage(new Image(model.getGekozenPersoon2().getNaam().toLowerCase() + ".png"));
                            eindstage.setTitle("Oei je hebt verloren");
                        }



                    eindstage.setOnHiding((e)->huidigeScene.setFullScreen(true));
                   eindstage.showAndWait();



                }
                  else if(view.getBevestigKnop().getText().equals("Klaar met bord")){


                            try {
                                String[] vraagComputer=model.computerSteltVraag();

                                view.titel.setText(vraagComputer[0]);
                               if(vraagComputer[0].contains("computer")) {
                                   PopupStage eindstage = new PopupStage();
                                   eindstage.getOpnieuw().setOnAction(j->
             {
                eindstage.close();
                // Een van de mogelijkheden om de hoeveelheid code te beperken
                 Event.fireEvent(view.getMenu().getMenus().get(0).getItems().get(1),new ActionEvent());  ;




                                       });
                                           eindstage.getStoppen().setOnAction(j->
                                           {Platform.exit();

                                           }

                                       );
                                eindstage.getTitel().setText("Oei... Je hebt verloren \n De computer had " + model.getGekozenPersoon2().getNaam());
                                eindstage.getAfbeelding().setImage(new Image(model.getGekozenPersoon2().getNaam().toLowerCase() + ".png"));
                                eindstage.setTitle("Oei je hebt verloren");
                                   Stage huidigeScene =(Stage) view.getScene().getWindow();
                                   huidigeScene.setFullScreen(false);
                                   eindstage.setOnHiding(e->eindstage.close());
                                eindstage.showAndWait();

                            }


                                bevestigbutton.setText("Bevestigen");

                                bevestigbutton.setVisible(false);
                                Button positief= (Button) view.getKnoppenPosEnNeg().getChildren().get(0);
                                Button negatief= (Button) view.getKnoppenPosEnNeg().getChildren().get(1);
                                Text foutmelding= (Text) view.getKnoppenPosEnNeg().getChildren().get(2);

                                if( parseBoolean(vraagComputer[1])) {
                                     positief.setUserData(false);
                                    negatief.setUserData(true);

                                }
                                 else {
                                     negatief.setUserData(false);
                                    positief.setUserData(true);

                                }

                                foutmelding.setVisible(false);
                                view.getKnoppenPosEnNeg().setVisible(true);

                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }


                        }



            }







        });

        GridPane vragen = view.getVragen();

        for(Node child:   vragen.getChildren()){
            System.out.println(child);
            if(child instanceof Button){
child.setOnMouseClicked(new EventHandler<MouseEvent>() {

                            @Override
                            public void handle(MouseEvent event) {

                            Button bevestigknop=view.getBevestigKnop();
                            view.getBevestigKnop().setUserData(event.getSource().toString().split("'")[1]);

                            GridPane KnoppenStylenopKlik= view.getVragen();
                               Button target= (Button) event.getSource();

                               Node gezocht=  KnoppenStylenopKlik.getScene().lookup("#focusButton");


                                if(gezocht==null){
                                    target.setId("focusButton");

                                } else if (gezocht==target) {
                                    if (target.getId().equals("focusButton")) {
                                        target.setId("");
                                    } else {
                                        target.setId("focusButton");
                                    }
                                    ;
                                }
                                else{
                                    target.setId("focusButton");
                                    gezocht.setId("");

                                }

                                final Node vraagGekozen=  view.getBevestigKnop().getScene().lookup("#focusButton");


                                if(vraagGekozen==null){
                                    bevestigknop.setTooltip(view.getBevestigKnopTooltip());
                                    bevestigknop.getStyleClass().add("bevestiginsbuttonDisabled");
                                    bevestigknop.setTooltip(view.getBevestigKnopTooltip());
                                }
                                else{

                                    bevestigknop.setTooltip(null);
                                    bevestigknop.getStyleClass().remove("bevestiginsbuttonDisabled");



                                }


                            }



        });



            }else if(child instanceof HBox){
                ((HBox) child).getChildren().forEach(ch->ch.setOnMouseClicked(new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent event) {

                        view.getBevestigKnop().setUserData(event.getSource().toString().split("'")[1]);

                        Button target= (Button) event.getSource();
                        GridPane KnoppenStylenopKlik= view.getVragen();
                        final Node gezocht=  KnoppenStylenopKlik.getScene().lookup("#focusButton");
                        if(gezocht==null){
                            target.setId("focusButton");

                        } else if (gezocht==target) {
                            if (target.getId().equals("focusButton")) {
                                target.setId("");
                            } else {
                                target.setId("focusButton");
                            }
                            ;
                        }
                        else{
                            target.setId("focusButton");
                            gezocht.setId("");

                        }
                        final Node vraagGekozen=  view.getBevestigKnop().getScene().lookup("#focusButton");
                        Button bevestigknop=view.getBevestigKnop();

                        if(vraagGekozen==null){
                            bevestigknop.setTooltip(view.getBevestigKnopTooltip());
                            bevestigknop.getStyleClass().add("bevestiginsbuttonDisabled");
                            bevestigknop.setTooltip(view.getBevestigKnopTooltip());
                        }
                        else{

                            bevestigknop.setTooltip(null);
                            bevestigknop.getStyleClass().remove("bevestiginsbuttonDisabled");



                        }


                    }



                }));





            }





        }

        Button pos= (Button) view.getKnoppenPosEnNeg().getChildren().get(0);
        Button neg= (Button) view.getKnoppenPosEnNeg().getChildren().get(1);

        pos.setOnAction(new EventHandler<ActionEvent>() {
                                         @Override
                                         public void handle(ActionEvent event) {

                                           final Button target=(Button) event.getTarget();
                                             System.out.println(target.getUserData());
                                           if(parseBoolean(target.getUserData().toString())) {
                                                view.getBevestigKnop().setVisible(true);
                                               if(!view.getBevestigKnop().getStyleClass().contains("bevestiginsbuttonDisabled")){
                                                   view.getBevestigKnop().getStyleClass().add("bevestiginsbuttonDisabled");
                                                   view.getBevestigKnop().setTooltip(view.getBevestigKnopTooltip());


                                               }

                                               view.getVragen().setVisible(true);
                                               view.getKnoppenPosEnNeg().setVisible(false);
                                                view.titel.setText("Welke vraag zou je willen stellen?");
                                           }
                                           else{

                                               view.getKnoppenPosEnNeg().getChildren().get(2).setVisible(true);

                                               PauseTransition delay = new PauseTransition(Duration.seconds(3));
                                               delay.setOnFinished(e-> {
                                                   if(view.getKnoppenPosEnNeg().getChildren().get(2).isVisible()){
                                                   view.getKnoppenPosEnNeg().getChildren().get(2).setVisible(false);;} });
                                               delay.play();

                                           }

                                         }
                                     });
   neg.setOnAction(new EventHandler<ActionEvent>() {
       @Override
       public void handle(ActionEvent event) {
           final Button target=(Button) event.getTarget();

           if(parseBoolean(target.getUserData().toString())){
               view.getBevestigKnop().setVisible(true);
               view.getVragen().setVisible(true);
               if(!view.getBevestigKnop().getStyleClass().contains("bevestiginsbuttonDisabled")){

                   view.getBevestigKnop().getStyleClass().add("bevestiginsbuttonDisabled");
                   view.getBevestigKnop().setTooltip(view.getBevestigKnopTooltip());

               }
               view.getKnoppenPosEnNeg().setVisible(false);
               view.titel.setText("Welke vraag zou je willen stellen?");
           }
           else {
               view.getKnoppenPosEnNeg().getChildren().get(2).setVisible(true);

               PauseTransition delay = new PauseTransition(Duration.seconds(3));
               delay.setOnFinished(e-> {
                   view.getKnoppenPosEnNeg().getChildren().get(2).setVisible(false);; });
               delay.play();


           }
       }
   }


   );



view.getMenu().getMenus().forEach(e->e.setOnAction(b->
{
    final MenuItem geklikteMenuItem = (MenuItem) b.getTarget();
    System.out.println(geklikteMenuItem.getUserData());

    File file;
    InputStream resource = null;
    String titel=geklikteMenuItem.getUserData().toString();
    Stage menuStage=new Stage(StageStyle.DECORATED);
    menuStage.initModality(Modality.WINDOW_MODAL);
    menuStage.initStyle(StageStyle.DECORATED);

    if (geklikteMenuItem.getUserData() == "Hulp") {
   Stage currentStage = (Stage) view.getScene().getWindow();
   currentStage.setFullScreen(false);
   resource = getClass().getClassLoader().getResourceAsStream("hulp.txt");
   menuStage.setScene(null);
   VBox vboxVoorScene = new VBox(5);
   Scene scene2 = new Scene(vboxVoorScene,700,500);
   scene2.getStylesheets().add("Opmaak.css");
   menuStage.setScene(scene2);
   view.getHulp().getChildren().clear();
   try (InputStreamReader streamReader =
    new InputStreamReader(resource, StandardCharsets.UTF_8);
   BufferedReader reader = new BufferedReader(streamReader)) {
   String line;
  while ((line = reader.readLine()) != null) {
            Label label=new Label(line);

            vboxVoorScene.getChildren().add(label);
        }

        vboxVoorScene.getStyleClass().add("hulpVBox");

    } catch (IOException er) {
        er.printStackTrace();
    }


            menuStage.setTitle(titel.toLowerCase());



                menuStage.showAndWait();


        Platform.runLater(() -> {
            currentStage.requestFocus();
            currentStage.setFullScreen(true);});





    }
    else if((geklikteMenuItem.getUserData().equals("nieuwSpel") )){

        view.getBord().getChildren().forEach((i)->{
            if(i.getStyleClass().toString().equals("uitgeschakeld")){

                i.getStyleClass().remove("uitgeschakeld");
            }


                model.nieuwSpel();
                view.getVragen().setVisible(false);
                view.titel.setText("Kies een kaart");
                view.getMijnKaartje().setVisible(false);
                view.getBevestigKnop().setTooltip(view.getBevestigKnopTooltip());
                view.getBevestigKnopTooltip().setText("Klik op het bord om een kaartje te kiezen");


                Platform.runLater(new Runnable() {
               @Override
               public void run() {
                   view.getBevestigKnop().setVisible(true);
                   view.getKnoppenPosEnNeg().setVisible(false);
                   view.getBord().getChildren().forEach((i)->{
                       if(i.getStyleClass().toString().contains("uitgeschakeld")){

                           i.getStyleClass().remove("uitgeschakeld");
                       }

               });
                             }});

            view.getBevestigKnop().setText("Bevestigen");
            if(!view.getBevestigKnop().getStyleClass().contains("bevestiginsbuttonDisabled") ){

                view.getBevestigKnop().getStyleClass().add("bevestiginsbuttonDisabled");

            }

                view.getAangeduideKaartje().setVisible(false);;
            final Node gezocht=  view.getBevestigKnop().getScene().lookup("#focusButton");
        if(gezocht!=null){
            gezocht.setId("");
        }


        });


    }}));
    }



    private void updateView() {

 for(int i=0;i<20;i++) {
     String tekst=model.getSpelbord1().getAllePersonen().get(i).getNaam();
     VBox X =(VBox)(view.getBord().getChildren().get(i));

     Text bordnaam=(Text)X.getChildren().get(0);
     bordnaam.setText(tekst);
     ImageView fotoBord= (ImageView)X.getChildren().get(1);
     System.out.println(tekst.toLowerCase()+".png");
     fotoBord.setImage(new Image(tekst.toLowerCase()+".png"));


 }


}
}



