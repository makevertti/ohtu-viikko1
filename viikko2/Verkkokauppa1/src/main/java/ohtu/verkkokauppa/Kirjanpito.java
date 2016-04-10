
package ohtu.verkkokauppa;

import ohtu.rajapinnat.IKirjanpito;

import java.util.ArrayList;

public class Kirjanpito implements IKirjanpito {
    
    private ArrayList<String> tapahtumat;

    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }
    
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
