package map;

public class Stone extends MapField implements ItemPlus{
    private int piece;
    public Stone() {
        this.piece=0;

    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    @Override
    public void plus() {
        piece++;
    }

    @Override
    public void minus(int number) {
        this.piece-=number;
    }

    @Override
    public String toString() {
        return "+1 stone\n";
    }
}
