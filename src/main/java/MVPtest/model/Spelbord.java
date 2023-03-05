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
        this.mogelijk = mogelijk2;
    }


    public Spelbord(){
    Arrays.fill(mogelijk, true);
allePersonen.add(new Persoon("Piet",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Jan",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Isabel",true,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Julie",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Bert",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Tom",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Erik",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Jana",true,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Eliah",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Karel",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Pauline",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Alissa",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Anton",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Jolien",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Brecht",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Seppe",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Sofie ",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Kaily",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Evert",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Filip",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));


}




}