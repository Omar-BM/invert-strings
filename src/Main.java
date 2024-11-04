import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        String word;
        System.out.println("Type a String to invert: ");
        word = lecture.nextLine();

        char[] letters = word.toCharArray();
        char[] invert = new char[letters.length];

        for (int i = 0; i < letters.length; i++) {
            int j = letters.length - i - 1;
            invert[j] = letters[i];
        }
        System.out.println("Original String");
        System.out.println(letters);
        System.out.println("Invert String");
        System.out.println(invert);

        //comentario para saber que si funciona gitt

    }
}