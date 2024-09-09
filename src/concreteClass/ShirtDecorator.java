package concreteClass;

import core.IWearable;
import core.Person;
import core.clothesDecorator;

public class ShirtDecorator extends clothesDecorator {

    public ShirtDecorator(IWearable person) {
        super(person);
    }

    @Override
    public void wear() {
        person.wear();
        System.out.println("I put on a shirt");
        System.out.println("I wear a hawaiian shirt\n\n");
    }
}
