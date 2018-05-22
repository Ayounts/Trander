
package Model;

import java.util.HashMap;


public class Portefeuille {

    private  HashMap<String, Fonds> mapFonds = new HashMap<>();
    
    private  HashMap<String, Fonds> mapInstrument = new HashMap<>();
    
    
    public Portefeuille(HashMap<String, Fonds> mapFonds, HashMap<String, Instrument>mapInstrument) {
        //
    }

    public HashMap<String, Fonds> getMapFonds() {
        return mapFonds;
    }

    public void setMapFonds(HashMap<String, Fonds> mapFonds) {
        this.mapFonds = mapFonds;
    }

    public HashMap<String, Fonds> getMapInstrument() {
        return mapInstrument;
    }

    public void setMapInstrument(HashMap<String, Fonds> mapInstrument) {
        this.mapInstrument = mapInstrument;
    }
 
    
}
