public abstract class ChessPiece {
	private final Move[] moves;
	private final String pieceName;
	private final char charValue;
	private final boolean repeatableMoves;
	private final PieceType pieceType;
	private final PieceColor pieceColor;

	protected ChessPiece(PieceType type, PieceColor color, Move[] moves, boolean repeatableMoves) {
		this.pieceType = type;
		this.pieceColor = color;
		this.moves = moves;
		this.repeatableMoves = repeatableMoves;
		pieceName = type.name();
		charValue = type.name().trim().charAt(0);
	}

	public enum PieceType {
		Pawn, Rook, Knight, Bishop, Queen, King
	}

	public enum PieceColor {
		White, Black
	}

	public Move[] getMoves() {
		return moves;
	}

	public String getName() {
		return pieceName;
	}

	public PieceColor getColor() {
		return pieceColor;
	}

	public char getCharValue() {
		return charValue;
	}

	public boolean hasRepeatableMoves() {
		return repeatableMoves;
	}

	public PieceType getPieceType() {
		return pieceType;
	}

	public static PieceColor opponent(PieceColor color) {
		return (color == PieceColor.Black) ? PieceColor.White : PieceColor.Black;
	}

}
