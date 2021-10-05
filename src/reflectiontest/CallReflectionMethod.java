package reflectiontest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FooClass {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}

public class CallReflectionMethod {

    private void callReflectedMethod() {
        try {
            Class<?> fooClass = Class.forName("reflectiontest.FooClass");
            Method sayHello = fooClass.getMethod("sayHello", String.class);

            sayHello.invoke(fooClass.getDeclaredConstructor().newInstance(), "LeeDo");
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CallReflectionMethod().callReflectedMethod();
    }
}
