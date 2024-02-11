import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, insira o nome do aluno: ");

        String nomeAluno = scanner.next();

        System.out.println("Insira as quatro notas do " + nomeAluno);

        Integer nota1 = scanner.nextInt();
        Integer nota2 = scanner.nextInt();
        Integer nota3 = scanner.nextInt();
        Integer nota4 = scanner.nextInt();

        Integer soma = nota1 + nota2 + nota3 + nota4;

        Integer media = soma/4;

        System.out.println("A média do Aluno " + nomeAluno + " é de " + media + " pontos");

        scanner.close();
    }
}