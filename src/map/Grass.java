package map;

public class Grass extends MapField implements ItemPlus {
    private int piece;
    public Grass() {
        this.piece=0;

    }
    @Override
    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 grass\n";
    }
}
