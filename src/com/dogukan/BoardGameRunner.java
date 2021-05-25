package com.dogukan;

import java.io.*;
import java.util.*;

public class BoardGameRunner {

    private static BoardCell[][] chessBoard = new BoardCell[8][8];
    private static Board board = new Board();
    private static String FILE_NAME = "C:\\BoardGame\\src\\files\\board1.txt";

    public static void main(String[] args) {
        board.readFile(chessBoard,FILE_NAME);
        board.display(chessBoard);
        board.calculateAllPointsOfBlackStones(chessBoard);
        board.calculateAllPointsOfWhiteStones(chessBoard);
    }

}





