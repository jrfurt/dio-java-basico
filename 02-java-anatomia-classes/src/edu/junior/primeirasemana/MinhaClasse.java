package edu.junior.primeirasemana;
public class MinhaClasse {
  public static void main(String[] args) {
    System.out.println("Fala, galerinha do meu canal!");

    String primeiroNome = "Clodomir";
    String sobrenome = "Junior";

    String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String sobrenome) {
    return primeiroNome.concat(" ").concat(sobrenome);
  }
}
