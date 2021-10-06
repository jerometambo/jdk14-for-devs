package org.jerometambo.jdk14;

public class SwitchExpression {
    public static void main(String... args)
            throws Exception {
        final String in = args[0];
        vieuxSwitch(in);
        
        nouveauSwitch(in);
        
        multipleCasesVieuxSwitch(in);
        
        nouveauSwitchAvecBlocDeCode(in);
    }
    
    private static void nouveauSwitch(final String in)
            throws Exception {
        String result = switch (in) {
            case "1", "2", "3" -> "<10";
            case "11", "12", "13" -> ">10";
            default -> throw new Exception("Donne moi un autre chiffre !");
        };
        System.out.println(result);
    }
    
    private static void vieuxSwitch(final String in) {
        String result = "";
        switch (in) {
            case "1":
            case "2":
            case "3": {
                result = "<10";
                break;
            }
            case "11":
            case "12":
            case "13": {
                result = ">10";
                break;
            }
        }
        ;
        
        System.out.println("Résultat vieux switch:");
        System.out.println(result);
    }
    
    private static void multipleCasesVieuxSwitch(final String in)
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
    
    private static void nouveauSwitchAvecBlocDeCode(final String in)
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