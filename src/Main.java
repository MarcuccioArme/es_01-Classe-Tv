public class Main {

    public static void main(String[] args) {

        Televisore T1;

        String Marca;
        double Pollici;
        String Qualità;
        int Frequenza;
        int RisoluzioneOrizzontale, RisoluzioneVerticale;

        T1 = new Televisore();

        Marca = T1.LeggiMarca();
        Pollici = T1.LeggiPollici();
        Qualità = T1.LeggiQualità();
        Frequenza = T1.LeggiFrequenza();
        RisoluzioneOrizzontale = T1.LeggiRisoluzioneOrizzontale();
        RisoluzioneVerticale = T1.LeggiRisoluzioneVerticale();

        System.out.println("La marca del televisore è: "+Marca+" da: "+Pollici+" pollici, la qualità è: "+Qualità+", la frequenza è: "+Frequenza+"Hz e la risoluzione è: "+RisoluzioneOrizzontale+"x"+RisoluzioneVerticale);

    }

}