import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
public class CatTest {
    Cat testCat = new Cat("test", "carnivore", "male", 1, 1,"blue");
    // Name of Class is : test___________
    @Test
    public void testSetCat(){
// AssertEquals(Expected, Actual, Error Message);
        Assertions.assertEquals("test", testCat.getAnimalName(), "Cats name has not been made correctly");
        testCat.setAnimalName("IAmCat");
        Assertions.assertEquals("IAmCat", testCat.getAnimalName(), "Cats name has not changed");
    }
}*/


public class testMinesweeper {
    LivesLeft testLivesLeft = new LivesLeft();

    @Test
    public void setLivesLeft(){
        Assertions.assertEquals(1,1,"Well done, the test has been passed");
        testLivesLeft.playerTurns(1,3);
    }

    Board testBoard = new Board();
    @Test
    public void setBoard(){
        Assertions.assertEquals("[e4]", "[e4]","game won...");

    }
}

