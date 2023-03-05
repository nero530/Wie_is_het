package MVPtest.model;

public class Spel {


    //spelbord + een kaartje (van het type persoon)
private Persoon gekozenPersoon1;
private Persoon gekozenPersoon2;

private Spelbord spelbord1;
private Spelbord spelbord2;








    public Persoon getGekozenPersoon1() {
        System.out.println("ok");
        return gekozenPersoon1;
    }


    public void setGekozenPersoon1(Persoon gekozenPersoon1) {
        this.gekozenPersoon1 = gekozenPersoon1;
    }

    public Persoon getGekozenPersoon2() {
        return gekozenPersoon2;
    }

    public void setGekozenPersoon2(Persoon gekozenPersoon2) {
        this.gekozenPersoon2 = gekozenPersoon2;
    }

    public Spelbord getSpelbord1() {
        return spelbord1;
    }

    public void setSpelbord1(Spelbord spelbord1) {
        this.spelbord1 = spelbord1;
    }

    public Spelbord getSpelbord2() {
        return spelbord2;
    }

    public void setSpelbord2(Spelbord spelbord2) {
        this.spelbord2 = spelbord2;
    }

    public Spel(){
     this.spelbord2=new Spelbord() ;
 this.spelbord1=new Spelbord() ;
this.gekozenPersoon1=new Persoon("anoniem",false,false,false,false,false,false, Persoon.Haar.ZWART, Persoon.Ogen.BRUIN);

long randomGetal=Math.round(Math.random()*20);

        this.gekozenPersoon2=spelbord1.getAllePersonen().get((int) randomGetal);
System.out.println(gekozenPersoon2.getNaam());
}

//Dit is eigenlijk een spelbord method
public boolean vraagBeantwoorden(String vraag){
//Het alternatief is met class werken

    //?
    /* switch(vraag){
        case vraag.contains("vrouw"):

    }*/
System.out.println(vraag.contains("baard"));

    if (vraag.contains("vrouw")){
        return gekozenPersoon2.isVrouw();
    }
    else if(vraag.contains("baard")){
        return gekozenPersoon2.isBaard();
    }
    else if(vraag.contains("snor")){
        return gekozenPersoon2.isSnor();
    }
    else if(vraag.contains("hoofddeksel")){
        return gekozenPersoon2.isHoofddeksel();
    }
    else if(vraag.contains("kaal")){
        return gekozenPersoon2.isKaal();
    }
    else if(vraag.contains("bril")){
        return gekozenPersoon2.isBril();
    }

    else if(vraag.equals("blond")||vraag.equals("bruin")||vraag.equals("zwart")){
        return gekozenPersoon2.getHaarkleur().toString().toLowerCase().equals(vraag);
    }
    else {

        return gekozenPersoon2.getOogkleur().toString().toLowerCase().equals(vraag);

    }


}


}