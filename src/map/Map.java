package map;

import java.util.Random;

public class Map {
    int width=10;
    int height=10;
    MapField[][] map;
    int fieldsCount= width*height;


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
                                map[i][j] = new Grass();
                                System.out.print("|Gr|");
                            }else{
                                map[i][j] = new MapField();
                                System.out.print("|  |");
                            }
                            break;
                        case 1:
                            if(ratio>5) {
                                map[i][j] = new Tree();
                                System.out.print("|Tr|");
                            }else{
                                map[i][j] = new MapField();
                                System.out.print("|  |");
                            }
                            break;
                        case 2:
                            if(ratio>5) {
                                map[i][j] = new Stone();
                                System.out.print("|St|");
                            }else{
                                map[i][j] = new MapField();
                                System.out.print("|  |");
                            }
                            break;
                        case 3:
                            if(ratio>5) {
                                map[i][j] = new Flower();
                                System.out.print("|Fl|");
                            }else{
                                map[i][j] = new MapField();
                                System.out.print("|  |");
                            }
                            break;
                        case 4:
                            if(ratio>5) {
                                map[i][j] = new Twig();
                                System.out.print("|Tw|");
                            }else{
                                map[i][j] = new MapField();
                                System.out.print("|  |");
                            }
                            break;
                        case 5:
                            if(ratio>5) {
                                map[i][j] = new Carrot();
                                System.out.print("|Cr|");
                            }else{
                                map[i][j] = new MapField();
                                System.out.print("|  |");
                            }
                            break;
                        case 6:
                            if(ratio>5) {
                                map[i][j] = new Berry();
                                System.out.print("|Be|");
                            }else{
                                map[i][j] = new MapField();
                                System.out.print("|  |");
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





