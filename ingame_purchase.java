import java.util.Random;

public class Randomizer {
    private Random random;

    public Randomizer() {
        this.random = new Random();
    }

    public int getRandomInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than Min");
        }
        return random.nextInt(max - min) + min;
    }

    public double getRandomDouble(double min, double max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than Min");
        }
        return min + (max - min) * random.nextDouble();
    }

    public String getRandomString(int length, String charSet) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charSet.length());
            sb.append(charSet.charAt(index));
        }
        return sb.toString();
    }
}
