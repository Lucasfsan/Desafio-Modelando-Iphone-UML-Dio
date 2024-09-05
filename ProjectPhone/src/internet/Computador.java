package internet;

public class Computador implements NavegadorInternet{
    @Override
    public void conectarRede(){
      checarConexao();
      System.out.println("Rede de internet conectada");
    };
    @Override
    public void acessarInternet(){
      System.out.println("Navegando na internet");
    };
  
    private void checarConexao(){
     boolean internet = true;
      if (internet) {
        System.out.println("rede wi-fi conectada");
    }
  }
  }
