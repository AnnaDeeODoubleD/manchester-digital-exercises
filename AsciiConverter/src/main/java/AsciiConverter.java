import java.util.LinkedHashMap;
import java.util.Map;

public class AsciiConverter {
    static String [] bookTitles = new String[4] ;
    static LinkedHashMap<String, Integer> bookTitlesWithAsciiValues = new LinkedHashMap<>();

    static {
        bookTitles[0] = "To Kill a Mockingbird";
        bookTitles[1] = "The Catcher in the Rye";
        bookTitles[2] = "1984";
        bookTitles[3] = "Moby Dick";
    }

    private static void titleToAscii (String title) {
        String[] splitCharacters = title.split("");
        int titleAsTotalAsci = 0;

        for (String characterAsString : splitCharacters) {
            char character = characterAsString.charAt(0);

            titleAsTotalAsci += (int) character;
        }

        bookTitlesWithAsciiValues.put(title, titleAsTotalAsci);
    }

    public static void convertBookTitlesToAscii(String[] titles) {
        for (String title : titles) {
            titleToAscii(title);
        }
sortBookTitlesByComplexity();

    }

    public static void sortBookTitlesByComplexity(){
        bookTitlesWithAsciiValues.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry-> System.out.println(entry));
    }
}
