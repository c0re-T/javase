package c_reflect;

import java.lang.reflect.Constructor;

public class Demo07GetConstructor {
    public static void main(String[] args) {
        Class<Person> aClass = Person.class;
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }
    }
}
