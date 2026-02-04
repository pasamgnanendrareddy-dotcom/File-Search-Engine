package service;
import model.SearchResult;
import util.FileScannerUtil;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.*;
public class SearchService {
    private final ExecutorService executor =
            Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    public List<SearchResult> search(String directory, String keyword) throws Exception {
        List<Path> files = FileScannerUtil.scanFiles(directory);
        List<Future<List<SearchResult>>> futures = new ArrayList<>();
        for (Path file : files) {
            futures.add(executor.submit(new SearchTask(file, keyword)));
        }
        List<SearchResult> allResults = new ArrayList<>();
        for (Future<List<SearchResult>> future : futures) {
            allResults.addAll(future.get());
        }
        executor.shutdown();
        return allResults;
    }
}
