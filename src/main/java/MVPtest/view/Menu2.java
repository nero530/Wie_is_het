package MVPtest.view;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Menu2 extends MenuBar{




        MenuItem auteurs = new MenuItem("auteurs");

        MenuItem hulp = new MenuItem("Hulp");



    MenuItem nieuwSpel = new MenuItem("nieuw spel");


    Menu mijnMenu ;

    ImageView menuImageview;
    Image menuImage;
    MenuItem afbeelding= new MenuItem("");


        public Menu2() {
            this.initialiseNodes();
            this.layoutNodes();


        }

        private void  initialiseNodes(){
            menuImageview=new ImageView();
            menuImage=new Image("menuknopAfbeelding.PNG");
            menuImageview.setImage(menuImage);
            auteurs.setUserData("auteurs");
            hulp.setUserData("Hulp");
            nieuwSpel.setUserData("nieuwSpel");
            mijnMenu=new Menu("Menu");
           menuImageview.setFitWidth(40);
            menuImageview.setFitHeight(40);
mijnMenu.setGraphic(menuImageview);

            mijnMenu.getItems().addAll(hulp,nieuwSpel);




        }

        private void layoutNodes(){
        this.setMinWidth(130);
        this.getMenus().add(mijnMenu);

        }
    public MenuItem getNieuwSpel() {
        return nieuwSpel;
    }

    public void setNieuwSpel(MenuItem nieuwSpel) {
        this.nieuwSpel = nieuwSpel;
    }

    }


