package MVPtest.view;

public class eerstePresenteer {
    private Geheel view;

    public eerstePresenteer(Geheel view){

        this.view=view;
        this.addEventFilters();
        this.addEventHandlers();
        this.updateView();

    }


    private void addEventFilters(){
/*view.getScene().getWindow().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent mouseEvent) {
        System.out.println("mouse click detected! " + mouseEvent.getSource());
    }



    });*/
    }

    private void addEventHandlers() {



        /*view.getMyButton().setOnAction( new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {;
view.getTekstveldje().setText("Er is gedrukt");




    }

});
*/


    }


    //updateView is updaten met modelData
   private void updateView(){




   }

}



