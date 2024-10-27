import java.util.InputMismatchException; // Foi necessário importar pois não falava no vídeo a necessidade
import java.util.Locale;
import java.util.Scanner;

public class AboutMeExcecoes {
    
    public static void main(String[] args) {
        try{
        //criando o objeto scanner
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        //Imprimindo as informações
        System.out.println("OLá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + "cm.");
        scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura devem ser numéricos");
        }
    }
}
