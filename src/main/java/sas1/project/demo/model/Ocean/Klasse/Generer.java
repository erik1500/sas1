package sas1.project.demo.model.Ocean.Klasse;

// skal importere klasserne hex og koordinat til oprettelse af liste som indeholder en masse
// delobjekter af ocean til samlet.

import java.util.ArrayList;

public class Generer
{
    // opretter tom ArrayListe til oprettelse af tomme objekter
    ArrayList<Hex> samletOcean = new ArrayList<>();
        int f=0;


    public void samletOprettelse(){





    }

    // en metode der opretter de tomme hex objekter til af fylde med information
    // input x og y giver størrelsen af listen med objekter
    public void OpretHelOcean(int x, int y){

        // et forloop der iterere gennem og opretter hex objekter indtil y længde er fuldført
        for(int i =0;i>y;i++){
            //nested forloop med x coordinat længde verticale værdier
            for(int j=0;j>x;j++){
                samletOcean.add(/*Hex object */ );

            }
        }

        // metode der iterere igennem alle de tomme objekter og giver dem en coordinat værdi
        public void opretCoordinat(){

            for(int i=0;i<y;i++){

            }
        }

    }





}