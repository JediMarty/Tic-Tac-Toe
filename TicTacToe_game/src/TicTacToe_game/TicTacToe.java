package TicTacToe_game;

public class TicTacToe {

	public static void main(String[] args) {
		char[] [] BOARD = {{' ','|',' ','|',' '},
				           {'-','+','-','+','-'},
		                   {' ','|',' ','|',' '},
		                   {'-','+','-','+','-'},
		                   {' ','|',' ','|',' '}};
		
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
	
}
