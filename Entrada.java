import java.util.Scanner;
public class Entrada{
    public static void main(String[] Dudinha){
        int idade;
        String nome;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        idade = leia.nextInt();
        System.out.println("Sua idade é de: "+idade);
        System.out.println("Digite seu nome:");
        nome = leia.next();
        System.out.println("Seu nome é: "+nome);

        leia.close();

    }
}