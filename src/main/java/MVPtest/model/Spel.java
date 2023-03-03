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
this.gekozenPersoon2=new Persoon("anoniem",false,false,false,false,false,false, Persoon.Haar.ZWART, Persoon.Ogen.BRUIN);
System.out.println(spelbord1.getAllePersonen());
}


}