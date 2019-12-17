class Main {
    public static void main(String[] args) {
        Person person = new BuiltPerson.Builder("red")
//                .setPants("white")
                .addShirt(Shirt.BLUE)
                .addShirt(Shirt.BLUE)
                .addShirt(Shirt.WHITE)
//                .setPants("red")
                .build();

        person = new PersonDecorator(person, "a yellow hat");
        person = new PersonDecorator(person, "a white tie");
        person.describeClothes();

    }
}
