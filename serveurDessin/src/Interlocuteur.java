import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Interlocuteur extends Thread {

    BufferedReader fluxEntrant;
    PrintStream fluxSortant;


    public Interlocuteur(Socket socket) throws IOException {
        this.fluxEntrant = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    }
    public void run() {
        String chaineRecu;
        try {
            while(!Thread.interrupted()) {
                chaineRecu = fluxEntrant.readLine();
                System.out.println("Les coordonnée qui ete envoye sont :" + chaineRecu);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
