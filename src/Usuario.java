public class Usuario {

    public static void main(String[] args) throws Exception{
    SmartTv smartTv = new SmartTv();

 System.out.println("TV Ligada ?" + " " + smartTv.ligada);
 System.out.println("Canal Atual :" + " " + smartTv.canal);
 System.out.println("Volume Atual :" + " "+ smartTv.volume);


    
    smartTv.ligar(); //Estamos chamando o método ligar (true) para nosso print
    smartTv.desligar(); //Estamos chamando o método desligar (false) para nosso print



    smartTv.aumentarVolume();//Estamos chamando o método para aumentar o valume, oui seja, incremenmtar +1 
    smartTv.diminuirVolume();//Estamos chamando o método para diminuir volume, ou seja, decrementar 1
    smartTv.diminuirVolume();//Estamos chamando o método para diminuir volume, ou seja, decrementar 1
    smartTv.diminuirVolume();//Estamos chamando o método para diminuir volume, ou seja, decrementar 1
    smartTv.diminuirVolume();//Estamos chamando o método para diminuir volume, ou seja, decrementar 1



    
    smartTv.mudarCanal(23);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.diminuirCanal();
    smartTv.diminuirCanal();





}
}