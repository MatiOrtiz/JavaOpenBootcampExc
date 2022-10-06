public class Exc3JavaCourse {

    public static void main(String[] args) {

        String[] texts= {"Hello", "World", "Im", "Mati"};

        System.out.println("The concatenation is: " + Concatenate(texts));
    }

    public static String Concatenate(String[] texts) {
        String text="";
        for (String s : texts) text += s;
        return text;
    }

}
