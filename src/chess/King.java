package chess;

public class King extends AbstractPiece{
    public King(int row, int column, Color color) {
        super(row, column, color);
    }

    /**
     * A king can move one square in any direction (horizontally, vertically, or diagonally).
     * @param rowToMove the row where the piece might be moved to.
     * @param columnToMove the column where the piece might be moved to.
     * @return True if the piece can move to that location. False otherwise.
     */
    @Override
    public boolean canMove(int rowToMove, int columnToMove) {
        // A king can move one square in any direction: horizontally, vertically, or diagonally.
        int rowDiff = Math.abs(rowToMove - this.row);
        int colDiff = Math.abs(columnToMove - this.column);
        return (rowDiff == 1 && colDiff <= 1) || (colDiff == 1 && rowDiff <= 1);
    }
}
