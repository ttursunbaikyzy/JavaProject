package homework.homework9;

public class Task4InClassStringBuilderMethod {
    public static void main(String[] args) {

        // How would you reverse a String word by word? for example
        //        input=>This is sentence i want to reverse
        //        output=>sihT si ecnetnes i tnaw ot esrever

        /*StringBuilder st = new StringBuilder ("This is the sentence i want to reverse");
        System.out.println(st.reverse());
        String str=st.toString(); // converting a StringBuilder to String so that we can call methods from String
        str.split()*/

        String str="This is the sentence i want to reverse";
        String [] arr = str.split(" ");

        // method 1:
        /*for (String word:arr){
            StringBuilder st = new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }*/

        // method 2
        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }



        }
    }

