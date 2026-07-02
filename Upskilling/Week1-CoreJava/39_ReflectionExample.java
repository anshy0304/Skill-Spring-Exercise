import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionTarget {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> targetClass = Class.forName("ReflectionTarget");
            Object targetObject = targetClass.getDeclaredConstructor().newInstance();

            System.out.println("Declared methods:");
            for (Method method : targetClass.getDeclaredMethods()) {
                System.out.println(method.getName() + " with " + method.getParameterCount() + " parameter(s)");
            }

            Method sayHello = targetClass.getDeclaredMethod("sayHello", String.class);
            sayHello.invoke(targetObject, "Codex");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
                 | IllegalAccessException | InvocationTargetException exception) {
            System.out.println("Reflection error: " + exception.getMessage());
        }
    }
}
