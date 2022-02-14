import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.text.Normalizer;

public class TestDessin {
    public static void main(String args[]){
        //try {
           /*Dessin D = new Dessin("Test de dessin",1000,1000);
            Ecouteur f = new Ecouteur();
            D.addWindowListener(f);
            Point p = new Point(410,460);
        //  Cercle c = new Cercle(p,50);

          //  D.afficher();
            //test pour dessiner un trait
          /* Point p2 = new Point(460,415);
           Point p3 = new Point(500,425);
           Point p4 = new Point(480,435);
            Point p5 = new Point(550,445);
            Point p6= new Point(410,460);
            Forme f1 = new Forme();
            f1.ListePoints.add(p);
            f1.ListePoints.add(p2);
            f1.ListePoints.add(p3);
            f1.ListePoints.add(p4);
            f1.ListePoints.add(p5);
            f1.ListePoints.add(p6);*/

          //test pour un cercle   2;rayon;point
               /* String cercle= "2;50;410,460";
                D.dessiner(cercle);
                D.afficher();*/

            //test pour un polygone  3;nbPoints;points
           /* String polygone="3;6;410,460;460,415;500,425;480,435;550,445;410,460";
            D.dessiner(polygone);
            D.afficher();*/



          /* test pour un trait
            String trait ="1;2;410,450;480,525";
            D.dessiner(trait);
            D.afficher();

           */



        // test de communication
            Communication com =new Communication(9111,"127.0.0.1");
           com.communiquer();


      /* }

        catch(InterruptedException e){
            System.out.println("Erreur\n");
        }*/

    }
}
