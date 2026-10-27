public class SumOfSequence {
    void main() {
    }

    int sequenceSum(int begin, int end, int step) {

        if (begin > end) {
            return 0;
        }
        int sum = 0;
        for (int i = begin; i <= end; i += step) {
            sum = sum + i;


        }
        return sum;
    }
}