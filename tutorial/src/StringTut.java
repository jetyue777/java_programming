/**
 * Created by jetyue on 2017-05-14.
 */
public class StringTut {
    public static void main(String[] args) {

        //Inefficient
        String info = "";
        info += "my name is Jet.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("my name is jet.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuffer sbuffer = new StringBuffer("");
        sbuffer.append("sfsdfsdf ").append("sslkjlkjlkjlkj  ");
        System.out.println(sbuffer.toString());


    }
}
