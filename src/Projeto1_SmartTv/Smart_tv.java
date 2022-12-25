package Projeto1_SmartTv;

public class Smart_tv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void aumentar_volume(){
        volume ++;
    }

    public void baixar_volume(){
        volume --;
    }
    public void canal_acima(){
        canal ++;
    }

    public void canal_abaixo() {
        canal --;
    }

    public void mudar_canal(int novoCanal) {
        canal = novoCanal;
    }
}
