package map;

public class Berry extends MapField implements ItemPlus {
    private int piece;

    public Berry() {
        this.piece=0;
    }
    @Override
    public void plus() {
        piece++;
    }


    @Override
    public String toString() {
        return  "+1 berry\n";
    }


}
