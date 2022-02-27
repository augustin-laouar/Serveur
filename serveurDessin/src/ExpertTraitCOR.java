import java.awt.*;
import java.util.Locale;

public class ExpertTraitCOR extends ExpertDessinCOR{


    protected ExpertTraitCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }
    public boolean Dessiner(String s, Graphics2D g) {
        // 1;nbPoints;x1,y1;x2,y2;r,g,b
        String sousChaine[]=s.split(";");
        int cl[]= new int[3];


        if(sousChaine[0].equals("1"))
        {
            cl= RecupererCouleur(sousChaine); //renvoi un tableau de int avec cl[0] equivalent a r
            Color c = new Color(cl[0],cl[1],cl[2]);
            String p1[]=sousChaine[2].split(",");
            String p2[]=sousChaine[3].split(",");
            g.setColor(c);
            g.drawLine(Integer.parseInt(p1[0]) + Dessin.boundsX,Integer.parseInt(p1[1]) + Dessin.boundsY,Integer.parseInt(p2[0]) + Dessin.boundsX,Integer.parseInt(p2[1]) + Dessin.boundsY);
            return true;

        }
        else{
            return false;
        }

    }
}
