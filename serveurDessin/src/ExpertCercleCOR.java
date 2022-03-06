import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ExpertCercleCOR extends ExpertDessinCOR {

    protected ExpertCercleCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }

    @Override
    /**
     * dessin d'un cercle si la requete recu correspond a un cercle
     * */
    public boolean Dessiner(String s, Graphics2D g) {
        //pour un cercle on envoi sous forme  : 2;nbPoints;rayon;centre;color
        String sousChaine[]= s.split(";");
        int cl[]= new int[3];
        if(sousChaine[0].equals("2")){
            cl= RecupererCouleur(sousChaine);
            Color c = new Color(cl[0],cl[1],cl[2]);
            g.setColor(c);
            String point[] =sousChaine[3].split(",") ;

            g.fillOval(Integer.parseInt(point[0]),Integer.parseInt(point[1]),Integer.parseInt(sousChaine[2]),Integer.parseInt(sousChaine[2]));
            return true;
        }
        return false;
    }
}
