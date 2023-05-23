package MVPtest.view;

import MVPtest.view.welkomsScherm.VerzamelElement;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
//import javafx.scene.layout.*;
import javafx.scene.layout.*;
import javafx.scene.text.TextFlow;
import javafx.util.Duration;

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

    private GridPane knoppenPosEnNeg;

  private BorderPane verzamelElement=new VerzamelElement();
    private MenuBar menu;

    private PopupStage popupStage;


    public Tooltip getBevestigKnopTooltip() {
        return bevestigKnopTooltip;
    }

    public void setBevestigKnopTooltip(Tooltip bevestigKnopTooltip) {
        this.bevestigKnopTooltip = bevestigKnopTooltip;
    }

    private Tooltip bevestigKnopTooltip;

private VBox hulp;


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
        this.bevestigKnopTooltip=new Tooltip("Klik op het bord om een kaartje te kiezen");
        this.knoppenPosEnNeg=new KnoppenPosEnNeg();
        this.menu= new Menu2();
        this.hulp= new VBox();



    }

    public MenuBar getMenu() {
        return menu;
    }

    public void setMenu(MenuBar menu) {
        this.menu = menu;
    }

    public PopupStage getPopupStage() {
        return popupStage;
    }

    public void setPopupStage(PopupStage popupStage) {
        this.popupStage = popupStage;
    }

    private void layoutNodes() {
        this.bord.setMinWidth(800);
        this.mijnKaartje.setMinWidth(300);
        mijnKaartje.setAlignment( Pos.CENTER);

        this.label2.setMinWidth(200);
        this.label7.setMinHeight(400);
        titel.setText("Kies een kaart");
        titel.getStyleClass().add("titel");
        titel.setMinWidth(350);
        setHalignment(titel,HPos.CENTER);
        setValignment(titel, VPos.CENTER);
        setMargin(titel,new Insets(20,0,0,10));
        this.add(label1,0,0);
        this.add(label2,1,0);
        setHalignment(bevestigKnop,HPos.CENTER);
        setValignment(bevestigKnop,VPos.TOP);
        setMargin(bevestigKnop, new Insets(150, 0, 0, 0));
        bevestigKnop.getStyleClass().add("bevestiginsbuttonDisabled");
        bevestigKnop.setId("bevestiginsbutton");
        bevestigKnopTooltip.setShowDelay(Duration.millis(0));

        bevestigKnop.setTooltip(bevestigKnopTooltip);
        this.add(bevestigKnop,2,2);
        this.add(titel,2,0);
        this.add(label5,1,1);
        this.add(label6,1,2);
        knoppenPosEnNeg.setVisible(false);
        this.add(knoppenPosEnNeg,2,2);
        popupStage=new PopupStage();
        mijnKaartje.setMouseTransparent(true);

        this.add(menu,4,0,1,1);
    setHalignment(menu,HPos.RIGHT);


       menu.setMinWidth(45);


        this.add(bord,1,0,1,3);
        setValignment(bord,VPos.CENTER);
        this.add(mijnKaartje,3,1);
        aangeduideKaartje.setAlignment(Pos.CENTER);
        this.add(aangeduideKaartje,3,2);
        this.vragen.setVisible(false);
        setValignment(vragen,VPos.TOP);
        setMargin(vragen,new Insets(30,0,0,50));
        setHalignment(vragen,HPos.CENTER);
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

  public  GridPane getKnoppenPosEnNeg(){

        return knoppenPosEnNeg;

    }

    public BorderPane getVerzamelElement() {
        return verzamelElement;
    }

    public void setVerzamelElement(BorderPane verzamelElement) {
        this.verzamelElement = verzamelElement;
    }
    public VBox getHulp() {
        return hulp;
    }

    public void setHulp(VBox hulp) {
        this.hulp = hulp;
    }

}