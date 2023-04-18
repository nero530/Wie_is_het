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
allePersonen.add(new Persoon("Alex",false,false,false,false, true,false, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Joe",false,false,true,true, true,true, Persoon.Haar.BLOND, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Susan2",true,true,false,false, false,false, Persoon.Haar.BLOND, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Richard",false,true,false,false, false,false, Persoon.Haar.BRUIN, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Joe",false,false,false,false, true,true, Persoon.Haar.BRUIN, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Tom",false,true,false,false, false,false, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Frans",false,false,false,false, true,false, Persoon.Haar.BLOND, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Anita",true,false,false,true, false,false, Persoon.Haar.ZWART, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Alfred",false,false,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Bill",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.GRIJS));
allePersonen.add(new Persoon("Anne2",false,true,false,false, false,false, Persoon.Haar.BRUIN, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Anne",true,false,false,true, false,true, Persoon.Haar.BRUIN, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("David",false,true,true,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.GRIJS));
allePersonen.add(new Persoon("Claire",true,false,false,false, false,true, Persoon.Haar.BLOND, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Herman",false,true,false,true, false,true, Persoon.Haar.BLOND, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("George",false,false,false,true, false,false, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
allePersonen.add(new Persoon("Maria",true,true,false,false, false,false, Persoon.Haar.ZWART, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Susan",true,true,false,false, false,false, Persoon.Haar.BRUIN, Persoon.Ogen.BRUIN));
allePersonen.add(new Persoon("Peter",false,false,true,true, false,true, Persoon.Haar.BRUIN, Persoon.Ogen.GRIJS));
allePersonen.add(new Persoon("Max",false,true,false,true, false,true, Persoon.Haar.BLOND, Persoon.Ogen.GRIJS));


}




}