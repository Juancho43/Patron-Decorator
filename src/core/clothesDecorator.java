package core;

public abstract class clothesDecorator implements IWearable{
    protected IWearable person;

    public clothesDecorator(IWearable person) {
        this.person = person;
    }

    @Override
    public void wear() {
        person.wear();
    }
}
