
public abstract class FactoryPerson implements Person {


    public static FactoryPerson create(String color) {
        if (color.equals("w")) {
            return new WhitePantsPerson();
        } else if (color.equals("b")) {
            return new BlackPantsPerson();
        } else {
            return null;
        }
    }

    private static class WhitePantsPerson extends FactoryPerson {
        @Override
        public void describeClothes() {
            System.out.println("I am wearing white pants");
        }

        @Override
        public String getPants() {
            return "white";
        }
    }

    private static  class BlackPantsPerson extends FactoryPerson {
        @Override
        public void describeClothes() {
            System.out.println("I am wearing black pants");
        }

        @Override
        public String getPants() {
            return "black";
        }
    }

}
