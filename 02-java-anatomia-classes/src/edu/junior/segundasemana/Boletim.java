package edu.junior.segundasemana;
public class Boletim {
  public static void main(String[] args) {
    int mediaFinal = 8;

    if (mediaFinal < 6)
      System.out.println("Reprovado");
    else if (mediaFinal > 6)
      System.out.println("Aprovado!");
    else
      System.out.println("Prova Final");
  }
}
