public class AsciiConverterSimple {
   public static int getAsciiScore(String bookTitle) {
       int totalScore = 0;

       for (int i = 0; i < bookTitle.length(); i++) {
           totalScore += (int) bookTitle.charAt(i);
       }
       return totalScore;

   }
    public void printTitleScore(String bookTitle) {
        int score = getAsciiScore(bookTitle);
        System.out.println(bookTitle + " -> Score: " + score);
    }
    }

