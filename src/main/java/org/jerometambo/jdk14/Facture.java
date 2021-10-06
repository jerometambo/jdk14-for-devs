package org.jerometambo.jdk14;

import java.util.HashSet;
import java.util.Set;

public class Facture {
    
    private Set<LigneFacture> lignesFacture = new HashSet<>();
    
    public Set<LigneFacture> getLignesFacture() {
        return lignesFacture;
    }
    
    public void setLignesFacture(final Set<LigneFacture> lignesFacture) {
        this.lignesFacture = lignesFacture;
    }
}
