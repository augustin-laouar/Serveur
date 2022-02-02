import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Communication {
    int numPort;
    String adresse;

    Communication(int num,String chaine){
        numPort=num;
        adresse=chaine;
    }



    public void communiquer(){
        try {

            InetAddress adress = InetAddress.getByName(adresse);

            ServerSocket serveur = new ServerSocket(numPort,5,adress);

            System.out.println("le serveur a été créé  :" + serveur);

            while(true) {
                Socket socket = serveur.accept(); //accepte la connexion
                Interlocuteur interlocuteur = new Interlocuteur(socket);
                interlocuteur.start(); // lance le thread
            }
        } catch(IOException e) {

            e.printStackTrace();
        }

    }


}
