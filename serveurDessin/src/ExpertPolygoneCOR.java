import java.awt.*;

public class ExpertPolygoneCOR extends ExpertDessinCOR{
    protected ExpertPolygoneCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }


    public boolean Dessiner(String s, Graphics2D g) {
        //pour un polygone ou le string sera de forme  3;nombrePoint;x1,y1;x2,y2;...
        //3;6;410,460;460,415;500,425;480,435;550,445;410,460
        String sousChaine[]= s.split(";");

        if(sousChaine[0].equals("3")) // verifier si le debut de la chaine de caractere est polygone
        {
            //on va parcourir tous les points pour stocker les x dans un tableau
            //et les y dans un autre tableau
            int nbPoints=Integer.parseInt(sousChaine[1]);
            int []x = new int[nbPoints];
            int []y= new int[nbPoints];
            String xiyi[][] =new String[nbPoints][nbPoints];

            for (int i=0; i<nbPoints; i++)
            {
                    xiyi[i]=sousChaine[i+2].split(",");

                      x[i]=Integer.parseInt(xiyi[i][0]);
                     y[i]=Integer.parseInt(xiyi[i][1]);
               // System.out.println(xiyi[i][0]); // xi
                //x[i]=xiyi[i][0];
            }




            /*for(int i=2;i<nbPoints;i++) {
            // a voir les xiyi
                xiyi[i]= sousChaine[i].split(","); //je recupere les x,y des points qu on stock ici
                /*x[i] = f.ListePoints.get(i).getX();
                y[i] = f.ListePoints.get(i).getY();
                x[i]=Integer.parseInt(xiyi[0]); //on met les coordonnes du point xi
                y[i]=Integer.parseInt(xiyi[1]);
            }*/
            Polygon p = new Polygon(x, y,x.length );

            g.drawPolygon(p);


            return true;
        }
        else{
            return false;
        }
    }
}
