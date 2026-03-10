package Unidade03;
public class Calculadora { 

        int n1, n2, resultado;

        public Calculadora(){

            n1 = 5;
            n2 = 7;
            resultado = somar();

            System.out.println(resultado);

            //1metodo
            n1 = 4;
            n2 = 6;
            resultado = somar();
            System.out.println(resultado);

            //2metodo
            resultado = somarDoisValores(n2, n1);
            System.out.println(resultado);

            //3metodo
            somaValores();
            System.out.println(resultado);

        }

        public int somar(){
            return n1 + n2;
        }

        public int somarDoisValores(int num1, int num2){
            return num1 + num2;

        }

        public void somaValores(){
            resultado = n1 + n2;

        }


    public static void main(String[] args) {

        new Calculadora();
        
    }
        
    }

    


