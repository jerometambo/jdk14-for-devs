package org.jerometambo.jdk14;

public class LigneFacture {
    
    private TypeLigneFacture typeLigneFacture;
    
    public TypeLigneFacture getTypeLigneFacture() {
        return typeLigneFacture;
    }
    
    public void setTypeLigneFacture(final TypeLigneFacture typeLigneFacture) {
        this.typeLigneFacture = typeLigneFacture;
    }
    
    public enum TypeLigneFacture {
        ACHAT,
        VENTE;
    }
    
}
