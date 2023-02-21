import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean! " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);
        System.out.println("You can store a random result: " + num);
        System.out.println("and use it over and over again: " + num + ", " + num);
        System.out.println("Or keep generating a bunch of random numbers");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");

    }
}
