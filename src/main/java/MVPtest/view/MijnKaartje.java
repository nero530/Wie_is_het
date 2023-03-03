package MVPtest.view;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class MijnKaartje extends VBox {
private TextField naam;
    private ImageView fotoDier;
    private TextField soort;
    private TextField vacht;


    public MijnKaartje() {

        this.initialiseNodes();
        this.layoutNodes();

    }

    public void initialiseNodes() {
        this.naam=new TextField();
        this.soort=new TextField();
        this.vacht=new TextField();


        this.fotoDier = new ImageView("Cheeseburger.jpg");



    }
    public void layoutNodes(){
        fotoDier.isPreserveRatio();
        fotoDier.setFitHeight(80);
        fotoDier.setFitWidth(80);

        naam.setText("cheeseBurger");
        naam.setEditable(false);
        naam.setMouseTransparent(true);

        soort.setText("zoogdier");
        soort.setEditable(false);
        vacht.setText("zwart");
        vacht.setEditable(false);

        this.getChildren().addAll(naam,fotoDier,soort,vacht);


    }


}
