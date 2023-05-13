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


 public void setNaam(String naam) {
  this.naam = naam;
 }

 public boolean isVrouw() {
  return vrouw;
 }

 public void setVrouw(boolean vrouw) {
  this.vrouw = vrouw;
 }

 public boolean isBril() {
  return bril;
 }

 public void setBril(boolean bril) {
  this.bril = bril;
 }

 public boolean isKaal() {
  return kaal;
 }

 public void setKaal(boolean kaal) {
  this.kaal = kaal;
 }

 public boolean isHoofddeksel() {
  return hoofddeksel;
 }

 public void setHoofddeksel(boolean hoofddeksel) {
  this.hoofddeksel = hoofddeksel;
 }

 public boolean isSnor() {
  return snor;
 }

 public void setSnor(boolean snor) {
  this.snor = snor;
 }

 public boolean isBaard() {
  return baard;
 }

 public void setBaard(boolean baard) {
  this.baard = baard;
 }

 public Haar getHaarkleur() {
  return haarkleur;
 }

 public void setHaarkleur(Haar haarkleur) {
  this.haarkleur = haarkleur;
 }

 public Ogen getOogkleur() {
  return oogkleur;
 }

 public void setOogkleur(Ogen oogkleur) {
  this.oogkleur = oogkleur;
 }

 public Persoon(String naam, boolean vrouw, boolean bril, boolean kaal, boolean hoofddeksel, boolean snor, boolean baard, Haar haarkleur, Ogen oogkleur ) {
this.naam=naam;
this.vrouw=vrouw;
this.bril=bril;
this.kaal=kaal;
this.hoofddeksel=hoofddeksel;
this.snor=snor;
this.baard=baard;
this.haarkleur=haarkleur;
this.oogkleur=oogkleur;

 }

 public Persoon(){
  this.naam="anoniem";
  vrouw=false;
  this.bril=false;
  this.kaal=false;
  this.hoofddeksel=false;
  this.snor=false;
  this.baard=false;
  this.haarkleur=Haar.BLOND;
  this.oogkleur=Ogen.ZWART;

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

 public String getNaam() {
  return naam;
 }
}