package MVPtest.view;

import MVPtest.view.welkomsScherm.VerzamelElement;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
//import javafx.scene.layout.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;

public class Geheel extends GridPane {
    public void setBord(TilePane bord) {
        this.bord = bord;
    }

    private TilePane bord;
    private VBox mijnKaartje;
    private VBox aangeduideKaartje;
    private GridPane vragen;
    final Label label1 = new Label("");
    final Label label2 = new Label("");
    final Label titel = new Label("");
    private Button bevestigKnop;
    final Label label5 = new Label("");
    final Label label6 = new Label("");
    final Label label7 = new Label("");

    private HBox knoppenPosEnNeg;

  private  GridPane verzamelElement=new VerzamelElement();
    private MenuBar menu;


    public Geheel() {
        this.initialiseNodes();
        this.layoutNodes();



    }


    public VBox getAangeduideKaartje() {
        return aangeduideKaartje;
    }

    public void setAangeduideKaartje(VBox aangeduideKaartje) {
        this.aangeduideKaartje = aangeduideKaartje;
    }

    private void initialiseNodes() {
        this.bord = new Bord();
        this.mijnKaartje = new MijnKaartje();
        this.aangeduideKaartje=new MijnKaartje();
        this.vragen=new Vragen();
        this.bevestigKnop=new Button("bevestig Keuze");
    this.knoppenPosEnNeg=new KnoppenPosEnNeg();
        this.menu= new Menu2();


    }

    public MenuBar getMenu() {
        return menu;
    }

    public void setMenu(MenuBar menu) {
        this.menu = menu;
    }

    private void layoutNodes() {
        this.bord.setMinWidth(800);
        this.mijnKaartje.setMinWidth(300);
       mijnKaartje.setAlignment( Pos.CENTER);

       // mijnKaartje.set
        this.label2.setMinWidth(200);
        this.label7.setMinHeight(400);
        titel.setText("Kies een kaart");
        titel.getStyleClass().add("titel");
        setHalignment(titel,HPos.CENTER);
        setValignment(titel, VPos.CENTER);
setMargin(titel,new Insets(20,0,0,0));
        // setPercentWidth
        this.add(label1,0,0);
        this.add(label2,1,0);
setHalignment(bevestigKnop,HPos.CENTER);
        this.add(bevestigKnop,2,3);
        this.add(titel,2,0);
        this.add(label5,1,1);
        this.add(label6,1,2);
        knoppenPosEnNeg.setVisible(false);
        this.add(knoppenPosEnNeg,2,3);




        mijnKaartje.setMouseTransparent(true);



        this.add(menu,3,4);
        setHalignment(menu,HPos.RIGHT);
        setValignment(menu,VPos.BOTTOM);

        this.add(bord,1,1,1,3);
        this.add(mijnKaartje,3,1);
        this.add(aangeduideKaartje,3,2);
        // @BUG
        this.vragen.setVisible(false);
        this.add(vragen,2,1,1,2);

    }



   public TilePane getBord(){

        return bord ;

    }

   public VBox getMijnKaartje(){

        return mijnKaartje;

    }
  public  GridPane getVragen(){

        return vragen;

    }

  public  Button getBevestigKnop(){

        return bevestigKnop;

    }

  public  HBox getKnoppenPosEnNeg(){

        return knoppenPosEnNeg;

    }

    public GridPane getVerzamelElement() {
        return verzamelElement;
    }

    public void setVerzamelElement(GridPane verzamelElement) {
        this.verzamelElement = verzamelElement;
    }
}