package chess;

public class Knight extends AbstractPiece{

    public Knight(int row, int column, Color color) {
        super(row, column, color);
    }

    /**
     * A knight can move only in an L pattern: two cells horizontally and one vertically or vice versa.
     * @param rowToMove the row where the piece might be moved to.
     * @param columnToMove the column where the piece might be moved to.
     * @return True if the piece can move to that location. False otherwise.
     */
    @Override
    public boolean canMove(int rowToMove, int columnToMove){
        return (Math.abs(rowToMove - this.row) == 2 && Math.abs(columnToMove - this.column) == 1)||
                (Math.abs(rowToMove - this.row) == 1 && Math.abs(columnToMove - this.column) == 2);
    }


}
