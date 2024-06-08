public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "Alex", "Diego", "Francisco", "Edivaldo" };
    System.out.println(alunos.length);

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno número " + i + " é " + alunos[i]);
    }

    // Usando o for each
    for (String aluno : alunos) {
      System.out.println("Aluno: " + aluno);
    }
  }
}
