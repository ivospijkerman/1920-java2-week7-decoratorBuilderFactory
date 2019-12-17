public class PersonDecorator implements Person {

    private final Person person;
    private final String extraClothes;

    PersonDecorator(Person person, String extraClothes) {
        this.person = person;
        this.extraClothes = extraClothes;
    }

    @Override
    public String getPants() {
        return person.getPants();
    }

    @Override
    public void describeClothes() {
        person.describeClothes();
        System.out.println(" and a " + extraClothes);
    }
}
