public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal atual eh o "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal trocado para o "+smartTv.canal);

        System.out.println("Tv ligada? "+smartTv.ligada);
        
        System.out.println("Qual volume? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: Tv Ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: Tv Desligada? "+ smartTv.ligada);

    }
    
}

