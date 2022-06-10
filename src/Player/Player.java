package Player;

import map.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//TODO: player and fire ddistance at night
public class Player {
    private double HP;
    private double hunger;
    private double brain;
    //TODO: items variables, and methods for objects like fire or pick. Like: public void makePick(int tree_count, grass_count){ tree--; grass--; pick++}
    private List<String> bag = new ArrayList<>();
    public Berry berry = new Berry();
    public Carrot carrot = new Carrot();
    public Grass grass = new Grass();
    public Stone stone = new Stone();
    public Tree tree = new Tree();
    Flower flower = new Flower();
    Twig twig = new Twig();
    Axe axe = new Axe();
    Pick pick = new Pick();
    CampFire campFire = new CampFire();
    FlowerWreath flowerWreath = new FlowerWreath();
    int campfireX= campFire.getFirePosX();
    int campfireY= campFire.getFirePosY();

    DecimalFormat two = new DecimalFormat("##.00");



    public Player() {
        this.HP=10.0;
        this.brain=10.0;
        this.hunger=10.0;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        if(HP>100){
            HP=100;
        }else if(HP<0){
            HP = 0;
        }
        this.HP = HP;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) { //gettert kap
        if(hunger>100){
            hunger=100;
        }else if(hunger<0){
            hunger = 0;
        }
        this.hunger = hunger;
    }

    public double getBrain() {
        return brain;
    }

    public void setBrain(double brain) {
        if(brain>100){
            brain=100;
        }else if(brain<0){
            brain = 0;
        }
        this.brain = brain;
    }

    public int getCampfireX() {
        return campfireX;
    }

    public void setCampfireX(int campfireX) {
        this.campfireX = campfireX;
    }

    public int getCampfireY() {
        return campfireY;
    }

    public void setCampfireY(int campfireY) {
        this.campfireY = campfireY;
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

    public int pickUpItem(MapField[][] map, int playerX, int playerY){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                    if(i== playerX && j == playerY){
                        if (map[i][j] instanceof Berry ) {
                            berry.setPiece(berry.getPiece()+1);
                            System.out.print(berry);
                            return 1;
                        } else if (map[i][j] instanceof Carrot) {
                            carrot.setPiece(carrot.getPiece()+1);
                            System.out.print(carrot);
                            return 1;
                        } else if (map[i][j] instanceof Grass) {
                            grass.setPiece(grass.getPiece()+1);
                            System.out.print(grass);
                            return 1;
                        } else if (map[i][j] instanceof Stone) {
                            if(pick.getPiece()>0) {
                                stone.setPiece(stone.getPiece() + 1);
                                pick.brokePick();
                                System.out.print(stone);
                                return 4;
//                                System.out.println(stone.getPiece());
//                                System.out.println(pick.getLife());
                            }
                        } else if (map[i][j] instanceof Tree) {
                            if(axe.getPiece()>0) {
                                tree.setPiece(tree.getPiece() + 1);
                                axe.brokeAxe();
                                System.out.print(tree);
                                return 3;
//                                System.out.println(tree.getPiece());
//                                System.out.println(axe.getLife());
                            }
                        } else if (map[i][j] instanceof Twig) {
                            twig.setPiece(twig.getPiece()+1);
                            System.out.println("\nTwig db: " + twig.getPiece());
                            return 1;
                        } else if (map[i][j] instanceof Water){

                        }
                    }
            }
        }
    return 0;
    }

    public int minuspoints(int num){
        int r=num;
        return r;
    }

    public String playerParameters(){
        if(this.brain <=0 || this.HP <=0 ||this.hunger <=0){
            System.err.println("-------------------\nGAME OVER\n-------------------");
            System.exit(0);

        }
        return "Brain: " + two.format(this.brain) + " Hunger: " + two.format(this.hunger) + " HP: " + two.format(this.HP);
    }

    public void playerDoTools(String tool, int playerX, int playerY){
        if(Objects.equals(tool, "axe") && grass.getPiece()>=2 && twig.getPiece()>=3){
            axe.createAxe(grass.getPiece(),twig.getPiece());
            grass.setPiece(grass.getPiece()-2);
            twig.setPiece(twig.getPiece()-3);
            System.out.println("Grass: " + grass.getPiece());
            System.out.println("Twig " + twig.getPiece());

        }
        else if(Objects.equals(tool, "pick") && grass.getPiece()>=2 && tree.getPiece()>=2){
            pick.createPick(grass.getPiece(),tree.getPiece());
            grass.setPiece(grass.getPiece()-2);
            tree.setPiece(tree.getPiece()-2);
            System.out.println("Grass: " + grass.getPiece());
            System.out.println("tree " + tree.getPiece());

        }
        else if(Objects.equals(tool, "campfire") && grass.getPiece()>=2 && tree.getPiece()>=2 && stone.getPiece()>=4){
            campFire.createFire(grass.getPiece(),tree.getPiece(), stone.getPiece());
            grass.setPiece(grass.getPiece()-2);
            tree.setPiece(tree.getPiece()-2);
            stone.setPiece(stone.getPiece()-4);
            campFire.setFirePosX(playerX);
            campFire.setFirePosY(playerY);
            System.out.println("Grass: " + grass.getPiece());
            System.out.println("tree " + tree.getPiece());
            System.out.println("stone " + stone.getPiece());

        }
        else if(Objects.equals(tool, "wreath") && flower.getPiece()>=10 ){
            flowerWreath.createWreath(flower.getPiece());
            flower.setPiece(flower.getPiece()-10);
            System.out.println("Flower: " + flower.getPiece());

        }
        else if(Objects.equals(tool, "berry")){
            berry.eatBerry();
            setHP(getHP()-5.0);
            setHunger(getHunger()+10.0);
            setBrain(getBrain()+1.0);
            System.out.println("berry: " + berry.getPiece());

        }
        else if(Objects.equals(tool, "boiled berry")){
            berry.eatBerry();
            setHunger(getHunger()+8.0);
            setBrain(getBrain()+2.0);
            System.out.println("berry: " + berry.getPiece());

        }
        else if(Objects.equals(tool, "carrot")){
            carrot.eatCarrot();
            setHP(getHP()-10.0);
            setBrain(getBrain()+1.0);
            System.out.println("carrot: " + carrot.getPiece());

        }
        else if(Objects.equals(tool, "boiled carrot")){
            carrot.eatCarrot();
            setHunger(getHunger()+8.0);
            setHunger(getHunger()+2.0);
            setBrain(getBrain()+2.0);
            System.out.println("carrot: " + carrot.getPiece());

        }

    }

    //Todo: cselekvéspont csökkentés


    @Override
    public String toString() {
        return playerParameters();
    }
}
