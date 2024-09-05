package loja;

import internet.Computador;
import multifuncional.Iphone;
import musicais.Ipod;
import telefonicos.Telefone;

public class Eletronicos {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
    iphone.ligar();
    iphone.enviarSMS();
    iphone.tocarMusica();
    iphone.conectarRede();
    iphone.acessarInternet();

    
    Ipod Ipod = new Ipod();
    Ipod.tocarMusica();

    Computador computador = new Computador();
    computador.conectarRede();
    computador.acessarInternet();

    Telefone telefone = new Telefone();
    telefone.ligar();
    telefone.enviarSMS();
  }
    }

