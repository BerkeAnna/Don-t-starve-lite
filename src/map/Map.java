package map;

import Player.Player;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Map {
    int width=100;
    int height=100;
    MapField[][] map;
    int fieldsCount= width*height;
    int playerPosX=5;
    int playerPosY=5;
    Player player = new Player();
    public boolean night = false;
    int stepscount=0;
    Twig twig = new Twig();
    int mapwriteXleft;
    int mapwriteXright;
    int mapwriteYleft;
    int mapwriteYright;
    int view = 4; //map size what player see


    public Map() {
         map = new MapField[width][height];
         mapFieldType();
    }

    public void mapFieldType(){
        int notfree = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                Random random = new Random();
                //            int x = random.nextInt(10);
                //            int y = random.nextInt(10);

                if (notfree < fieldsCount) {
                    int ratio = random.nextInt(10);
                    int field = random.nextInt(7);
                    switch (field) {
                        case 0:
                            if(ratio>6) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Grass();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 1:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Tree();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 2:
                            if(ratio>8) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Stone();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 3:
                            if(ratio>8) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Flower();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 4:
                            if(ratio>6) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Twig();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                 }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 5:
                            if(ratio>8) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Carrot();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 6:
                            if(ratio>8) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Berry();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        default:
                            break;

                    }
                    notfree++;
                }
                    switch (i){
                        case 0 :
                            map[i][j] = new Water();
                        case 99:
                            map[i][j] = new Water();
                    }
                switch (j){
                    case 0 :
                        map[i][j] = new Water();
                    case 99:
                        map[i][j] = new Water();
                }

            }
            System.out.println();
        }
        }
        public void mapView(){
            if(playerPosX-view<0){
                mapwriteXleft=0;
            }else{
                mapwriteXleft=playerPosX-view;
            }
            if(playerPosY-view<0){
                mapwriteYleft=0;
            }else{
                mapwriteYleft=playerPosY-view;
            }
            if(playerPosX+view>width-1){
                mapwriteXright=0;
            }else{
                mapwriteXright=playerPosX+view;
            }
            if(playerPosY+view>width-1){
                mapwriteYright=0;
            }else{
                mapwriteYright=playerPosY+view;
            }
        }
        public void writeMap() {

            mapView();
            for (int i = mapwriteXleft; i < mapwriteXright; i++) {
                for (int j = mapwriteYleft; j < mapwriteYright; j++) {
                    if (i == playerPosX && j == playerPosY) {
                        System.out.print("|00|");
                    } else if (map[i][j] instanceof Berry ) {
                        System.out.print("|Be|");
                    } else if (map[i][j] instanceof Carrot) {
                        System.out.print("|Ca|");
                    }else if (map[i][j] instanceof Flower) {
                        System.out.print("|Fl|");
                    }else if (map[i][j] instanceof Grass) {
                        System.out.print("|Gr|");
                    } else if (map[i][j] instanceof Stone) {
                        System.out.print("|St|");
                    } else if (map[i][j] instanceof Tree) {
                        System.out.print("|Tr|");
                    } else if (map[i][j] instanceof Twig) {
                        System.out.print("|Tw|");
                    } else if (map[i][j] instanceof Water) {
                        System.out.print("|~~|");
                    } else {
                        System.out.print("|  |");
                    }
                }
                System.out.println();
            }
        }

        public void playerPos(){

            System.out.println("Direction (w, a, s, d): ");
            Scanner in = new Scanner(System.in);
            String direction = in.nextLine();
            String directionName = null;
            stepscount++;
            stepCounter(stepscount);
            switch (direction){
                case "a": playerPosY = playerPosY-1;
                    if(playerPosY<0 || map[playerPosX][playerPosY] instanceof Water){
                        playerPosY+=1;
                    }
                    directionName="left";
                    stepscount+=player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "d": playerPosY = playerPosY+1;
                    if(playerPosY>=width || map[playerPosX][playerPosY] instanceof Water){
                        playerPosY-=1;
                    }
                    directionName="right";
                    stepscount+=player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "w": playerPosX = playerPosX-1;
                    if(playerPosX<0 || map[playerPosX][playerPosY] instanceof Water){
                        playerPosX+=1;
                    }
                    directionName="up";
                    stepscount+=player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "s": playerPosX = playerPosX+1;
                    if(playerPosX>=height || map[playerPosX][playerPosY] instanceof Water){
                        playerPosX-=1;
                    }
                    directionName="down";
                    stepscount+=player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "axe":
                    player.playerDoTools("axe");
                    minussteps(1);
                    break;
                case "pick":
                    player.playerDoTools("pick");
                    minussteps(1);
                    break;
                case "campfire":
                    player.playerDoTools("campfire");
                    minussteps(1);
                    break;
                case "wreath":
                    player.playerDoTools("wreath");
                    minussteps(1);
                    break;
                case "berry":
                    player.playerDoTools("berry");
                    minussteps(1);
                    break;
                case "boiled berry":
                    player.playerDoTools("boiled berry");
                    minussteps(1);
                    break;
                case "carrot":
                    player.playerDoTools("carrot");
                    minussteps(1);
                    break;
                case "boiled carrot":
                    player.playerDoTools("boiled carrot");
                    minussteps(1);
                    break;
                default:
                    directionName = "";
            }
            System.out.println( "\nAnd the new position: ("+ playerPosX + ";" + playerPosY + ")" );
            System.out.println(player);
            System.out.println("Night: " + night + " points: " + stepscount );
//            player.writePlayerBag();
//            player.toString();



//            mapFieldType();
            writeMap();
            playerPos();

        }
        public void minussteps(int minus){
            this.stepscount+=minus;
        }

        public void playerinfo(){
            player.setHunger(player.getHunger()-0.4);
            if(night) {
                player.setBrain(player.getBrain()-0.4);
            }
        }
        public void stepCounter(int steps){
            if(steps<=5){
                night=false;
            }else{
                night=true;
            }
            if(steps==8){
                stepscount=0;
            }

        }



        public void putInTheBag(String step){
            switch (step){
                case "r" :
                    if(map[playerPosX][playerPosY-1] instanceof Berry){
                            player.newBagItem("Berry");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Carrot){
                        player.newBagItem("Carrot");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Flower){
                        player.newBagItem("Flower");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Grass){
                        player.newBagItem("Grass");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Stone){
                        player.newBagItem("Stone");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Tree){
                        player.newBagItem("Tree");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Twig){
                        player.newBagItem("Twig");
                    }
                    player.writeBagItems();
            }
        }

        public void isItPlayer(int i, int j, String fieldname){
                if(i==playerPosX && j== playerPosY){
                    System.out.print("|00|");
                }else{
                    System.out.print(fieldname);
                    switch (fieldname){
                        case "|Gr|" : map[i][j] = new Grass();
                            System.out.print(fieldname);
                            break;
//                        case "|Be|" : map[i][j] = new Berry();
//                            break;
//                        case "|Ca|" : map[i][j] = new Carrot();
//                            break;
//                        case "|Fl|" : map[i][j] = new Flower();
//                            break;
//                        case "|St|" : map[i][j] = new Stone();
//                            break;
//                        case "|Tr|" : map[i][j] = new Tree();
//                            break;
//                        case "|Tw|" : map[i][j] = new Twig();
//                            break;
                        default:
                            System.out.print("|  |");
                            break;

                    }
                }
        }

        //végigmegy +1 random switchben mehgínzi melyik
//        public void MapObjects(){
//            int notfree=0;
//            for (int i = 0; i < map.length; i++) {
//                for (int j = 0; j < map[i].length; j++) {
//                    Random random = new Random();
//                    //            int x = random.nextInt(10);
//                    //            int y = random.nextInt(10);
//
//                    if (notfree<fieldsCount){
//                        int ratio = random.nextInt(10);
//                        int field = random.nextInt(2);
//                        switch (field){
//                            case 0 : map[i][j]= new Grass();
//                            case 1 : map[i][j] = new Water();
//                        }
//                    }
//                }
//            }
//        }
    }





