import java.util.Scanner;

public class Televisore {

    Scanner in = new Scanner(System.in);

    public String LeggiMarca() {

        String Marca;

        System.out.println("Inserisci la marca del televisore:");
        Marca = in.next();

        return Marca;
    }

    public double LeggiPollici () {

        double Pollici;

        System.out.println("Inserisci i pollici del televisore:");
        Pollici = in.nextDouble();

        return Pollici;
    }

    public String LeggiQualità () {

        String Qualità;

        System.out.println("Inserisci la qualità del televisore:");
        Qualità = in.next();

        return Qualità;
    }

    public int LeggiFrequenza () {

        int Frequenza;

        System.out.println("Inserisci la frequenza in Hz del televisore:");
        Frequenza = in.nextInt();

        return Frequenza;
    }

    public int LeggiRisoluzioneOrizzontale() {

        int Orizzontale;

        System.out.println("Inserisci la risoluzione Orizzontale del televisore:");
        Orizzontale = in.nextInt();

        return Orizzontale;
    }

    public int LeggiRisoluzioneVerticale() {

        int Verticale;

        System.out.println("Inserisci la risoluzione Verticale del televisore:");
        Verticale = in.nextInt();

        return Verticale;
    }

}