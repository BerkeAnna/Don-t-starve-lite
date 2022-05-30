package Player;

import map.*;
import Player.Axe;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private double HP;
    private double hunger;
    private double brain;
    //TODO: items variables, and methods for objects like fire or pick. Like: public void makePick(int tree_count, grass_count){ tree--; grass--; pick++}
    private List<String> bag = new ArrayList<>();
    private int berry;
    private int carrot;
    private int grass;
    private int stone;
    private int tree;
    private int twig;
    private int flower;
    private int axe;
   // Axe axe = new Axe();


    public Player() {
        this.HP=100;
        this.brain=100;
        this.hunger=100;
        this.berry=0;
        this.carrot=0;
        this.flower=0;
        this.grass=0;
        this.stone=0;
        this.tree=0;
        this.twig=0;
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

    public int getBerry() {
        return berry;
    }

    public void setBerry(int berry) {
        this.berry = berry;
    }

    public int getCarrot() {
        return carrot;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public int getGrass() {
        return grass;
    }

    public void setGrass(int grass) {
        this.grass = grass;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getTree() {
        return tree;
    }

    public void setTree(int tree) {
        this.tree = tree;
    }

    public int getTwig() {
        return twig;
    }

    public void setTwig(int twig) {
        this.twig = twig;
    }

    public int getFlower() {
        return flower;
    }

    public void setFlower(int flower) {
        this.flower = flower;
    }

    public List<String> getBag() {
        return bag;
    }

    public void setBag(List<String> bag) {
        this.bag = bag;
    }
    public void newBagItem(String name){
        bag.add(name);

    }

    public void writeBagItems(){
        for (int i=0; i < bag.size(); i++) {
            System.out.println(bag.get(i) + " ");
        }
    }

    public void pickUpItem(MapField[][] map, int playerX, int playerY){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                    if(i== playerX && j == playerY){
                        if (map[i][j] instanceof Berry ) {
                            setBerry(getBerry()+1);
                            System.out.println(berry);
                        } else if (map[i][j] instanceof Carrot) {
                            setCarrot(getCarrot()+1);
                            System.out.print(carrot);
                        } else if (map[i][j] instanceof Grass) {
                            setGrass(getGrass()+1);
                            System.out.print(grass);
                        } else if (map[i][j] instanceof Stone) {
                            setStone(getStone()+1);
                            System.out.print(stone);
                        } else if (map[i][j] instanceof Tree) {
                            setTree(getTree()+1);
                            System.out.print(tree);
                        } else if (map[i][j] instanceof Twig) {
                            setTwig(getTwig()+1);
                            System.out.print(twig);
                        } else if (map[i][j] instanceof Water){

                        }
                    }
            }
        }

    }

  public void writePlayerBag(){
        System.out.println("Berry: " + berry + " Carrot: " + carrot + " Flower: "+ flower + " Grass: " + grass + " Stone: " + stone +
                " Tree: " + tree + " Twig: "+ twig );

  }


}
