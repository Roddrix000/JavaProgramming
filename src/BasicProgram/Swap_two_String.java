package BasicProgram;

public class Swap_two_String {

    public static void main(String[] args) {

        String name = "Ronald Fredrick";
        String revName = " ";
        String[] nameArray = name.split(" ");
        for (int i = nameArray.length - 1; i >= 0; i--) {
            revName = revName.concat(nameArray[i]);
        }
        System.out.println("Before " + name);
        System.out.println("After " + revName);
    }
}
