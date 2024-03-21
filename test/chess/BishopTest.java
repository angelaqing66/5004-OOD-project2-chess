package chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @Test
    void canMove() {
        Bishop bishop = new Bishop(1,1,Color.WHITE);
        assertTrue(bishop.canMove(2,2));
        assertFalse(bishop.canMove(2,3));
    }

}