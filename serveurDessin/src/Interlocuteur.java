import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.text.Normalizer;

public class Interlocuteur extends Thread {

    BufferedReader fluxEntrant;

    public Interlocuteur(Socket socket) throws IOException {
        this.fluxEntrant = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    }
    public void run() {
        String chaineRecu;

        try {
            Dessin D = new Dessin("Test de dessin",1000,1000);
            Ecouteur f = new Ecouteur();
            D.addWindowListener(f);
            // while(!Thread.interrupted()) {
            chaineRecu = fluxEntrant.readLine();
            System.out.println("Les coordonnée qui ont été envoye sont :" + chaineRecu);
            D.dessiner(chaineRecu);
            D.afficher();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

}
