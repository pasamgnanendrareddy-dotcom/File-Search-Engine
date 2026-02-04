package model;
public class SearchResult {
    private final String filePath;
    private final int lineNumber;
    private final String line;
    public SearchResult(String filePath, int lineNumber, String line) {
        this.filePath = filePath;
        this.lineNumber = lineNumber;
        this.line = line;
    }
    public String getFilePath() {
        return filePath;
    }
    public int getLineNumber() {
        return lineNumber;
    }
    public String getLine() {
        return line;
    }
    @Override
    public String toString() {
        return filePath + " [Line " + lineNumber + "]: " + line;
    }
}
