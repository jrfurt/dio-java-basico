public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando volume: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo volume: " + volume);
  }

  public void passarCanal() {
    canal++;
    System.out.println("Canal mudado para: " + canal);
  }

  public void voltarCanal() {
    canal--;
    System.out.println("Canal mudado para: " + canal);
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
    System.out.println("Canal mudado para: " + canal);
  }
}
