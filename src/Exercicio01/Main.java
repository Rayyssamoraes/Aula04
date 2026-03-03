package Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;
        double porcentagem;

        System.out.print("Nome do Produto: ");
        nome = sc.next();

        System.out.print("Valor do produto: ");
        valor = sc.nextDouble();

        System.out.print("Quantidade do Produto: ");
        quantidade = sc.nextInt();

        Produto p = new Produto(nome, valor, quantidade);

        //prcentagem para aumentar o valor do produto
        System.out.print("Qual a porcetagem de aumento? ");
        porcentagem = sc.nextDouble();

        System.out.println(p.valor);

    }//main
}//Main
