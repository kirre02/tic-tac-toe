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

    @Test
    void testRowWin() {
        // Make moves to complete the first row with 'X' (current player)
        board.makeMove(0, 0);  // X
        board.makeMove(1, 0);  // O
        board.makeMove(0, 1);  // X
        board.makeMove(1, 1);  // O
        board.makeMove(0, 2);  // X

        assertTrue(board.checkWinner(), "Player X should win with a complete row");
    }

    @Test
    void testColumnWin() {
        // Make moves to complete the first column with 'X' (current player)
        board.makeMove(0, 0);  // X
        board.makeMove(0, 1);  // O
        board.makeMove(1, 0);  // X
        board.makeMove(1, 1);  // O
        board.makeMove(2, 0);  // X

        assertTrue(board.checkWinner(), "Player X should win with a complete column");
    }

    @Test
    void testDiagonalWin() {
        // Make moves to complete the diagonal from top-left to bottom-right with 'X'
        board.makeMove(0, 0);  // X
        board.makeMove(0, 1);  // O
        board.makeMove(1, 1);  // X
        board.makeMove(0, 2);  // O
        board.makeMove(2, 2);  // X

        assertTrue(board.checkWinner(), "Player X should win with a diagonal from top-left to bottom-right");
    }

    @Test
    void testOtherDiagonalWin() {
        // Make moves to complete the anti-diagonal from top-right to bottom-left with 'X'
        board.makeMove(0, 2);  // X
        board.makeMove(0, 1);  // O
        board.makeMove(1, 1);  // X
        board.makeMove(1, 0);  // O
        board.makeMove(2, 0);  // X

        assertTrue(board.checkWinner(), "Player X should win with a diagonal from top-right to bottom-left");
    }

    @Test
    void testNoWin() {
        board.makeMove(0, 0);  // X
        board.makeMove(0, 1);  // O
        board.makeMove(0, 2);  // X
        board.makeMove(1, 0);  // O
        board.makeMove(1, 2);  // X
        board.makeMove(2, 1);  // O

        assertFalse(board.checkWinner(), "There should be no winner with this setup");
    }





}
