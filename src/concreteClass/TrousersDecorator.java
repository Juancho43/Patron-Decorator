package concreteClass;

import core.IWearable;
import core.Person;
import core.clothesDecorator;

public class TrousersDecorator extends clothesDecorator {

    public TrousersDecorator(IWearable person) {
        super(person);
    }

    @Override
    public void wear() {
        person.wear();
        System.out.println("I put on a trouser");
        System.out.println("I wear a new beige trouser\n\n");
    }
}
