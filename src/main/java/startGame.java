import java.util.Scanner;

public class startGame {
    public static void main(String[] args) {
        //game intro
        System.out.println("========================Welcome to MineSweeper (where is wally?)========================");
        System.out.println();
        System.out.println("Would you like to play the game best game ever played?!?!");
        System.out.println();
        System.out.println("press 1 to play or press 2 to exit");

        //creating an object from the class board
        Board boardGame = new Board();

        //player response
        Scanner myScanner = new Scanner(System.in);
        int response = myScanner.nextInt();

        if (response == 1) {
            System.out.println("lets play the GAME!");
            String[][] theBoard = {
                    {"[a1]", "[a2]", "[a3]", "[a4]", "[a5]", "[a6]"},
                    {"[b1]", "[b2]", "[b3]", "[b4]", "[b5]", "[b6]"},
                    {"[c1]", "[c2]", "[c3]", "[c4]", "[c5]", "[c6]"},
                    {"[d1]", "[d2]", "[d3]", "[d4]", "[d5]", "[d6]"},
                    {"[e1]", "[e2]", "[e3]", "[e4]", "[e5]", "[e6]"},
                    {"[f1]", "[f2]", "[f3]", "[f4]", "[f5]", "[f6]"},
                    {"[g1]", "[g2]", "[g3]", "[g4]", "[g5]", "[g6]"},
                    {"[h1]", "[h2]", "[h3]", "[h4]", "[h5]", "[h6]"},
            };
            //this is where im calling the method from Board class to perform its magic of looping the above "theBoard"
            //2d array
            boardGame.boardGame(theBoard);
            //this is where the player will give their input and then the method "playerInput" does it magic from the
            //Board class - this method is important as it will 'record' the players input in the 2d array, the theBoard
            //this will loop through the 'theBoard' - and place the xx on a particular chosen input through 'choiceSelection'
            boardGame.playerInput(theBoard);

            //Board.boardGame(theBoard);
//            System.out.println("now choose a box e.g. [a1]");
//            String choiceSelection = myScanner.next();
//            //System.out.println(choiceSelection);
//            for (int outerArray =0; outerArray <theBoard.length; outerArray++){
//                for (int innerArray=0; innerArray<theBoard[outerArray].length; innerArray++){
//
//                    if (theBoard[outerArray][innerArray].contains(choiceSelection)){
//                        theBoard[outerArray][innerArray]="xx";
//                    }
//                }
//            }
//            Board.boardGame(theBoard);
//
//            while (!Objects.equals(choice, theBoard[1][1] + theBoard[2][2])){
//            if (Objects.equals(choice, theBoard[0][1])){
//                System.out.println("you win");
//            }
//            else if (Objects.equals(choice, theBoard[0][0])) {
//                System.out.println("BOOOOOOOOOM!!!");
//            }
//            }
//        }
//        else if (response ==2) {
//            System.out.println("you didn't want to play...");
//        }
//        else {
//            System.out.println("you want to play or not? - choose 1 or 2");
//        }
//
        }
    }
}
