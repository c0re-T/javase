package a_lambda;


/*
 * a.观察是否是函数式接口做方法参数传递
 * b.如课是，考虑使用Lambda表达式
 * C.调用方法，以匿名内部类的形式传递实参
 * d.从new接口开始到重写方法的方法名结束，选中，删除，别忘记再删除一个右半个大括号
 * e.在重写方法的参数后面，方法体的大括号前面加上->
 * */
public class Demo02Lambda {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void open() {
                System.out.println("usb打开了");
            }
        });

        System.out.println("========================");

        method(()-> System.out.println("usb打开了"));

    }

    public static void method(USB usb) {
        usb.open();
    }
}
