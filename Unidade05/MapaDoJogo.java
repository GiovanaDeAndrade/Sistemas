

public class MapaDoJogo {

    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            if (i == 0) {
                System.out.println(" _ _ _");
            }

            for (int j = 0; j <= 2; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.print("_|");
            }
                System.out.println("");

            
        }
    }
}
