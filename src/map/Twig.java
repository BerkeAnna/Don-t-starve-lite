package map;

public class Twig extends MapField implements ItemPlus{
    private int piece;
    public Twig() {
        this.piece=0;

    }

    @Override
    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 twig\n";
    }


}
