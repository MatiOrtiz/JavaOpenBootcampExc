import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String str = "";

        if (args.length == 1) {
            str = args[0];
        }
        if (str.equals("")) {
            Scanner sb = new Scanner(System.in);
            System.out.print("Input a string and push enter: ");
            str = sb.nextLine();
        }
        if (!str.isEmpty()) {
            System.out.print("The inverted string of \"" + str + "\" is: " + reverse(str));
        } else {
            System.out.println("You don't input a string.");
        }
    }

    public static String reverse(String str) {
        String invertedStr= "";
        for(int i=str.length(); i>=0; i--)
            invertedStr = invertedStr + str.charAt(i);
        return invertedStr;
    }

}