public class BoardDisplay {

	public static void printBoard(ChessBoard board) {
		Tile[][] b = board.getBoardArray();

		System.out.println();
		System.out.println("      [A][B][C][D][E][F][G][H] \n");
		for (int i = 0; i < 8; i++) {
			System.out.print("[" + (8 - i) + "]   ");

			for (int j = 0; j < 8; j++) {
				System.out.print(b[i][j].getValue());
			}

			System.out.println("   [" + (8 - i) + "]");
		}

		System.out.println("\n      [A][B][C][D][E][F][G][H]\n");
	}

}
