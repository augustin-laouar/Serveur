import java.awt.*;

public class ExpertPolygoneCOR extends ExpertDessinCOR{
    protected ExpertPolygoneCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }


    public boolean Dessiner(String s, Graphics2D g) {
        //pour un polygone ou le string sera de forme  3;nombrePoint;x1,y1;x2,y2;...
        //3;6;410,460;460,415;500,425;480,435;550,445;410,460;colorRgb
        String sousChaine[]= s.split(";");
        int cl[] = new int[3];

        if(sousChaine[0].equals("3")) // verifier si le debut de la chaine de caractere est polygone
        {
            int nbPoints = Integer.parseInt(sousChaine[1]);
            cl= RecupererCouleur(sousChaine);

            Color c = new Color(cl[0],cl[1],cl[2]);
            g.setColor(c);
            //on va parcourir tous les points pour stocker les x dans un tableau
            //et les y dans un autre tableau

            int []x = new int[nbPoints];
            int []y= new int[nbPoints];
            String xiyi[][] =new String[nbPoints][nbPoints];

            for (int i=0; i<nbPoints; i++)
            {
                    xiyi[i]=sousChaine[i+2].split(",");
                    x[i]=Integer.parseInt(xiyi[i][0]) ;
                    y[i]=Integer.parseInt(xiyi[i][1]) ;
            }

            Polygon p = new Polygon(x, y,x.length );
            g.fillPolygon(p);

            return true;
        }
        else{
            return false;
        }
    }
}
