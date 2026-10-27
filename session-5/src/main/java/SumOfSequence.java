
public class SumOfSequence {


    static void main() {
        int begin = 1;
                int end = 4;
                int step = 1;

    }


    static int sequence(int begin, int end, int step) {

        if (begin > end) {
            return 0;
        }

        int sequenceSum = 0;


        for (int i = begin; i <= end; i += step) {
            sequenceSum += i;
        }

        return sequenceSum;
    }
}