public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("hh", 0, null, null, 10);
        System.out.println(book1.title);
        System.out.println(book1.getid());
        Book book2 = new Book("hh", 0, null, null, 10);
        System.out.println(book2.getid());
    }
}
