package Unidade03;

public class Operador {

    public static void main(String[] args) {
       int num1 = 0;
       num1++;
       num1++;
       num1++;
       num1--;
       int num2 = 5;

       num1 = num1 + num2;
       num1 += num2;

       num1 = num1 - num2;
       num1 -= num2;

       num1 = num1 * num2;
       num1 *= num2;

       num1 = num1 / num2;
       num1 /= num2;

       num1 = num1 % num2;
       num1 %= num2;

        //texta para maiusculo
       String texto = "Aula de programação";
        texto = texto.toUpperCase();
       System.out.println(texto);

       //texta para minusculo
       String texto2= "Aula de programação";
        texto2= texto2.toLowerCase();
       System.out.println(texto2);


       String texto3 = "BANANA";
       String texto4 = "banana";

       boolean verdade = false;
       verdade = (texto3.toUpperCase().equals(texto4.toUpperCase()));
       System.out.println(verdade);

       boolean verdadeiro = false;
       verdadeiro = (texto3.equalsIgnoreCase(texto4));
       System.out.println(verdade);
}
    }

