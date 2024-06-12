package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeBoardTest {
  private TicTacToeBoard ticTacToeBoard;

  @BeforeEach
  void init() {
    ticTacToeBoard = new TicTacToeBoard(); //this give us isolation of the board between tests, keep it I of FAIR. Also helps with R of FAIR
  }

  @Test
  void canary() {
    assertTrue(true);
  }

  @Test
  void placeTheFirstPeg(){
    //TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

//    ticTacToeBoard.placePeg(new Cell(1, 1), new Player(new Peg("X")));
    //once we write the above action, let us ask "how does this feel"?
    //Simple, or Complex?
    //Easy or too much work before we can see this running?
    //feels great, or feels like Hummmm...

    //EP: Too many unknowns
    //Tests should allow us to uncover unknowns incrementally and graduallly.

    //Do we really need the Player? The Player is a human who plays the game. We do not need to
    //abstract that in the game. What if we need to store the players information and winners information?
    //That can be done in a different part of the design, not a concern here.
    //So, let's drop the Player, YAGNI.

//    ticTacToeBoard.placePeg(new Cell(1, 1), new Peg("X"));
    //how does that feel?
    //better, but...

    //Do we really need a Cell? Does not provide much value that we can see right now.

//    ticTacToeBoard.placePeg(1, 1, new Peg("X"));
    //how does that feel?
    //what if we pass O, W, Z, k, etc. for the peg? Typos, etc.
    //If we use an enum for Peg, we will not have those issues. Thus we do not have to test for
    //W, Z, etc. - good design reduces the need for tests.

//    ticTacToeBoard.placePeg(1, 1, Peg.X);
    //how does that feel?

    //What does X or O mean? What if we want the game to show not a X or a O, but a chicken and a goat?
    //X or O are merely visual representations that are relevant on the GUI.

    //From the domain point of view (DDD) what are we ***really*** talking about here?
    //We are really talking about the FIRST player's peg and the SECOND player's peg

//    ticTacToeBoard.placePeg(1, 1, Peg.FIRST);
    //how does that feel?

    //better, but...

    //if players are taking turn, then why should we ask for the peg at all?

    ticTacToeBoard.placePeg(1, 1);

    assertEquals(Peg.FIRST, ticTacToeBoard.pegAt(1, 1));
    //how does that feel?
  }
  //to implement the code, write minimum code. Do nothing if the code is not needed to pass current tests.

  //Why would we write a function and not implement any code in it right now?

  //The first few tests should help us to design the skin and the following tests should help us to
  //design the guts.

  //design outside in. Design what a function takes, then design what it does with that information.

  //First evolve the interface, then drive the implementation's design.

  @Test
  void placeTheSecondPeg(){
    ticTacToeBoard.placePeg(1, 2);
    ticTacToeBoard.placePeg(2, 1);

    assertEquals(Peg.FIRST, ticTacToeBoard.pegAt(1, 2));
    assertEquals(Peg.SECOND, ticTacToeBoard.pegAt(2, 1));
  }
  //should we place multiple asserts in a test or not?

  //If the asserts are indepedent of each other, then either write them in new tests or
  //place them in assertAll.

  //If the asserts are part of the same group of actions' effect, then place them in one test, one
  //after the other.

  @Test
  void placePegAtAnOccupiedPosition(){
    ticTacToeBoard.placePeg(1, 2);

    var ex = assertThrows(TicTacToeBoardException.class, () -> ticTacToeBoard.placePeg(1, 2));
    assertEquals("A peg already exists at that location", ex.getMessage());
  }

}

//Kent Beck: Unit testing is a act of design more than an act of verification

//We did not mechanically write test and code. We spend time thinking through the design and applying design principles.
