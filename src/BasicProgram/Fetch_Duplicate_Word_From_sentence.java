package BasicProgram;

public class Fetch_Duplicate_Word_From_sentence {

    public  static String sent="Big black bug bit a big black dog on his big block nose";
    public static void main(String[] args) {

        int count;
        //First We have to split
        sent= sent.toLowerCase();
        String[] indWord = sent.split(" ");
        System.out.println("Duplicate words in a given string : ");
        for(int i=0;i<indWord.length;i++)
        {
            count=1;
            for(int j=i+1;j<indWord.length;j++)
            {
                if(indWord[i].equals(indWord[j]))
                {
                    count++;
                    indWord[j]="0";
                }
            }

            //Displaying the Duplicate Words
            if(count>1 && indWord[i]!="0")
            {
                System.out.println(indWord[i]);
            }

        }
    }


}
