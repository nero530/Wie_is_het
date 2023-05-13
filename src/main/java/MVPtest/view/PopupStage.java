package MVPtest.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopupStage extends Stage {

private BorderPane rootNode = new BorderPane();
private Text titel;

private ImageView afbeelding;

    public HBox getOpnieuwOfStoppen() {
        return opnieuwOfStoppen;
    }

    public void setOpnieuwOfStoppen(HBox opnieuwOfStoppen) {
        this.opnieuwOfStoppen = opnieuwOfStoppen;
    }

    private HBox opnieuwOfStoppen;

    public Button getOpnieuw() {
        return opnieuw;
    }

    public void setOpnieuw(Button opnieuw) {
        this.opnieuw = opnieuw;
    }

    private Button opnieuw;

    public Button getStoppen() {
        return stoppen;
    }

    public void setStoppen(Button stoppen) {
        this.stoppen = stoppen;
    }

    private Button stoppen;

    public Scene getPopupScene() {
        return popupScene;
    }

    public void setPopupScene(Scene popupScene) {
        this.popupScene = popupScene;
    }

    Scene popupScene;

    public BorderPane getRootNode() {
        return rootNode;
    }

    public void setRootNode(BorderPane rootNode) {
        this.rootNode = rootNode;
    }

    public Text getTitel() {
        return titel;
    }

    public void setTitel(Text titel) {
        this.titel = titel;
    }

    public Text getContent() {
        return content;
    }

    public void setContent(Text content) {
        this.content = content;
    }

    private Text content;


    public PopupStage() {

        this.initialiseNodes();
        this.layoutNodes();

    }

    public ImageView getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(ImageView afbeelding) {
        this.afbeelding = afbeelding;
    }

    void initialiseNodes(){
    rootNode = new BorderPane();
    titel=new Text();
    afbeelding=new ImageView();
    //afbeeldingen
    opnieuw=new Button("nog een spelletje?")  ;
    stoppen=new Button("programma afsluiten");
    opnieuwOfStoppen=new HBox();



}
void layoutNodes(){

    rootNode.setTop(titel);
    opnieuwOfStoppen.getChildren().addAll(opnieuw,stoppen);
    rootNode.setBottom(opnieuwOfStoppen);
    rootNode.setCenter(afbeelding);
    rootNode.setAlignment(afbeelding,Pos.CENTER);
    rootNode.setPadding(new Insets(10,10,10,10));

    popupScene=new Scene(rootNode,400,400);



       this.setScene(getPopupScene());





    }



}