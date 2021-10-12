package org.jerometambo.jdk14;

public class SwitchExpression {
    public static void main(String... args)
            throws Exception {
        final String in = args[0];
        vieuxSwitchCommeStructureControle(in);
        
        vieuxSwitchCommeExpression(in);
        
        nouveauSwitchCommeStructureDeControle(in);
        
        nouveauSwitchCommeExpressionAvecBlocDeCode(in);
    }
    
    private static void vieuxSwitchCommeStructureControle(final String in) {
        System.out.println("Résultat vieux switch:");
        switch (in) {
            case "1", "2", "3": {
                System.out.println("<10");
                break;
            }
            case "11", "12", "13": {
                System.out.println(">10");
            }
        }
    }
    
    private static void vieuxSwitchCommeExpression(final String in)
            throws Exception {
        String result = switch (in) {
            case "1", "2", "3":
                yield "<10";
            case "11", "12", "13":
                yield ">10";
            default:
                throw new Exception("Donne moi un autre chiffre !");
        };
        System.out.println(result);
    }
    
    private static void nouveauSwitchCommeStructureDeControle(final String in) {
        switch (in) {
            case "1", "2", "3" -> System.out.println("<10");
            case "11", "12", "13" -> System.out.println(">10");
        }
    }
    
    private static void nouveauSwitchCommeExpressionAvecBlocDeCode(final String in)
            throws Exception {
        String result = switch (in) {
            case "1", "2", "3" -> {
                if ("3".equals(in))
                    yield "le 3 c'est mon chiffre préféré";
                else
                    yield "<10";
            }
            case "11", "12", "13" -> ">10";
            default -> throw new Exception("Donne moi un autre chiffre !");
        };
        System.out.println(result);
    }
}