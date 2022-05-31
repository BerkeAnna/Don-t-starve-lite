package map;

public class Grass extends MapField {
    private int piece;
    public Grass() {
        this.piece=0;

    }

    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 grass\n";
    }
}
