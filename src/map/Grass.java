package map;

public class Grass extends MapField implements ItemPlus {
    private int piece;

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece -= piece;
    }

    public Grass() {
        this.piece=0;

    }
    @Override
    public void plus() {
        this.piece++;
    }

    @Override
    public void minus(int number) {
        setPiece(number);
    }

    @Override
    public String toString() {
        return "+1 grass\n";
    }
}
