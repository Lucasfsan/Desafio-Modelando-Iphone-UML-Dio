package musicais;

public class Ipod implements ReprodutorMusical{
  @Override  
  public void tocarMusica(){
      acessarBiblioteca();
      System.out.println("Tocando Billie Eilish");
    }
    private void acessarBiblioteca(){
      System.out.println("Acessando a biblioteca de músicas");
    }
  }
