public class Uni5Exe10 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            for (int j = 0; j <= 10000; j++) {
//System.out.println(i + "" + j + "" + (int) Math.pow(soma, 2))
                int soma = i + j;
                String termo1 = i + "" + j;
                String termo2 = "" + (int) Math.pow(soma, 2);
                if (termo1.equals(termo2)) {
                    System.out.println(termo1 + " - " + termo2);
                }

            }

        }
    }

}
