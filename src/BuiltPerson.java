import java.util.ArrayList;
import java.util.List;

public class BuiltPerson implements Person {

    private String pants;

    private List<Shirt> shirts;

    @Override
    public String getPants() {
        return pants;
    }

    @Override
    public void describeClothes() {
        System.out.println("I am wearing " + pants + " pants");
        for (Shirt shirt : shirts) {
            System.out.println(" and a " + shirt.name() + " shirt");
        }
    }

    static class Builder {

        private final String pants;

        private final ArrayList<Shirt> shirts = new ArrayList<>();

        Builder(String pants) {
            this.pants = pants;
        }

        Builder addShirt(Shirt shirt) {
            this.shirts.add(shirt);
            return this;
        }

        BuiltPerson build() {
            if (pants == null) {
                throw new IllegalArgumentException("Trek een broek aan gek!");
            }

            BuiltPerson result = new BuiltPerson();
            result.pants = pants;
            result.shirts = shirts;
            return result;
        }
    }
}
