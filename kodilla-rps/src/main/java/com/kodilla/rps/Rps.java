package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;


public class Rps {

        private int computerMove;
        private int playerMove;
        private String playerAttribute;
        private String computerAttribute;

        public void chooseMove() {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nChoose your move:");
            playerMove = scan.nextInt();
            if (playerMove == 1) {
                playerAttribute = "Rock";
            } else if (playerMove == 2) {
                playerAttribute = "Paper";
            } else if(playerMove == 3){
                playerAttribute = "Scissors";
            }else{
                playerAttribute = "You have to choose a number from 1 to 3";
            }
        }

        public String getPlayerAttribute() {
            return playerAttribute;
        }

        public void computerMove() {
            Random random = new Random();
            computerMove = 0;
            while (computerMove <= 0) {
                computerMove = random.nextInt(4);
            }
            if (computerMove == 1) {
                computerAttribute = "Rock";
            } else if (computerMove == 2) {
                computerAttribute = "Paper";
            } else {
                computerAttribute = "Scissors";
            }
        }

        public String getComputerAttribute() {
            return computerAttribute;
        }

        public String compareTheMovements() {
            String gameResult = "";
            if (playerMove == computerMove) {
                gameResult = "Draw";
            } else if (playerMove == 1 && computerMove == 2 || playerMove == 2 && computerMove == 3 ||
                    playerMove == 3 && computerMove == 1) {
                gameResult = "Defeat";
            } else if (playerMove == 2 && computerMove == 1 || playerMove == 3 && computerMove == 2 ||
                    playerMove == 1 && computerMove == 3) {
                gameResult = "You win";
            }
            return gameResult;
        }
    }

