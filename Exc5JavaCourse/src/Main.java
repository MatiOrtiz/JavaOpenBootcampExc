public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        String save= cocheCrud.save();
        String findAll= cocheCrud.findAll();
        String delete= cocheCrud.delete();

        System.out.println(save + " / " + findAll + " / " + " / " + delete);
    }
}