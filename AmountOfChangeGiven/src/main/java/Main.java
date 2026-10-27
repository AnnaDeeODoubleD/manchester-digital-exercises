public class Main {
    static void main() {
        int[] coins = {50,20,10,5,2,1};
        int givenMoney = 3;

        makeChange(coins, givenMoney);
    }

    private static void makeChange(int[] coins, int givenMoney) {
        for(int i = 0; i < coins.length; i++){
        while(coins[i] <= givenMoney){
        System.out.println(coins[i]);
            givenMoney = givenMoney - coins[i];
    }
        }
    }
}
