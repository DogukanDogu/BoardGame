package com.dogukan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Board {

    public void display(BoardCell[][] chessBoard){
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (chessBoard[i][j] != null && chessBoard[i][j].getStoneName() != null && chessBoard[i][j].getStoneColor() != null)
                    System.out.print(chessBoard[i][j].getStoneName() + chessBoard[i][j].getStoneColor() + " ");
            }
            System.out.println();
        }
    }

    public void calculateAndDisplayThreatsOfHorseAndElephant(BoardCell[][] chessBoard){
        int whiteThreatCount = 0;
        int blackThreatCount = 0;
        HashMap<String,Integer> mapReturn = new HashMap<String,Integer>();

        for (int k = 0; k < chessBoard.length; k++) {
            for (int r = 0; r < chessBoard.length; r++) {
                if (k != 0 && r != 0){
                    if (chessBoard[k-1][r].getStoneColor().equals(chessBoard[k][r].getStoneColor())){
                        if (chessBoard[k][r].getStoneColor().equals("b") &&
                                chessBoard[k][r].getStoneCode().equals("a")){
                            whiteThreatCount++;
                        }

                        if (chessBoard[k][r].getStoneColor().equals("s") &&
                                chessBoard[k][r].getStoneCode().equals("f")){
                            blackThreatCount++;
                        }
                    }
                }
            }
        }

        mapReturn.put("BLACKSCOUNT",blackThreatCount);
        mapReturn.put("WHITESCOUNT",whiteThreatCount);

        System.out.println("           ");
        System.out.println("Siyah : " + mapReturn.get("BLACKSCOUNT") + "\n" +
                "Beyaz :" + mapReturn.get("WHITESCOUNT"));
    }

    public void calculateAllPointsOfWhiteStones(BoardCell[][] chessBoard){
        int totalSumWhites = 0;
        int numOfWhitePStones = 0;
        int numOfWhiteAStones = 0;
        int numOfWhiteFStones = 0;
        int numOfWhiteKStones = 0;
        int numOfWhiteVStones = 0;
        int numOfWhiteSStones = 0;
        int sumOfPWhites = 0;
        int sumOfAWhites = 0;
        int sumOfFWhites = 0;
        int sumOfKWhites = 0;
        int sumOfVWhites = 0;
        int sumOfSWhites = 0;

        for (int k = 0; k < chessBoard.length; k++){
            for (int r = 0; r < chessBoard.length; r++){
                if (chessBoard[k][r] != null && chessBoard[k][r].getStoneName() != null &&
                        chessBoard[k][r].getStoneColor() != null && chessBoard[k][r].getStoneCode() != null){
                    if (chessBoard[k][r].getStoneCode().equals("p") && chessBoard[k][r].getStoneColor().equals("b")){
                        numOfWhitePStones++;
                        sumOfPWhites += (chessBoard[k][r].getStonePoint() * numOfWhitePStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("a") && chessBoard[k][r].getStoneColor().equals("b")){
                        numOfWhiteAStones++;
                        sumOfAWhites += (chessBoard[k][r].getStonePoint() * numOfWhiteAStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("f") && chessBoard[k][r].getStoneColor().equals("b")){
                        numOfWhiteFStones++;
                        sumOfFWhites += (chessBoard[k][r].getStonePoint() * numOfWhiteFStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("k") && chessBoard[k][r].getStoneColor().equals("b")){
                        numOfWhiteKStones++;
                        sumOfKWhites += (chessBoard[k][r].getStonePoint() * numOfWhiteKStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("v") && chessBoard[k][r].getStoneColor().equals("b")){
                        numOfWhiteVStones++;
                        sumOfVWhites += (chessBoard[k][r].getStonePoint() * numOfWhiteVStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("s") && chessBoard[k][r].getStoneColor().equals("b")){
                        numOfWhiteSStones++;
                        sumOfSWhites += (chessBoard[k][r].getStonePoint() * numOfWhiteSStones);
                    }
                }
            }
        }

        totalSumWhites = sumOfPWhites + sumOfAWhites + sumOfFWhites + sumOfKWhites +
                sumOfVWhites + sumOfSWhites;

        System.out.println("           ");
        System.out.println("Beyaz Taş Toplamı : " + String.valueOf(totalSumWhites));

    }

    public void calculateAllPointsOfBlackStones(BoardCell[][] chessBoard){
        int totalSumBlacks = 0;
        int numOfBlackPStones = 0;
        int numOfBlackAStones = 0;
        int numOfBlackFStones = 0;
        int numOfBlackKStones = 0;
        int numOfBlackVStones = 0;
        int numOfBlackSStones = 0;
        int sumOfPBlacks = 0;
        int sumOfABlacks = 0;
        int sumOfFBlacks = 0;
        int sumOfKBlacks = 0;
        int sumOfVBlacks = 0;
        int sumOfSBlacks = 0;

        for (int k = 0; k < chessBoard.length; k++){
            for (int r = 0; r < chessBoard.length; r++){
                if (chessBoard[k][r] != null && chessBoard[k][r].getStoneName() != null &&
                        chessBoard[k][r].getStoneColor() != null && chessBoard[k][r].getStoneCode() != null){
                    if (chessBoard[k][r].getStoneCode().equals("p") && chessBoard[k][r].getStoneColor().equals("s")){
                        numOfBlackPStones++;
                        sumOfPBlacks += (chessBoard[k][r].getStonePoint() * numOfBlackPStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("a") && chessBoard[k][r].getStoneColor().equals("s")){
                        numOfBlackAStones++;
                        sumOfABlacks += (chessBoard[k][r].getStonePoint() * numOfBlackAStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("f") && chessBoard[k][r].getStoneColor().equals("s")){
                        numOfBlackFStones++;
                        sumOfFBlacks += (chessBoard[k][r].getStonePoint() * numOfBlackFStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("k") && chessBoard[k][r].getStoneColor().equals("s")){
                        numOfBlackKStones++;
                        sumOfKBlacks += (chessBoard[k][r].getStonePoint() * numOfBlackKStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("v") && chessBoard[k][r].getStoneColor().equals("s")){
                        numOfBlackVStones++;
                        sumOfVBlacks += (chessBoard[k][r].getStonePoint() * numOfBlackVStones);
                    }

                    if (chessBoard[k][r].getStoneCode().equals("s") && chessBoard[k][r].getStoneColor().equals("s")){
                        numOfBlackSStones++;
                        sumOfSBlacks += (chessBoard[k][r].getStonePoint() * numOfBlackSStones);
                    }
                }
            }
        }

        totalSumBlacks = sumOfPBlacks + sumOfABlacks + sumOfFBlacks + sumOfKBlacks +
                sumOfVBlacks + sumOfSBlacks;

        System.out.println("           ");
        System.out.println("Siyah Taş Toplamı : " + String.valueOf(totalSumBlacks));

    }

    public void readFile(BoardCell[][] chessBoard,String filename){
        File file =
                new File(filename);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int line_count = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] cell = line.split(" ");

            for (int index = 0; index < cell.length; index++) {
                char[] cellDefinition = cell[index].toCharArray();
                char name_ = cellDefinition[0];
                char color_ = cellDefinition[1];

                String n = Character.toString(name_);
                String c = Character.toString(color_);

                if (n.equals("x")){
                    BoardCell boardCell = new BoardCell(n, c,"x",0);
                    chessBoard[line_count][index] = boardCell;
                }

                if (n.equals("p")){
                    BoardCell boardCell = new BoardCell(n, c,"p",1);
                    chessBoard[line_count][index] = boardCell;
                }

                if (n.equals("a")){
                    BoardCell boardCell = new BoardCell(n, c,"a",3);
                    chessBoard[line_count][index] = boardCell;
                }


                if (n.equals("f")){
                    BoardCell boardCell = new BoardCell(n, c,"f",3);
                    chessBoard[line_count][index] = boardCell;
                }

                if (n.equals("k")){
                    BoardCell boardCell = new BoardCell(n, c,"k",5);
                    chessBoard[line_count][index] = boardCell;
                }

                if (n.equals("v")){
                    BoardCell boardCell = new BoardCell(n, c,"v",9);
                    chessBoard[line_count][index] = boardCell;
                }

                if (n.equals("s")){
                    BoardCell boardCell = new BoardCell(n, c,"s",100);
                    chessBoard[line_count][index] = boardCell;
                }

            }

            line_count++;
        }
    }
}
