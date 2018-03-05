import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Book book = new Book(1, "Анна Каренина");
        GenericClass<Book> bookGenericClass = new GenericClass<>(book);
        book.setId(2);
        book.setName("Война и мир");
        System.out.println(bookGenericClass.getField().toString());
    }
}
