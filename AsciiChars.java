package Project;

public class AsciiChars {
    public static void printNumbers() {
        int i;
        for (i = 48; i <= 57; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }

    public static void printLowerCaseLetters() {
        for (int i = 97; i <= 122; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }

    public static void printUpperCaseLetters() {
        for (int i = 65; i <= 90; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }

}