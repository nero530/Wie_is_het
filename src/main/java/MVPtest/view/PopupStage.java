package MVPtest.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopupStage extends Stage {

BorderPane rootNode = new BorderPane();
Text titel;

ImageView afbeelding;

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

    Text content;


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




}
void layoutNodes(){

    rootNode.setTop(titel);

    rootNode.setCenter(afbeelding);
    rootNode.setAlignment(afbeelding,Pos.CENTER);
    rootNode.setPadding(new Insets(10,10,10,10));

    popupScene=new Scene(rootNode);



       this.setScene(getPopupScene());





    }



}
