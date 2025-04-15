package BasicProgram;

public class Finding_the_Missing_number {
    public static int largest = 0; //2
    public static int sum;
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 6,7};
        /*
         Approach is
         Calculate A=(n+1)/2
         Calculate B=sum of all
         Missing = A-b
         */
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= largest) {
                largest = number[i];
                sum+=number[i];
            }
        }
        int A= largest*(largest+1)/2;
        System.out.println("The Missing number is "+ (A-sum));
        //
    }
}
