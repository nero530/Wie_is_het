package MVPtest.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Spelbord{

    //ArrayList en random volgorde
    public ArrayList<Persoon> allePersonen;
public boolean[] mogelijk= new boolean[20];



public void Spelbord(){
    Arrays.fill(mogelijk, true);
allePersonen.add(new Persoon("Piet",false,true,false,false, false,true, Persoon.Haar.ZWART, Persoon.Ogen.ZWART));







}



}