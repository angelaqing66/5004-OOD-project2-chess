package chess;

public class Rook extends AbstractPiece{
    public Rook(int row, int column, Color color) {
        super(row, column, color);
    }

    /**
     * A rook can move horizontally or vertically.
     * @param rowToMove the row where the piece might be moved to.
     * @param columnToMove the column where the piece might be moved to.
     * @return True if the piece can move to that location. False otherwise.
     */
    @Override
    public boolean canMove(int rowToMove, int columnToMove) {
        return canMoveHorizontally(rowToMove, columnToMove) || canMoveVertically(rowToMove, columnToMove);
    }
}
