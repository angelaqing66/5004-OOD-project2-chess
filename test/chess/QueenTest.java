package chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void canMove() {
        Queen queen = new Queen(1,1,Color.WHITE);
        assertTrue(queen.canMove(2,2));
        assertTrue(queen.canMove(5,2));
    }
}