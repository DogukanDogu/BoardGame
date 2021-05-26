package com.dogukan;

import java.io.*;
import java.util.*;

public class BoardGameRunner {

    private static String FILE_NAME = "C:\\BoardGame\\src\\files\\board1.txt";

    public static void main(String[] args) {
        BoardCell[][] chessBoard = new BoardCell[8][8];
        Board board = new Board();
        board.readFile(chessBoard,FILE_NAME);
        board.display(chessBoard);
        board.calculateAllPointsOfBlackStones(chessBoard);
        board.calculateAllPointsOfWhiteStones(chessBoard);
    }

}





