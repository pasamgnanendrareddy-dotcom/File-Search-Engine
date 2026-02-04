package service;
import model.SearchResult;
import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.Callable;
public class SearchTask implements Callable<List<SearchResult>> {
    private final Path file;
    private final String keyword;
    public SearchTask(Path file, String keyword) {
        this.file = file;
        this.keyword = keyword.toLowerCase();
    }
    @Override
    public List<SearchResult> call() {
        List<SearchResult> results = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file.toFile()))) {
            String line;
            int lineNum = 0;
            while ((line = reader.readLine()) != null) {
                lineNum++;
                if (line.toLowerCase().contains(keyword)) {
                    results.add(new SearchResult(file.toString(), lineNum, line.trim()));
                }
            }
        } catch (Exception ignored) {
        }
        return results;
    }
}
