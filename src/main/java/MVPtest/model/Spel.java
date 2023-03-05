package MVPtest.model;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

long randomGetal=Math.round(Math.random()*19);

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
//System.out.println(vraag.contains("baard"));

    if (vraag.contains("vrouw")){
        //System.out.println(vraag.contains("vrouw"));
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

public String draaiKaartjeOm(int id){

spelbord1.getMogelijk()[id]=!spelbord1.getMogelijk()[id];
System.out.println(spelbord1.getMogelijk()[id]);

int aantalTrue=0;
for(int i=0;i<spelbord1.getMogelijk().length;i++) {
    if (spelbord1.getMogelijk()[i]) {
        aantalTrue++;
    }
}
    if(aantalTrue==1){
       System.out.println(aantalTrue);

        for(int j=0;j<spelbord1.getMogelijk().length;j++){
            if(spelbord1.getMogelijk()[j]){
                return   spelbord1.getAllePersonen().get(j).getNaam();
            }

            }
    }


     return "meerDanEen";

}


    public String computerSteltVraag() throws IllegalAccessException {
        int aantalTrue=0;
        for(int i=0;i<spelbord1.getMogelijk().length;i++) {
            if (spelbord1.getMogelijk()[i]) {
                aantalTrue++;
            }
        }
        Field[] fields = Persoon.class.getDeclaredFields();

System.out.println(fields.length);
        ArrayList<Double> propertiesTellen=new ArrayList<Double>( Collections.nCopies(fields.length-1, 0.0));
        //Het aantal properties niet dynamisch
        for(int i=0;i<(fields.length-3) ;i++) {
            for (int j = 0; j < spelbord1.getMogelijk().length; j++) {
                fields[i+1].setAccessible(true);
                if(fields[i+1].getName()!=("haarkleur") ||fields[i+1].getName()!=("oogkleur")){

                if(spelbord2.getMogelijk()[j]) {
                    System.out.println(fields[i + 1].get(spelbord2.getAllePersonen().get(j)));
                    System.out.println(fields[i+1].getName());
                    if ((boolean) fields[i + 1].get(spelbord2.getAllePersonen().get(j))) {
                     //   System.out.println("Gedaan");
                        propertiesTellen.set(i, propertiesTellen.get(i)+1);

                    }
                }

                     }


            }
        }
        for (int i = 0; i < propertiesTellen.size(); i++){
            propertiesTellen.set(i, (Double) Math.abs((propertiesTellen.get(i)/aantalTrue)-0.5));


        }
        Double minimum=Collections.min(propertiesTellen);
        int[] matchingIndices = IntStream.range(0, propertiesTellen.size())
                .filter(i -> minimum.equals(propertiesTellen.get(i))) // Only keep those indices
                .toArray();
System.out.println(Arrays.toString(/*propertiesTellen.toArray()*/matchingIndices));


        return "null";
    }
}