public class RandomizerTest {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();

        // Test random integer generation
        System.out.println("Random Integers:");
        for (int i = 0; i < 5; i++) {
            System.out.println(randomizer.getRandomInt(1, 10));
        }

        // Test random double generation
        System.out.println("\nRandom Doubles:");
        for (int i = 0; i < 5; i++) {
            System.out.println(randomizer.getRandomDouble(1.0, 10.0));
        }

        // Test random string generation
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        System.out.println("\nRandom Strings:");
        for (int i = 0; i < 5; i++) {
            System.out.println(randomizer.getRandomString(8, charSet));
        }
    }

}
