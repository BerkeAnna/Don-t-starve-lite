package Player;

public class CampFire {
    private int piece;
    private boolean life;

    public CampFire() {
        this.life=true;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public boolean getLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public void createFire(int grass, int tree, int stone){
        if(grass>=2 && tree>=2 && stone>=4){
            this.piece++;
            System.out.println("+1 campfire");
        }else{
            System.out.println("You can't make campfire!");
        }
    }

    //TODO: tábortűz: a meggyújtás napjának végéig (éjszaka végéig) tart, utána kialszik
    public void brokeFire(boolean night){
        if(night){
            setLife(false);
            setPiece(getPiece()-1);
            life=true;
        }
    }
}
