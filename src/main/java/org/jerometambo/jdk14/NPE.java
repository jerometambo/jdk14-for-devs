package org.jerometambo.jdk14;

import java.util.Set;

public class NPE {
    
    public static void main(String... args) {
        var facture = new Facture();
        facture.setLignesFacture(Set.of(new LigneFacture()));
        LigneFacture ligneFacture = facture.getLignesFacture().iterator().next();
        logFacture(facture, ligneFacture);
    }
    
    private static void logFacture(final Facture facture, final LigneFacture ligneFacture) {
        if (facture.getLignesFacture().size() == 1 && ligneFacture.getTypeLigneFacture().equals(LigneFacture.TypeLigneFacture.ACHAT))
            System.out.println("ACHATTTTT");
        else
            System.out.println("PAS ACHATTT");
    }
    
}

