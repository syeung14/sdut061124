package game;

public class TicTacToeBoard {
  private final int SIZE = 3;
  private Peg nextPegToPlace = Peg.FIRST;
  private Peg pegs[][] = new Peg[SIZE][SIZE];

  public TicTacToeBoard() {
    for(int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        pegs[i][j] = Peg.EMPTY;
      }
    }
  }
  public void placePeg(int row, int column) {
//    if(row > SIZE) {
//      throw new TicTacToeBoardException("Row is out of bounds");
//    }
    //code written without test will show up as poor coverage. We can avoid
    //writing code without taking the time to write tests. It will also help us
    //to think about > or >= in the row > SIZE. We can walk away with confidence, now
    //and when someone changes the code.

    verifyLocationIsEmpty(row, column);
    pegs[row][column] = nextPegToPlace;

    toggleNextPeg();

    //    if(pegs[row][column] != Peg.EMPTY) {
//      throw new TicTacToeBoardException("A peg already exists at that location");
//    }

//    if(nextPegToPlace == Peg.FIRST) {
//      nextPegToPlace = Peg.SECOND;
//    } else {
//      nextPegToPlace = Peg.FIRST;
//    }
  }
  //how does that feel?
  //It feels complex, too much going on. I feel like SLAP is needed?
  //Single Level of Abstraction Principle (SLAP). We can refactor, extract the code into
  //toggleNextPeg() and call it from within the above function.

  //Make it work, make it better real soon - refactor.

  private void toggleNextPeg() {
    if (nextPegToPlace == Peg.FIRST) {
      nextPegToPlace = Peg.SECOND;
    } else {
      nextPegToPlace = Peg.FIRST;
    }
  }

  private void verifyLocationIsEmpty(int row, int column) {
    if (pegs[row][column] != Peg.EMPTY) {
      throw new TicTacToeBoardException("A peg already exists at that location");
    }
  }

  public Peg pegAt(int row, int column) {
    return pegs[row][column];
  }
}
