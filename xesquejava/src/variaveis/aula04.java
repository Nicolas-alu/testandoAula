package variaveis;

import java.util.Scanner;

public class aula04 {

    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);

        String nome = leitor.nextLine();
        int idade = leitor.nextInt();
        float altura = leitor.nextFloat();
        double peso = leitor.nextDouble();
        String tiposang = leitor.next();
        char fatorRh = leitor.next().charAt(0);
    
        System.out.print(nome+"\n");
        System.out.print("idade: "+idade+"\n");
        System.out.print("altura: "+altura+"\n");
        System.out.print("peso: "+peso+"\n");
        System.out.print("tiposang: "+tiposang+"\n");
        System.out.print("fatorRh: "+fatorRh+"\n");

        leitor.close();
    }
}