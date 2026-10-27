package asciisort;

public class Main {
    static void main() {
        AsciiSort runner = new AsciiSort();
        System.out.println(runner.sortByAscii(new String[]{
                "The Catcher in the Rye", "To Kill a Mockingbird", "1984", "Moby Dick"
        }));
    }
}
