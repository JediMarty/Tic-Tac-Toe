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
		case 2:
			BOARD[0][2] = player;
			break;
		case 3:
			BOARD[0][4] = player;
			break;
		case 4:
			BOARD[2][0] = player;
			break;
		case 5:
			BOARD[2][2] = player;
			break;
		case 6:
			BOARD[2][4] = player;
			break;
		case 7:
			BOARD[4][0] = player;
			break;
		case 8:
			BOARD[4][2] = player;
			break;
		case 9:
			BOARD[4][4] = player;
			break;
		}
		
	}
}


