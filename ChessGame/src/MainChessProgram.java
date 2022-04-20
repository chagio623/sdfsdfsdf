import java.util.Scanner;

public class MainChessProgram {

	public static void main(String args[]) throws Exception {
		Input handler = new Input();
		Scanner scanner = new Scanner(System.in);

		ChessGame game = new ChessGame();
		BoardDisplay.printBoard(game.getBoard());
		while (true) {
			System.out.println("Enter move (eg. A2-A3): ");
			String input = scanner.nextLine();

			if (!handler.isValid(input)) {
				System.out.println("Invalid input!");
				System.out.println("Valid input is in form: A2-A3");
			} else {
				Tuple from = handler.getFrom(input);
				Tuple to = handler.getTo(input);

				boolean movePlayed = game.playMove(from, to);
				if (!movePlayed)
					System.out.println("Illegal move!");
				else {
					BoardDisplay.printBoard(game.getBoard());
				}
			}
		}
	}
}
