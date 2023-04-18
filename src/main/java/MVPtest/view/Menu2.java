package MVPtest.view;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;

public class Menu2 extends MenuBar{




        MenuItem auteurs = new MenuItem("auteurs");

        MenuItem hulp = new MenuItem("hulp");
        MenuItem nieuwSpel = new MenuItem("nieuw spel");
        MenuItem bewaren = new MenuItem("bewaren");

        Menu mijnMenu ;


        public Menu2() {
            this.initialiseNodes();
            this.layoutNodes();


        }

        private void  initialiseNodes(){

            auteurs.setUserData("auteurs");
            hulp.setUserData("hulp");
            nieuwSpel.setUserData("nieuwSpel");
            bewaren.setUserData(bewaren);
            // toggleGroup.getToggles().addAll(auteurs,hulp,nieuwSpel,bewaren);
            mijnMenu=new Menu("Menu");
            mijnMenu.getItems().addAll(auteurs,hulp,nieuwSpel,bewaren);




        }

        private void layoutNodes(){

      this.getMenus().add(mijnMenu);
        }


    }


