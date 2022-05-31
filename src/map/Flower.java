package map;

public class Flower extends MapField implements ItemPlus{

    private int piece;
    public Flower() {
        this.piece=0;

    }
    @Override
    public void plus() {
        this.piece++;
    }

    @Override
    public String toString() {
        return "+1 flower\n";
    }
}
