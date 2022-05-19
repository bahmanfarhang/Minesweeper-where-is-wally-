import java.util.Scanner;

//this is my class Board
public class Board {
    //below is my method, which is the "actions" for my object
        public void boardGame(String[][] myBoard){
            //the inner wokrings of the boardGame method with 1 paramtr which is a 2d array
            //shows the board
            // Loop through all rows
            for (int i = 0; i < myBoard.length; i++) {

                // Loop through all elements of current row
                for (int j = 0; j < myBoard[i].length; j++)
                    System.out.print(myBoard[i][j] + " ");
                System.out.println();
            }
        }
        //the input method from user
        public void playerInput(String[][] theBoard){
            boolean correctInput = false;
            // gets input from the user
            Scanner myScanner = new Scanner(System.in);
            System.out.println();
            System.out.println("now choose a box e.g. [a1]");
            System.out.println();
            String choiceSelection = myScanner.next();

            if (choiceSelection.contains("[e4]")){
                System.out.println(("YOU FOUND WALLY - little shit was hiding in [e4]" +
                        "\n       \\(^.^)" +
                        "      \n          ) )Z\n" +
                        "         /  \\\n"));

            }
            //loop within a loop - to loop through
                for (int outerArray = 0; (outerArray < theBoard.length); outerArray++) {
                    for (int innerArray = 0; (innerArray < theBoard[outerArray].length); innerArray++) {
                        // using a selection input choice as their initial selection from input "choiceSection"
                        if (theBoard[outerArray][innerArray].contains(choiceSelection)) {
                            theBoard[outerArray][innerArray] = "[XX]";
                            correctInput = true;
                            boardGame(theBoard);
                            playerInput(theBoard);
                        }
                    }
                }
                //keeps looping if not true and then print the method again with its inner workings
                while (!correctInput){
                    System.out.println("wrong input!");
                    playerInput(theBoard);
                }
                //end the game
            if (choiceSelection.contains("end")){
                System.out.println("game over");
            }
        }
}


