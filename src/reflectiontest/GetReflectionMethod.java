package reflectiontest;

import java.lang.reflect.Method;

public class GetReflectionMethod {

    private void getClassMethods() {
        try {
            Class<?> vectorClass = Class.forName("java.util.Vector");

            Method[] methods = vectorClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("method = " + method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new GetReflectionMethod().getClassMethods();
    }

    /*
    method = java.lang.Object java.util.Vector.elementData(int)
    method = private java.lang.Object[] java.util.Vector.grow(int)
    method = private java.lang.Object[] java.util.Vector.grow()
    method = static java.lang.Object java.util.Vector.elementAt(java.lang.Object[],int)
    method = public synchronized java.lang.Object java.util.Vector.elementAt(int)
    method = private void java.util.Vector.shiftTailOverGap(java.lang.Object[],int,int)
    method = private static long[] java.util.Vector.nBits(int)
    method = private static void java.util.Vector.setBit(long[],int)
    method = private static boolean java.util.Vector.isClear(long[],int)
    */
}
