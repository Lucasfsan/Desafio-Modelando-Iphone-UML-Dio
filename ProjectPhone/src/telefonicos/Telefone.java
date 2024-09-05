package telefonicos;

public class Telefone implements AparelhoTelefonico{
    @Override
    public void ligar(){
      System.out.println("Ligando para um usuário de telefone");
    }
    @Override
    public void enviarSMS(){
      System.out.println("Enviando mensagem SMS para colega");
    }
  }
