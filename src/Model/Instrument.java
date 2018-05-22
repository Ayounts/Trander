
package Model;

import java.util.ArrayList;


public class Instrument {
    
    
    private ArrayList<Fonds> listFonds = new ArrayList<>();
    
    
    /**
     * 
     */
    public Instrument() {
        //
    }
    
    
    /**
     * 
     * @param listFonds 
     */
    public Instrument(ArrayList<Fonds> listFonds) {
        //
    }

    public ArrayList<Fonds> getListFonds() {
        return listFonds;
    }

    public void setListFonds(ArrayList<Fonds> listFonds) {
        this.listFonds = listFonds;
    }
    
    
}
