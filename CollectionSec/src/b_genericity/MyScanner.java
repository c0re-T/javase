package b_genericity;

public class MyScanner implements MyIterator<String> {

    @Override
    public String next() {
        return "you and me!!";
    }
}
