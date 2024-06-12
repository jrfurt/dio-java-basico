import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o seu nome:");
      String nome = scanner.next();

      System.out.println("Digite o seu sobrenome:");
      String sobrenome = scanner.next();

      System.out.println("Digite sua idade:");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura:");
      double altura = scanner.nextDouble();

      System.out.println("Olá, meu nome é " + nome + ' ' + sobrenome);
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha altura é " + altura);
      scanner.close();
    } catch (Exception e) {
      System.err.println("Os campos de idade e altura devem ser numéricos.");
    }

  }
}
