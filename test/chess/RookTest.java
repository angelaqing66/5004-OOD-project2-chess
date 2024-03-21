package chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {

    @Test
    void canMove() {
        Rook rook = new Rook(1,1,Color.WHITE);
        assertTrue(rook.canMove(1,2));
        assertFalse(rook.canMove(2,2));
    }

}