package TicTacToe_game;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String start;
		String player;
		char[] [] BOARD = {{' ','|',' ','|',' '},
				   {'-','+','-','+','-'},
		                   {' ','|',' ','|',' '},
		                   {'-','+','-','+','-'},
		                   {' ','|',' ','|',' '}};
		
		System.out.println("Welcome to Tic-Tac-Toe");
		System.out.println("Let's play!");
		do {
			System.out.println("Press Y");
			start = scanner.nextLine().toUpperCase();
			
		}while(!start.equals("Y"));
			
		theBOARD(BOARD);
		
		do {
		System.out.println("What you choose ? X/O");
		
		player = scanner.nextLine().toUpperCase();
			
		}while(!(player.equals("X") || player.equals("O"))); //Law of De Morgan!
		}
	
	public static void theBOARD(char[][] BOARD) {
		for (char[] row : BOARD) {
			for (char coll : row) {
				System.out.print(coll);
			}
				System.out.println();
				}
		}
	
}

