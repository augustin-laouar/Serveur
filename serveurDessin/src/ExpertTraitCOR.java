import java.awt.*;
import java.util.Locale;

public class ExpertTraitCOR extends ExpertDessinCOR{


    protected ExpertTraitCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }

   /**
    * dessiner un trait si la requete recu correspond a celle d'un cercle
    * */
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
            g.drawLine(Integer.parseInt(p1[0]),Integer.parseInt(p1[1]),Integer.parseInt(p2[0]),Integer.parseInt(p2[1]));
            return true;

        }
        else{
            return false;
        }

    }
}
