package chess;

public class Bishop extends AbstractPiece{

    public Bishop(int row, int column, Color color) {
        super(row, column, color);
    }

    /**
     * A bishop can only move diagonally
     * @param rowToMove the row where the piece might be moved to.
     * @param columnToMove the column where the piece might be moved to.
     * @return True if the piece can move to that location. False otherwise.
     */
    @Override
    public boolean canMove(int rowToMove, int columnToMove){
        return canMoveDiagonally(rowToMove, columnToMove);
    }

}
