// Algoritmo Fundamental N� 1
// Descri��o : Troca dos valores de duas vari�veis.
// Problema  : Dadas duas vari�veis, trocar os valores atribu�dos a elas.
// Aplica��es: Algoritmos de ordena��o.

import java.util.Scanner;

public class TrocaVariaveis {

    public static void main(String[] args) {
        Scanner dado;
        dado = new Scanner(System.in);

        System.out.println("Informe valor para a vari�vel A: ");
        int a =  dado.nextInt();

        System.out.println("Informe valor para a vari�vel B: ");
        int b = dado.nextInt();

        int aux;

        aux = a; // Guarda em AUX o valor original de A
        a = b;   // Atribui a A o valor original de B
        b = aux; // Atribui a B o valor original de A, que est� armazenado em AUX

        System.out.println("Novo valor da vari�vel A: " + a);
        System.out.println("Novo valor da vari�vel B: " + b);
    }

}