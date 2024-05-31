public class Usuario {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();
    statusInicialSmartTv(smartTv);

    smartTv.ligar();
    System.out.println("TV ligada? " + smartTv.ligada);
    smartTv.desligar();
    System.out.println("TV ligada? " + smartTv.ligada);
  }

  public static void statusInicialSmartTv(SmartTv smartTv) {
    System.out.println("|---------------------|");
    System.out.println("  TV ligada? " + smartTv.ligada);
    System.out.println("  Canal: " + smartTv.canal);
    System.out.println("  Volume: " + smartTv.volume);
    System.out.println("|---------------------|");
  }
}
