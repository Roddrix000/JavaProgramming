package BasicProgram;

import java.util.concurrent.ThreadLocalRandom;

public class Generate_random_withIn_given_range {

    public static void main(String[] args) {

        System.out.println(generate_Random(5, 25));

    }
    public static int generate_Random(int MinValue, int Maxvalue) {

        return ThreadLocalRandom.current().nextInt(MinValue, Maxvalue);
    }
}
