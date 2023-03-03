package MVPtest.view;

import MVPtest.model.Spel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;

import java.util.Objects;

public class eerstePresenteer {
    private Geheel view;
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
                String id1 = event.getTarget().toString().split("id=")[1];
                String id = id1.split(",")[0];
                System.out.println(id);

            }
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
  /**      if (model.getGekozenPersoon1().getNaam() == "anoniem") {
System.out.println(view.getMijnKaartje());

        }

    }*/
        System.out.println(this.model.getGekozenPersoon1());
}
}



