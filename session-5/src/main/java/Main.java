public class Main {
    static void main() {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] copiedNumbers = numbers;

        numbers[3] = 7; //array number being changed via index

        System.out.println("Copied numbers:");
        for (int number : copiedNumbers) {
            System.out.println(number);
        }
    }


}
