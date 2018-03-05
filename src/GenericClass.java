import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class GenericClass<T extends Cloneable> {

    private final T field;

    private static Method clone;

    GenericClass(T field) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        if (clone == null) {
            Class objClass = field.getClass();
            clone = objClass.getDeclaredMethod("clone");
        }
        this.field = (T) clone.invoke(field);
    }

    public T getField() throws InvocationTargetException, IllegalAccessException {
        return (T) clone.invoke(field);
    }
}