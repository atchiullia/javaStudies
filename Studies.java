import java.util.Scanner;

public class Studies {
  public static void main(String[] args) {

    System.out.println("What outfit are you wearing today?");
    Scanner entry = new Scanner(System.in);

    String outfit = entry.nextLine();

    System.out.println("I love your " + outfit + "! So stylish!");

    System.out.println("What color is your outfit?");
    String color = entry.nextLine();

    System.out.println("A " + color + " " + outfit + "? Bold and confident!");

    entry.close();
  }
}
