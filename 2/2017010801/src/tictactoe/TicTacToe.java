package tictactoe;

public class TicTacToe {
	private int[][] board=new int[3][3];
	TicTacToe() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				board[i][j] = 0;
		}		
	}
	int place(int player,int row,int column) {
		if(board[row][column]==0)
			board[row][column] = player;
		else 
			return 3;
		int a=0,b=0,c=0,d=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j] == player) {
					if(i == row) {
						a += board[row][j];
					}
					if(j == column) {
						b += board[i][column];
					}
					if(row==column&&i==j) {
						c += board[i][j];
					}
					if(row==(2-column) && i==(2-j)) {
						d += board[i][j];
					}
				}
			}
		}
		int x = 3*player;
		if (a==x || b==x || c==x || d==x)
			return player;
		else 
			return 0; 
	}
}
