package chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {

    @Test
    void canMove() {
        King king = new King(1,1,Color.WHITE);
        assertTrue(king.canMove(2,2));
        assertFalse(king.canMove(2,3));
    }
}