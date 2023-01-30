package homeworks.homework9;

public class Task4 {
    public static void main(String[] args) {

        // How would you reverse a String word by word? for example
        //        input=>This is sentence i want to reverse
        //        output=>sihT si ecnetnes i tnaw ot esrever

        String str = "This is the sentence i want to reverse";
        StringBuilder rev = new StringBuilder();
        String words [] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder revWord = new StringBuilder();

            for (int j = word.length()-1; j >=0; j--) {
                revWord.append(word.charAt(j));
            }
            rev.append(revWord).append(" ");
            }

        System.out.println(rev);

        }
    }

