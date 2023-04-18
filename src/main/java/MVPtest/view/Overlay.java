package MVPtest.view;

import javafx.scene.text.Text;

public class Overlay extends javafx.stage.Popup {

    Text text=new Text();

    public Overlay() {

        this.initialiseNodes();
        this.layoutNodes();

    }

private void initialiseNodes(){


}

private void layoutNodes(){
this.centerOnScreen();

text.setText("HALLO");
       this.getContent().add(text) ;





}

}
