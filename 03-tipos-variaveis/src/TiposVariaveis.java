public class TiposVariaveis {
  public static void main(String[] args) throws Exception {
    byte idade = 26; // -128 / 127
    short ano = 2024; // -32.768 / 32.767
    int cep = 65570000; // -2.147.483.648 / 2.147.483.647
    long cpf = 12345678910L; // -9.223.372.036.854.775.808 / 9.223.372.036.854.775.807
    float pi = 3.14F; // -3,4028E + 38 / 3,4028E + 38
    double salario = 1412; // -1,7976E + 308 / 1,7976E + 308
    char verdadeiro = 'V'; // 1 byte
    boolean falso = false; // 1 bit
  }
}
