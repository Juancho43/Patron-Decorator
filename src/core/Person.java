package core;

public class Person implements IWearable {
    @Override
    public void wear() {
        System.out.println("I am naked\n");
    }
}
