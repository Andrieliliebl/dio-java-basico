public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25; 

    public void aumentarVolume () {
        //volume = volume + 1;
        volume ++;
    }

    public void diminuirVolume () {
        //volume = volume - 1;
        volume --;
    }

    public void proximoCanal () {
        canal ++;
    }

    public void canalAnterior () {
        canal --;
    }

    public void escolherCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void ligar () {
        ligada = true;
    }
   
    public void desligar () {
        ligada = false;
    }

}
