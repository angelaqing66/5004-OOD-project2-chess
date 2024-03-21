package chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    @Test
    void canMove() {
        Knight knight = new Knight(1,1,Color.WHITE);
        assertTrue(knight.canMove(3,2));
        assertFalse(knight.canMove(2,2));
    }
}