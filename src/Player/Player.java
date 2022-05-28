package Player;

public class Player {
    private double HP;
    private double hunger;
    private double brain;

    public Player() {
        this.HP=100;
        this.brain=100;
        this.hunger=100;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP-1;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) { //gettert kap
        this.hunger = hunger-1;
    }

    public double getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain-1;
    }


}
