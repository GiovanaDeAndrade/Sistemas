package Unidade03;

import java.util.Scanner;

public class Uni3Exe04 {
    private float nota1, nota2, nota3;
    private float peso1, peso2, peso3;

    public Uni3Exe04(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3){

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;

    }

    public float notaTotal(){
        return ((this.nota1 * this.peso1) + (this.nota2 * this.peso2) + (this.nota3* this.peso3)) / 10;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float nota1 = sc.nextFloat();
        float peso1 = 5;

        System.out.println("Informe a segunda nota: ");
        float nota2 = sc.nextFloat();
        float peso2 = 3;

        System.out.println("Informe a terceira nota: ");
        float nota3 = sc.nextFloat();
        float peso3 = 2;

        Uni3Exe04 conta = new Uni3Exe04(nota1, nota2, nota3, peso1, peso2, peso3);

        System.out.println("A média final é: " + conta.notaTotal());

        sc.close();



    }
    





}
