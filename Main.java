import model.SearchResult;
import service.SearchService;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dir = sc.nextLine();
        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine();
        SearchService service = new SearchService();
        List<SearchResult> results = service.search(dir, keyword);
        System.out.println("\nResults Found: " + results.size());
        results.forEach(System.out::println);
    }
}
