package chess;

public class Pawn extends AbstractPiece{

    private boolean firstMove;
    public Pawn(int row, int column, Color color) {
        super(row, column, color);
        this.firstMove = true;
    }

    /**
     * A pawn can move only “ahead,” not backwards towards where its color started. It can move only one place forward
     * in its own column (except the first time it moves: it can move one or two places forward).
     * @param rowToMove the row where the piece might be moved to.
     * @param columnToMove the column where the piece might be moved to.
     * @return True if the piece can move to that location. False otherwise.
     */
    @Override
    public boolean canMove(int rowToMove, int columnToMove) {
        int direction = (this.getColor() == Color.WHITE) ? 1 : -1;
        int rowDiff = rowToMove - this.row;
        int colDiff = Math.abs(column - this.column);
        if(colDiff == 0 && direction == rowDiff){
            return true;
        }else if(this.firstMove && colDiff == 0 && rowDiff == 2* direction){
            this.firstMove = false;
            return true;
        }else{
            return false;
        }

    }


    /**
     * The pawn must move one place forward diagonally to kill (it cannot kill by moving straight).
     * @param piece the piece that might be killed.
     * @return true if it can kill the piece input
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        int rowDiff = piece.getRow() - this.row;
        int colDiff = Math.abs(piece.getColumn()- this.column);
        int direction = (this.getColor() == Color.WHITE) ? 1 : -1;
        return  piece.getColor() != this.getColor() && rowDiff == direction &&
                Math.abs(rowDiff) == 1 && colDiff ==1;
    }
}
