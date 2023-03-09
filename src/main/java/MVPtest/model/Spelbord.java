package MVPtest.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Spelbord{

    //ArrayList en random volgorde
    private ArrayList<Persoon> allePersonen=new ArrayList<>();
public boolean[] mogelijk= new boolean[20];


    public ArrayList<Persoon> getAllePersonen() {
        return allePersonen;
    }

    public void setAllePersonen(ArrayList<Persoon> allePersonen) {
        this.allePersonen = allePersonen;
    }

    public boolean[] getMogelijk() {
        return mogelijk;
    }

    public void setMogelijk(boolean[] mogelijk) {
        this.mogelijk = mogelijk;
    }

    public void setMogelijkComputer(int index) {
     boolean[] mogelijk2=this.mogelijk;
     mogelijk2[index]=false;
     System.out.println(mogelijk2);
        this.mogelijk = mogelijk2;
    }


    public Spelbord(){
    Arrays.fill(mogelijk, true);
allePersonen.add(new Persoon("Piet",false,false,false,false, true,false, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Jan",false,false,true,true, true,true, Persoon.Haar.BLOND, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Isabel",true,true,false,false, false,false, Persoon.Haar.BLOND, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Julie",true,true,false,false, false,false, Persoon.Haar.BRUIN, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Bert",false,false,false,false, true,true, Persoon.Haar.BRUIN, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Tom",false,true,false,false, false,false, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Erik",false,false,false,false, true,false, Persoon.Haar.BLOND, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Jana",true,false,false,true, false,false, Persoon.Haar.ZWART, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Eliah",false,false,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Karel",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.GRIJS));
allePersonen.add(new Persoon("Pauline",false,true,false,false, false,false, Persoon.Haar.BRUIN, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Alissa",true,false,false,true, false,true, Persoon.Haar.BRUIN, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Anton",false,true,true,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.GRIJS));
allePersonen.add(new Persoon("Jolien",true,false,false,false, false,true, Persoon.Haar.BLOND, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Brecht",false,true,false,true, false,true, Persoon.Haar.BLOND, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Seppe",false,false,false,true, false,false, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Sofie ",true,true,false,false, false,false, Persoon.Haar.ZWART, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Kaily",true,true,false,false, false,false, Persoon.Haar.BRUIN, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Evert",false,false,true,true, false,true, Persoon.Haar.BRUIN, Persoon.Ogen.GRIJS));
allePersonen.add(new Persoon("Filip",false,true,false,true, false,true, Persoon.Haar.BLOND, Persoon.Ogen.GRIJS));


}




}