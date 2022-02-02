import java.awt.*;

public class ExpertTraitCOR extends ExpertDessinCOR{


    protected ExpertTraitCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }
    public boolean Dessiner(String s, Graphics2D g) {
        // 1;nbPoints;x1,y1;x2,y2
        String sousChaine[]=s.split(";");

        if(sousChaine[0].equals("1"))
        {
            String p1[]=sousChaine[2].split(",");
            String p2[]=sousChaine[3].split(",");

            g.drawLine(Integer.parseInt(p1[0]),Integer.parseInt(p1[1]),Integer.parseInt(p2[0]),Integer.parseInt(p2[1]));
            return true;

        }
        else{
            return false;
        }

    }
}
