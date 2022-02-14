//package ExpertCOR;
import java.awt.*;

public abstract class ExpertDessinCOR extends ExpertDessin {
    protected ExpertDessinCOR suivant;

    protected ExpertDessinCOR(ExpertDessinCOR suivant){
        this.suivant = suivant;
    }

    public boolean DessinerForme(String s, Graphics2D g){ //tu dois utiliser cette methode
        boolean result;
        result = Dessiner(s,g);
        if(!result){
            if(this.suivant != null){
                return this.suivant.DessinerForme(s,g);
            }
            else{
                return false;
            }
        }
        else{
            return result;
        }
    }
    public abstract boolean Dessiner(String s,Graphics2D g);
    // renvoi un tableau avecles couleur sous modele rgb res[0]=r res[1]=g res[2]=b
    public int[] RecupererCouleur(String[] msg){
        int res[]= new int[3];
        String cl[];
        if(msg[0].equals("2")) //si la forme a dessiner est un cercle
        {//dans ce cas on a un seul point mais aussi un centre etc donc pas vraiment le meme format
            cl=  msg[4].split(",");

        }
        else{
            int nbPoints =Integer.parseInt(msg[1]);
             cl = msg[nbPoints+2].split(",");

        }
        res[0]= Integer.parseInt(cl[0]);
        res[1] = Integer.parseInt(cl[1]);
        res[2]= Integer.parseInt(cl[2]);

        return res;

    }
}
