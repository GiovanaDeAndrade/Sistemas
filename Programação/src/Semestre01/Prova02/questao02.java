package Semestre01.Prova02;

public class questao02 {

    private void teste (int vetor[], int tamanho, int numero){

        int aux = 0;
        for(int i = 0; i < tamanho; i++){
            for (int j = 0; j < i; j++){
                aux = vetor[i];
                vetor [i] = vetor [j];
                vetor [j] = aux;
        
            }

            numero++;
        }
    }

    

}

