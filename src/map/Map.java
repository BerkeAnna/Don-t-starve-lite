package map;

import Player.Player;

import java.util.Random;

public class Map {
    int width=10;
    int height=10;
    MapField[][] map;
    int fieldsCount= width*height;
    int playerPosX=2;
    int playerPosY=8;
    Player player = new Player();


    public Map() {

        MapField[][] map = new MapField[width][height];
        int notfree=0;


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
                            if(ratio>5) {
//                                isItPlayer(i,j ,"|Gr|" );
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Grass();
                                    System.out.print("|Gr|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 1:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Tree();
                                    System.out.print("|Tr|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 2:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Stone();
                                    System.out.print("|St|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 3:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Flower();
                                    System.out.print("|Fl|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 4:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Twig();
                                    System.out.print("|Tw|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                System.out.print("|00|");
                                 }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 5:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Carrot();
                                    System.out.print("|Cr|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 6:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Berry();
                                    System.out.print("|Be|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        default:
                            break;

                    }
                    notfree++;
                }

            }
            System.out.println();
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





