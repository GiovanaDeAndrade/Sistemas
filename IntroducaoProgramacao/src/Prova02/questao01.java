package Prova02;

public class questao01 {

    private boolean vetorPesquisa(int vetor[],int valor, int vetorPos){

        vetorPos = 5;

        for (int i = 0; i < vetorPos; i++){
            if (valor == vetor[i]){
                return true;
            }
        }
        System.out.println("fim do método");
        return false;


    }

    public static void main(String[] args) {
        new questao01();
    }







































}
