public class DivisibleBy {
    static void main() {
        int result = 0; //must be declared before or after the loop
        for (int i = 0; i <= 500 ; i++) {
            if(( i % 3 == 0) || (i % 5 == 0)){
            result += i;

            }
        }
        System.out.println("Total sum: " + result); //need to print out total outside of the {}

    }
}
