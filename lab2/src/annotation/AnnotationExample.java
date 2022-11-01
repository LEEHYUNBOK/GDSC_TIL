package annotation;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException{
        Method m1 = AnnotationExample.class.getDeclaredMethod("printAgeDefault");
        CustomAnnotation customAnnotation1 = m1.getDeclaredAnnotation(CustomAnnotation.class);
        System.out.println(customAnnotation1.myAge());

        Method m2 = AnnotationExample.class.getDeclaredMethod("printAgeCustom");
        CustomAnnotation customAnnotation2 = m2.getDeclaredAnnotation(CustomAnnotation.class);
        System.out.println(customAnnotation2.myAge());
    }

    @CustomAnnotation
    public static void printAgeDefault(){

    }
    @CustomAnnotation(myAge = 28)
    public static void printAgeCustom(){

    }
}
