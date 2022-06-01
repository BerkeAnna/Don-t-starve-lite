package Player;

public class Pick {
    private int piece;
    private int life;

    public Pick() {
        this.life=8;
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

    public void createPick(int grass, int tree){
        if(grass>=2 && tree>=2){
            this.piece++;
            System.out.println("+1 pick");
        }else{
            System.out.println("You can't make Picks!");
        }
    }

    public void brokePick(){
        setLife(getLife()-1);
        if(this.life==0){
            System.out.println("Your pick is broken!\n- 1 pick");
            this.piece--;
            this.life=8;
        }

    }

}
