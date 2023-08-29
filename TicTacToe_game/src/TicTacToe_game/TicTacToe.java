package TicTacToe_game;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String start;
		char player;
		int set;
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
		
		player = scanner.next().charAt(0);
			
		}while(!(player=='X' || player=='O'));
		System.out.println("Position ? 1-9");
		set = scanner.nextInt();
		place(BOARD,player,set);	
		theBOARD(BOARD);
	}
	
	public static void theBOARD(char[][] BOARD) {
		for (char[] row : BOARD) {
			for (char coll : row) {
				System.out.print(coll);
			}
				System.out.println();
				}
		}
	
	public static void place(char[] [] BOARD, char player, int set) {
		
		switch(set) {
		case 1:
			BOARD[0][0] = player;
			break;
			
		}
		
	}
}


