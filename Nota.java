//Média | Situação do Aluno
//0 - 4.9 |Aluno em recuperação
//5 - 6.9 |Aluno em prova final
//7 - 10 |Aluno aprovado por média
import java.util.Scanner;

public class Nota {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double n1, n2;
        double soma = 0;
        double media;
        double recuperacao;
        double prova_final;


        System.out.println("Sua primeira Nota (apenas numeros): ");
        n1 = a.nextDouble();
        System.out.println("Sua segunda Nota (apenas numeros): ");
        n2 = a.nextDouble();

        soma = n1 + n2;
        media = soma / 2;
        System.out.println("Sua média e: " + media);

        recuperacao = 10 - media + 2;
        prova_final = 10 - media;

        if( (media >= 0) && (media <= 4.9) ){
            System.out.println("Aluno está na recuperação");
            System.out.println("Voce precisa de " + recuperacao + " para ser Aprovado!");
        } else if( (media >= 5 ) && (media <= 6.9) ) {
            System.out.println("Aluno vai para a final");
            System.out.println("Voce precisa de " + prova_final + " para ser Aprovado!");
        } else {
            System.out.println("Aluno aprovado por média!");
        }



    }

}
