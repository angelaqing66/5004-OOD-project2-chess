package chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PawnTest {

    @Test
    public void testCanMove() {
        // Create a white pawn at row 1, column 3
        Pawn whitePawn = new Pawn(1, 3, Color.WHITE);

        // Test if the pawn can move one place forward
        assertTrue(whitePawn.canMove(2, 3));

        // Test if the pawn can move two places forward (first move)
        assertTrue(whitePawn.canMove(3, 3));

        // Test if the pawn can move diagonally forward to kill an opponent's piece
        assertTrue(whitePawn.canMove(2, 2));
        assertTrue(whitePawn.canMove(2, 4));

        // Test if the pawn cannot move backward
        assertFalse(whitePawn.canMove(0, 3));
        assertFalse(whitePawn.canMove(1, 2));
        assertFalse(whitePawn.canMove(1, 4));

        // Create a black pawn at row 6, column 3
        Pawn blackPawn = new Pawn(6, 3, Color.BLACK);

        // Test if the pawn can move one place forward
        assertTrue(blackPawn.canMove(5, 3));

        // Test if the pawn can move two places forward (first move)
        assertTrue(blackPawn.canMove(4, 3));

        // Test if the pawn can move diagonally forward to kill an opponent's piece
        assertTrue(blackPawn.canMove(5, 2));
        assertTrue(blackPawn.canMove(5, 4));

        // Test if the pawn cannot move backward
        assertFalse(blackPawn.canMove(7, 3));
        assertFalse(blackPawn.canMove(6, 2));
        assertFalse(blackPawn.canMove(6, 4));
    }

    @Test
    public void testCanKill() {
        // Create a white pawn at row 1, column 3
        Pawn whitePawn = new Pawn(1, 3, Color.WHITE);

        // Create a black pawn at row 2, column 2
        Pawn blackPawn1 = new Pawn(2, 2, Color.BLACK);
        // Create a black pawn at row 2, column 4
        Pawn blackPawn2 = new Pawn(2, 4, Color.BLACK);

        // Test if the white pawn can kill black pawns diagonally forward
        assertTrue(whitePawn.canKill(blackPawn1));
        assertTrue(whitePawn.canKill(blackPawn2));

        // Create a white pawn at row 6, column 3
        Pawn blackPawn = new Pawn(6, 3, Color.BLACK);

        // Create a white pawn at row 5, column 2
        Pawn whitePawn1 = new Pawn(5, 2, Color.WHITE);
        // Create a white pawn at row 5, column 4
        Pawn whitePawn2 = new Pawn(5, 4, Color.WHITE);

        // Test if the black pawn can kill white pawns diagonally forward
        assertTrue(blackPawn.canKill(whitePawn1));
        assertTrue(blackPawn.canKill(whitePawn2));
    }
}