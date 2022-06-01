package Player;

import map.Grass;
import map.Twig;

import java.sql.SQLOutput;

public class Axe {
    private int piece;
    private int life;

    public Axe() {
        this.life=10;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public void createAxe(int grass, int twig){
        if(grass>=2 && twig>=3){
            this.piece++;
            System.out.println("+1 axe");
        }else{
            System.out.println("You can't make Axe!");
        }
    }

    public void brokeAxe(){
        setLife(getLife()-1);
        if(this.life==0){
            System.out.println("Your axe is broken!\n- 1 axe");
            this.piece--;
            this.life=10;
        }

    }

//    @Override
//    public String toString() {
//        return "+1 axe";
//    }
}
