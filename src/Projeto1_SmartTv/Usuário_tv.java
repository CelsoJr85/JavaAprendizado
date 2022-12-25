package Projeto1_SmartTv;

public class Usuário_tv {
    public static void main(String[] args) throws Exception {
        Smart_tv smart_tv = new Smart_tv();

        System.out.println("A tv está ligada? " + smart_tv.ligado);
        System.out.println("Canal Atual: " + smart_tv.canal);
        System.out.println("Volume Atual: " + smart_tv.volume);

        smart_tv.ligar();
        System.out.println("A tv está ligada agora? " + smart_tv.ligado);
        smart_tv.desligar();
        System.out.println("A tv está ligada agora? " + smart_tv.ligado);

        smart_tv.baixar_volume();
        smart_tv.baixar_volume();
        smart_tv.baixar_volume();
        smart_tv.aumentar_volume();
        System.out.println("Volume Atual: " + smart_tv.volume);

        smart_tv.canal_acima();
        smart_tv.canal_acima();
        smart_tv.canal_acima();
        smart_tv.canal_acima();
        smart_tv.canal_abaixo();
        System.out.println("Canal Atual: " + smart_tv.canal);

        smart_tv.mudar_canal(52);
        System.out.println("Canal Atual: " + smart_tv.canal);

    }
}
