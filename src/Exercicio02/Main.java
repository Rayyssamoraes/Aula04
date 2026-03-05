package Exercicio02;

public class Main {
    public static void main(String[] args) {

        SenhaAtendimento s1 = new SenhaAtendimento("Luiza");
        SenhaAtendimento s2 = new SenhaAtendimento("Maria");
        SenhaAtendimento s3 = new SenhaAtendimento("Laura");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Proxima senha disponivel: " + SenhaAtendimento.controle);

    }//main
}//Main
