public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "Alex", "Diego", "Francisco", "Edivaldo" };

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno número " + i + " é " + alunos[i]);
    }

    for (String aluno : alunos) {
      System.out.println("Aluno: " + aluno);
    }
  }
}
