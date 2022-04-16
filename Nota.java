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
        String nome;
        double prova1, prova2;

        System.out.println("Seu primeiro NOME: ");
        nome = a.next();

        System.out.println("Sua primeira Nota: ");
        n1 = a.nextDouble();
        System.out.println("Sua segunda Nota: ");
        n2 = a.nextDouble();

        soma = n1 + n2;
        media = soma / 2;
        System.out.println("Sua média: " + media);

        recuperacao = (10 - media) + 2;
        prova_final = 10 - media;
        prova1 = soma - n2;
        prova2 = soma - n1;

        if( (media >= 0) && (media <= 4.9) ){
            System.out.println(""+nome+" está na recuperação precisando de " + recuperacao + " para ser Aprovado!");
            System.out.println("Nota 1:  -> "+ prova1);
            System.out.println("Nota 2:  -> "+ prova2);

        } else if( (media >= 5 ) && (media <= 6.9) ) {
            System.out.println("Nota para "+ nome+" ser aprovado na final: "+ prova_final +"");
            System.out.println("Nota 1:  -> "+ prova1);
            System.out.println("Nota 2:  -> "+ prova2);
            System.out.println("Cálculo: 10 + media ->");

        } else {
            System.out.println("Aprovado por média, Parabéns "+ nome+"!!");

        }



    }

}
