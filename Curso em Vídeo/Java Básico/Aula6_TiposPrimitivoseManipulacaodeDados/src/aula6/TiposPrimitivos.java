package aula6;

import java.util.Scanner;

/*public class TiposPrimitivos {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        float nota = 8.5f;
        String nome = "Natasha";
        System.out.println("A nota é: " + nota);
        System.out.printf("A nota de %s é %.2f \n ", nome, nota);
        System.out.format("A nota de %s é %.2f", nome, nota);


    }
}
*/
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        //System.out.println("A nota é: " + nota);
        System.out.printf("A nota de %s é %.1f \n ", nome, nota);
        //System.out.format("A nota de %s é %.2f", nome, nota);

    }
}



