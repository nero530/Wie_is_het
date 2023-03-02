package MVPtest.model;

public class Persoon {


 private String naam;
 private boolean vrouw;
 private boolean bril;
 private boolean kaal;
 private boolean hoofddeksel;
 private boolean snor;
 private boolean baard;
 private Haar haarkleur;
 private Ogen oogkleur;


 public Persoon(String naam,boolean vrouw, boolean bril,boolean kaal, boolean hoofddeksel, boolean snor, boolean baard, Haar haarkleur, Ogen oogkleur ) {


 }

 enum Haar {
  ZWART,
  BRUIN,
  BLOND;
 }

 enum Ogen {
  GRIJS,
  BRUIN,
  ZWART;
 }

}