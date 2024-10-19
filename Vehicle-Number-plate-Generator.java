import java.util.Random;

public class VehicleNumberPlateGenerator {

    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        // Generate and print 10 random vehicle number plates
        for (int i = 0; i < 10; i++) {
            System.out.println(generateNumberPlate());
        }
    }

    public static String generateNumberPlate() {
        StringBuilder numberPlate = new StringBuilder();

        // Format: XX 00 XX 0000

        // Add first two letters
        for (int i = 0; i < 2; i++) {
            numberPlate.append(LETTERS.charAt(RANDOM.nextInt(LETTERS.length())));
        }
        numberPlate.append(" ");

        // Add two digits
        numberPlate.append(String.format("%02d", RANDOM.nextInt(100))).append(" ");

        // Add next two letters
        for (int i = 0; i < 2; i++) {
            numberPlate.append(LETTERS.charAt(RANDOM.nextInt(LETTERS.length())));
        }
        numberPlate.append(" ");

        // Add four digits
        numberPlate.append(String.format("%04d", RANDOM.nextInt(10000)));

        return numberPlate.toString();
    }
}
