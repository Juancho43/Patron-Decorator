package concreteClass;

import core.IWearable;
import core.clothesDecorator;

public class CoatDecorator extends clothesDecorator {

    public CoatDecorator(IWearable person) {
        super(person);
    }

    @Override
    public void wear() {
        person.wear();
        System.out.println("I put on a coat");
        System.out.println("I wear a coat\n\n");
    }
}
