package org.example.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void testValidMove() {

        assertTrue(board.makeMove(0, 0), "First move should be valid");
        assertEquals('X', board.getCell(0, 0), "Cell (0,0) should be marked with 'X'");
        assertEquals('O', board.getCurrentPlayer(), "Current player should switch to 'O' after X's turn");

        assertTrue(board.makeMove(1, 1), "Second move should be valid");
        assertEquals('O', board.getCell(1, 1), "Cell (1,1) should be marked with 'O'");
        assertEquals('X', board.getCurrentPlayer(), "Current player should switch back to 'X'");
    }

    @Test
    void testInvalidMove() {
        assertTrue(board.makeMove(0, 0), "First move should be valid");
        assertFalse(board.makeMove(0, 0), "Move on an occupied cell should be invalid");

        assertEquals('X', board.getCell(0, 0), "Cell (0,0) should remain marked with 'X'");
    }


}
