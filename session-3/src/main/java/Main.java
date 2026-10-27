public class Main {
    static void main() {
       int day = 6;

        if(day <= 5) {
            System.out.println("It's a weekday!");
        } else {
            System.out.println("It's the weekend!");
        }

         if((day == 2) || (day == 4)) {
            System.out.println("I go to the gym");

        }else if( day == 7){
            System.out.println("I do gardening");
        }

    }
}
