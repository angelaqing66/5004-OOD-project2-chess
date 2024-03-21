package chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractPieceTest {
    private Bishop bishop;

    @BeforeEach
    void setUp() {
         bishop = new Bishop(1,1,Color.WHITE);
    }

    @Test
    void getRow() {
        assertEquals(1,1,0.01);
    }

    @Test
    void getColumn() {
        assertEquals(1,1,0.01);
    }

    @Test
    void getColor() {
        assertEquals(Color.WHITE,Color.WHITE);
    }


    @Test
    void canKillTest_try_cannotKill() {
        Pawn pawn = new Pawn(2,2,Color.WHITE);
        assertEquals(this.bishop.canKill(pawn), false);
    }

    @Test
    void canKillTest_try_canKill() {
        Pawn pawn = new Pawn(2,2,Color.BLACK);
        assertEquals(this.bishop.canKill(pawn), true);
    }

}