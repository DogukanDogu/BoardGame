package com.dogukan;

import java.io.*;
import java.util.*;

public class BoardGameRunner {

    /* INITIALIZING THE FILE PATH  */
    private static String FILE_PATH = "C:\\BoardGame\\src\\files\\board3.txt";
    private static String FILE_NAME = "Board1.txt";

    public static void main(String[] args) {
        /* CREATING A 8 X 8 MATRIX WHICH REPRESENTS CHESS BOARD*/
        BoardCell[][] chessBoard = new BoardCell[8][8];
        /* CREATING BOARD OBJECT WHICH REPRESENTS CHESS BOARD PLAYS */
        Board board = new Board();
        /* READING A CHESS PLAY FILES */
        board.readFile(chessBoard,FILE_PATH);
        /* DISPLAYING CHESS BOARD*/
        board.display(chessBoard);
        /* CALCULATE ALL BLACK CHESS STONES POINTS */
        board.calculateAllPointsOfBlackStones(chessBoard);
        /* CALCULATE ALL WHITE CHESS STONES POINTS */
        board.calculateAllPointsOfWhiteStones(chessBoard);
        /* CALCULATE THREATS OF CHESS STONES POINTS */
        board.calculateAndDisplayThreatsOfHorseAndElephant(chessBoard,FILE_NAME,FILE_PATH);
    }

}





