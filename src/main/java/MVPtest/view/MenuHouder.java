package MVPtest.view;


import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class MenuHouder extends HBox {


    Button auteurs = new Button("auteurs");

    Button hulp = new Button("Hulp");
    Button nieuwSpel = new Button("Nieuw spel");
    Button bewaren = new Button("bewaren");




    public MenuHouder() {
this.initialiseNodes();
this.layoutNodes();


    }

    private void  initialiseNodes(){

        auteurs.setUserData("auteurs");
        hulp.setUserData("Hulp");
        nieuwSpel.setUserData("nieuwSpel");
        bewaren.setUserData(bewaren);
       // toggleGroup.getToggles().addAll(auteurs,Hulp,nieuwSpel,bewaren);





    }

private void layoutNodes(){




this.getChildren().addAll(auteurs,hulp,nieuwSpel,bewaren);
}


}
