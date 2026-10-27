public class SayThatAgain {
    static void main() {
        String text = "hello";
        String result = "";
        int times = 3;
        for (int i = 0; i < 3; i++) {
            result += text; //would be useful to look at string builder class

        }
        System.out.println(result);
    }

}
