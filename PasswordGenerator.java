import java.util.Random;
import java.util.Scanner;

public class passwordgenerator {


        public static void main(String[] args) {
            System.out.println("That is Generated Password:");
            System.out.println(generatePassword());
        }

        public static String generatePassword() {
            System.out.println("Enter your name:");
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            System.out.println("Enter your mobile number:");
            String mob=sc.nextLine();
            System.out.println("Enter your father's name in Capital letters");
            String father=sc.nextLine();
            final String CHARACTERS = name+father+mob+"@#$%^&*";
             final int PASSWORD_LENGTH = 12;
            Random random = new Random();
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < PASSWORD_LENGTH; i++) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                password.append(CHARACTERS.charAt(randomIndex));
            }

            return password.toString();
        }
    }

