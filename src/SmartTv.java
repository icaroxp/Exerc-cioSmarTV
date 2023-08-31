public class SmartTv {

    /*Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
Ela tenha as características: ligada (boolean), canal (int) e volume (int);
Nossa TV poderá ligar e desligar e assim mudar o estado para ligada;
Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente. */



    boolean ligada=false; //declaramos o estado inicial da TV (false)
    int canal=1; //Declaramos o estado do primeiro canal 
    int volume=20; //Declaramos o volume inicial da TV

    public void ligar(){ //Aqui chamamos um método ligar
        ligada = true;  //Quando ela estiver ligada, true;
        System.out.println("TV Ligada");
    }
        public void desligar(){ //Aqui chamamos um método desligar
        ligada = false; //Quando ela estiver desligada, false;
        System.out.println("TV Desligada");
    }

   public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
   }
   public void diminuirVolume(){
    volume--;
     System.out.println("Diminuindo o volume para: " + volume);
   }

   public void aumentarCanal(){
    canal++;
    System.out.println("Mudando o canal para:" + canal);
   }
    public void diminuirCanal(){
    canal--;
    System.out.println("Mudando o canal para:" + canal);
   }
   public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Definindo Canal através de números:" + canal);
   }


}
