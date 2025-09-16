package lexical;

public class LexicalException extends RuntimeException {
    private final int line;
    private final int column;

    public LexicalException(String message, int line, int column) {
        super(message);
        this.line = line;
        this.column = column;
    }

    public int getLine() { return line; }
    public int getColumn() { return column; }

    @Override
    public String toString() {
        return String.format("Erro léxico na linha %d, coluna %d: %s", line, column, getMessage());
    }
}