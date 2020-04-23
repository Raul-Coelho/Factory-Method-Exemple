package gr.uom.java.factoryMethod;

/**
 * @author raul on 27/01/20
 */
public class Creator extends Factory{

    @Override
    public Dog getDog() {
        return new Poodle();
    }
}
