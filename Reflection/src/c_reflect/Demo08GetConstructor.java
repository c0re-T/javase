package c_reflect;

import java.lang.reflect.Constructor;

public class Demo08GetConstructor {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass = Person.class;
        Constructor<Person> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true); //解除私有权限-> 暴力反射

        Person person = declaredConstructor.newInstance("三上");
        System.out.println(person);
    }
}
