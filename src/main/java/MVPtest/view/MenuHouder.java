package MVPtest.view;


import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class MenuHouder extends HBox {


    Button auteurs = new Button("auteurs");

    Button hulp = new Button("hulp");
    Button nieuwSpel = new Button("nieuw spel");
    Button bewaren = new Button("bewaren");




    public MenuHouder() {
this.initialiseNodes();
this.layoutNodes();


    }

    private void  initialiseNodes(){

        auteurs.setUserData("auteurs");
        hulp.setUserData("hulp");
        nieuwSpel.setUserData("nieuwSpel");
        bewaren.setUserData(bewaren);
       // toggleGroup.getToggles().addAll(auteurs,hulp,nieuwSpel,bewaren);





    }

private void layoutNodes(){




this.getChildren().addAll(auteurs,hulp,nieuwSpel,bewaren);
}


}
