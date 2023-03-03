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

    public Spelbord(){
    Arrays.fill(mogelijk, true);
allePersonen.add(new Persoon("Piet",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));
//En nog 19 meer
System.out.println(mogelijk);






}



}