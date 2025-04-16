package BasicProgram;

public class Generate_Out_Put {

    public static void main(String[] args) {
        // generate the OutPut : aabbbcccc
        //Input a2b3c4

        String inputData = "a2b3c4";
        for (int i = 0; i < inputData.length(); i++) {
            if (Character.isAlphabetic(inputData.charAt(i))) {
                System.out.print(inputData.charAt(i));
            } else {
                int a = Character.getNumericValue(inputData.charAt(i));
                for (int j = 1; j < a; j++) {
                    System.out.print(inputData.charAt(i - 1));
                }
            }
        }

    }
}
