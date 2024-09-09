import concreteClass.CoatDecorator;
import concreteClass.ShirtDecorator;
import concreteClass.TrousersDecorator;
import core.Person;

public class Main {
    static Person person = new Person();
    static TrousersDecorator trousersDecorator = new TrousersDecorator(person);
    static ShirtDecorator shirtDecorator = new ShirtDecorator(trousersDecorator);
    static CoatDecorator coatDecorator = new CoatDecorator(shirtDecorator);
    public static void main(String[] args) {
       // person.wear();
        //DecotaredPerson.wear();
        //NotNakedPerson.wear();
        coatDecorator.wear();
    }
}