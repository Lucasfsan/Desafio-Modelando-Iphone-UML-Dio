package multifuncional;
import musicais.ReprodutorMusical;
import telefonicos.AparelhoTelefonico;
import Internet.NavegadorInternet;


public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar() {
      System.out.println("Ligando para um número telefônico");
    }
    @Override
    public void enviarSMS(){
      System.out.println("Enviando mensagem SMS");
    }
    @Override
    public void tocarMusica(){
      System.out.println("Tocando música");
    }
    @Override
    public void conectarRede(){
      System.out.println("Conectando a rede de internet");
    }
    @Override
    public void acessarInternet(){
      System.out.println("Navegando na internet");
    }
  }
