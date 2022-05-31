package map;

public class Twig extends MapField implements ItemPlus{
    private int piece;

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public Twig() {
        this.piece=0;

    }
    @Override
    public void plus() {
        this.piece++;
    }



    @Override
    public void minus(int number) {
        this.piece-=number;
    }

    @Override
    public String toString() {
        return "+1 twig\n";
    }


}
