package MVPtest.model;

import MVPtest.view.Vragen;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.lang.Math.random;

public class Spel {


    //spelbord + een kaartje (van het type persoon)
private Persoon gekozenPersoon1;
private Persoon gekozenPersoon2;

private Spelbord spelbord1;
private Spelbord spelbord2;








    public Persoon getGekozenPersoon1() {
        //System.out.println("ok");
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

long randomGetal=Math.round(random()*19);

        this.gekozenPersoon2=spelbord1.getAllePersonen().get((int) randomGetal);
//tem.out.println(gekozenPersoon2.getNaam());
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
//System.out.println(spelbord1.getMogelijk()[id]);

int aantalTrue=0;
for(int i=0;i<spelbord1.getMogelijk().length;i++) {
    if (spelbord1.getMogelijk()[i]) {
        aantalTrue++;
    }

}System.out.println(aantalTrue);
    if(aantalTrue==1){


        for(int j=0;j<spelbord1.getMogelijk().length;j++){
            if(spelbord1.getMogelijk()[j]){
                return   spelbord1.getAllePersonen().get(j).getNaam();
            }

            }
    }


     return "meerDanEen";

}


    public String[] computerSteltVraag() throws IllegalAccessException {
        int aantalTrue = 0;
        for (int i = 0; i < spelbord1.getMogelijk().length; i++) {
            if (spelbord1.getMogelijk()[i]) {
                aantalTrue++;
            }
        }
        Field[] fields = Persoon.class.getDeclaredFields();

//tem.out.println(fields.length);
        ArrayList<Double> propertiesTellen = new ArrayList<Double>(Collections.nCopies(fields.length - 3, 0.0));
        ArrayList<Double> haren = new ArrayList<Double>(Collections.nCopies(3, 0.0));
        ArrayList<Double> ogen = new ArrayList<Double>(Collections.nCopies(3, 0.0));

        //Het aantal properties
        for (int i = 0; i < (fields.length - 2); i++) {
            for (int j = 0; j < spelbord1.getMogelijk().length; j++) {
                fields[i + 1].setAccessible(true);
                if (spelbord2.getMogelijk()[j]) {
                    if (!fields[i + 1].getName().equals("haarkleur") && !fields[i + 1].getName().equals("oogkleur")) {


                        // System.out.println(fields[i + 1].get(spelbord2.getAllePersonen().get(j)));
                        // System.out.println(fields[i+1].getName());
                        if ((boolean) fields[i + 1].get(spelbord2.getAllePersonen().get(j))) {
                            propertiesTellen.set(i, propertiesTellen.get(i) + 1);

                        }
                    }
                    if (fields[i + 1].getName().equals("haarkleur")) {

                        String haarkleur = fields[i + 1].get(spelbord2.getAllePersonen().get(j)).toString();
                        switch (haarkleur) {
                            case "ZWART":
                                haren.set(0, haren.get(0) + 1);
                            case "BRUIN":
                                haren.set(1, haren.get(1) + 1);
                            case "BLOND":
                                haren.set(2, haren.get(2) + 1);

                        }
                    }
                    if (fields[i + 1].getName().equals("oogkleur")) {
                        System.out.println("check");
                        String oogkleur = (String) fields[i + 1].get(spelbord2.getAllePersonen().get(j));

                        switch (oogkleur) {
                            case "GRIJS":
                                ogen.set(0, ogen.get(0) + 1);
                            case "BRUIN":
                                ogen.set(1, ogen.get(1) + 1);
                            case "ZWART":
                                ogen.set(2, ogen.get(2) + 1);


                        }
                    }


                }
            }
        }
        for (int i = 0; i < haren.size(); i++) {
            haren.set(i, (Double) Math.abs((haren.get(i) / aantalTrue)*3/2 - 0.5));
        }
        for (int i = 0; i < ogen.size(); i++) {
            ogen.set(i, (Double) Math.abs((ogen.get(i) / aantalTrue)*3/2 - 0.5));
        }
        for (int i = 0; i < propertiesTellen.size(); i++) {
            propertiesTellen.set(i, (Double) Math.abs((propertiesTellen.get(i) / aantalTrue) - 0.5));

        }

        propertiesTellen.add(Collections.min(haren));
        int indexHaren = haren.indexOf(Collections.min(haren));
        String uiteindelijkeHaarkleur;
        switch (indexHaren) {
            case 0:
                uiteindelijkeHaarkleur = "grijze";
                break;
            case 1:
                uiteindelijkeHaarkleur = "bruine";
                break;
            case 2:
                uiteindelijkeHaarkleur = "zwarte";
                break;
            default:
                uiteindelijkeHaarkleur = "zwarte";

        }

        propertiesTellen.add(Collections.min(ogen));
        int indexOgen = ogen.indexOf(Collections.min(ogen));
        String uiteindelijkeOogkleur;
        switch (indexOgen) {
            case 0:
                uiteindelijkeOogkleur = "zwarte";
                break;
            case 1:
                uiteindelijkeOogkleur = "bruine";
                break;
            case 2:
                uiteindelijkeOogkleur = "blonde";
                break;
            default:
                uiteindelijkeOogkleur = "zwarte";

        }





System.out.println(propertiesTellen);

        Double minimum=Collections.min(propertiesTellen);
        System.out.println(minimum);
       int[] matchingIndices = IntStream.range(0, propertiesTellen.size())
                .filter(i -> minimum.equals(propertiesTellen.get(i)))
                .toArray();
        System.out.println(matchingIndices);
        int willekeur= (int) Math.round(Math.random()*(matchingIndices.length-1));
        System.out.println(Arrays.toString(matchingIndices));
       String[]vraag=new String[2];
        switch (matchingIndices[willekeur]) {
            case 0 -> {
                vraag[0] = "Is het een vrouw?";
                vraag[1] = String.valueOf(getGekozenPersoon1().isVrouw());
                //return vraag;
            }
            case 1 -> {
                vraag[0] = "Draagt de persoon een bril?";
                vraag[1] = String.valueOf(getGekozenPersoon1().isBril());
              //  return vraag;
            }
            case 2 -> {
                vraag[0] = "Is de persoon kaal?";
                vraag[1] = String.valueOf(getGekozenPersoon1().isKaal());
               // return vraag;
            }
            case 3 -> {
                vraag[0] = "Heeft de persoon een hoofddeksel?";
                vraag[1] = String.valueOf(getGekozenPersoon1().isHoofddeksel());
              //  return vraag;
            }
            case 4 -> {
                vraag[0] = "Heeft de persoon een snor?";
                vraag[1] = String.valueOf(getGekozenPersoon1().isSnor());
              //  return vraag;
            }
            case 5 -> {
                vraag[0] = "Heeft de persoon een baard?";
                vraag[1] = String.valueOf("");
             //   return vraag;
            }
            case 6-> {
                vraag[0] = "Heeft de persoon " +uiteindelijkeHaarkleur+ "haren?";
               //te doen
                vraag[1] = String.valueOf("");
              //  return vraag;
            }
            case 7-> {
                vraag[0] = "Heeft de persoon "+uiteindelijkeOogkleur+ "ogen?";
                vraag[1] = String.valueOf(getGekozenPersoon1().isBaard());
              //  return vraag;
            }
        }
//@Testen
      //  System.out.println(Arrays.toString(/*propertiesTellen.toArray()*/matchingIndices));
        //System.out.println(fields[matchingIndices[willekeur]+1]);
        System.out.println("11111");
       // System.out.println(fields[matchingIndices[willekeur]].get(gekozenPersoon1));

for(int i=0;i<getSpelbord2().getAllePersonen().size();i++) {

    fields[matchingIndices[willekeur]+1].setAccessible(true);
   //System.out.println(fields[matchingIndices[willekeur]].get(spelbord2.getAllePersonen().get(i)));
   System.out.println(matchingIndices[willekeur]);
   System.out.println(willekeur);
    if(fields[matchingIndices[willekeur]+1].get(spelbord2.getAllePersonen().get(i))!=fields[matchingIndices[willekeur]+1].get(gekozenPersoon1)){
        //dit is geen setter
        getSpelbord2().setMogelijkComputer(i);
        System.out.println(Arrays.toString(spelbord2.getMogelijk()));
       //System.out.println(i);

    };


}
//Hier klop iets niet
        int aantalComputerTrue=0;
    for(int i=0;i<spelbord2.getMogelijk().length;i++) {
  if(spelbord2.getMogelijk()[i]){
      aantalComputerTrue++;

  }


    }
        if (aantalComputerTrue == 1) {
            vraag[0] = "Jij hebt " + gekozenPersoon1.getNaam() + ". De computer wint";
        }
        //  System.out.println(vraag.toString());

return vraag;
    }
}