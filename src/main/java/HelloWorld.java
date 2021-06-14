import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void sayHello(){
        System.out.println("Hello!");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number!");
        } else {
            System.out.println(userInput + " is not a number!");
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));

    }
}
