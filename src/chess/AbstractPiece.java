package chess;

import java.awt.*;

enum Color{BLACK,WHITE};
public abstract class AbstractPiece implements ChessPiece{
    public int row;
    public int column;
    public Color color;

    public AbstractPiece(int row, int column, Color color){
        this.row = row;
        this.column = column;
        this.color = color;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    /**
     * check if the chess piece can move diagonally
     * @param rowToMove
     * @param columnToMove
     * @return
     */
    protected boolean canMoveDiagonally(int rowToMove, int columnToMove) {
        int rowDiff = Math.abs(rowToMove - this.row);
        int colDiff = Math.abs(columnToMove - this.column);
        return rowDiff == colDiff;
    }

    /**
     * check if the chess piece can move Horizontally
     * @param rowToMove
     * @param columnToMove
     * @return
     */
    protected boolean canMoveHorizontally(int rowToMove, int columnToMove) {
        return rowToMove == this.row && columnToMove != this.column;
    }

    /**
     * check if the chess piece can move Vertically
     * @param rowToMove
     * @param columnToMove
     * @return
     */
    protected boolean canMoveVertically(int rowToMove, int columnToMove) {
        return rowToMove != this.row && columnToMove == this.column;
    }

    @Override
    public boolean canMove(int rowToMove, int columnToMove) {
        return false;
    }

    @Override
    public boolean canKill(ChessPiece piece){
        return piece.getColor() != this.getColor() && canMove(piece.getRow(), piece.getColumn());
    }
}
