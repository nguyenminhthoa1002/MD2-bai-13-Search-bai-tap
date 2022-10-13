package baiTap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splitArray = inputString.split("ab");
        int maxLenght = splitArray[0].length();
        int indexMax = 0;
        for (int i = 0; i < splitArray.length; i++) {
            if (maxLenght < splitArray[i].length()) {
                maxLenght = splitArray[i].length();
                indexMax = i;
            }
        }
        System.out.println("Max length Array: " + "ab"+splitArray[indexMax]);
    }
}
