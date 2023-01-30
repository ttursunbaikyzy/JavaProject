package homeworks.homework9;

public class Task4Practice {
    public static void main(String[] args) {

        // How would you reverse a String word by word? for example
        //        input=>This is sentence i want to reverse
        //        output=>sihT si ecnetnes i tnaw ot esrever

        String str = "This is the sentence i want to reverse";
        String[] str1=str.split(" ");

        String reverse="";
        for (String x:str1) {
            StringBuilder sb=new StringBuilder(x);
            sb.reverse();
            reverse=reverse+sb.toString()+" ";
        }
        System.out.println(reverse);
    }

        }


