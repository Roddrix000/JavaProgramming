package BasicProgram;

public class Program_To_Reverse_Array {

    public static void main(String[] args) {
        //Program to reverse an array


        char[] charArray = {'H', 'e', 'l', 'l', 'o' };
        int left_Pos = 0;
        int right_Pos = charArray.length - 1;
        while (left_Pos < right_Pos) {
            char c = charArray[left_Pos];
            charArray[left_Pos] = charArray[right_Pos];
            charArray[right_Pos] = c;

            //Increment the Left Position and Decrement the Right Position
            left_Pos += 1;
            right_Pos -= 1;
        }

        System.out.println(charArray);
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }

    }
}
