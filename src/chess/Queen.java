package chess;

public class Queen extends AbstractPiece{
    public Queen(int row, int column, Color color) {
        super(row, column, color);
    }

    /**
     * A queen can move horizontally, vertically and diagonally.
     * @param rowToMove the row where the piece might be moved to.
     * @param columnToMove the column where the piece might be moved to.
     * @return True if the piece can move to that location. False otherwise.
     */
    @Override
    public boolean canMove(int rowToMove, int columnToMove) {
        return canMoveHorizontally(rowToMove, column) || canMoveVertically(rowToMove, column) || canMoveDiagonally(rowToMove, column);
    }
}
