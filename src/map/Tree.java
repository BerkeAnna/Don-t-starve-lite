package map;

public class Tree extends MapField{
    private int piece;
    public Tree() {
        this.piece=0;

    }

    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 tree\n";
    }
}
