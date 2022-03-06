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
    /**
     * methode permettant de receptionner les requetes et les traiter
     * */
    public void run() {
        String chaineRecu;

        try {
            //on recupere une premier fois la premiere requete qui nous dit quelle est la taille de la fenetre
            //format 0;width;height
            chaineRecu=fluxEntrant.readLine();
            String s[]= chaineRecu.split(";");
            int width= Integer.parseInt(s[1]);
            int height= Integer.parseInt(s[2]);

            Dessin D = new Dessin("Test de dessin",width,height);
            Ecouteur f = new Ecouteur();
            D.addWindowListener(f);
            System.out.println("Taille de la fenetre : " + width +" , " + height);
            while(!Thread.interrupted()) {
                chaineRecu = fluxEntrant.readLine();
                if(chaineRecu != null) {
                    System.out.println("Les coordonnée qui ont été envoye sont :" + chaineRecu );
                    D.dessiner(chaineRecu);
                }
                else{
                    D.afficher();
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

}
