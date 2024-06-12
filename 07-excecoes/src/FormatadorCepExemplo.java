public class FormatadorCepExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("6557000");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      e.printStackTrace();
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    return "23.765-064";
  }
}
