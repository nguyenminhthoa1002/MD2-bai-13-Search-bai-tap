package baiTap1;

import java.util.Scanner;

public class sortString {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] arrayString = inputString.split("");
        String stringAfterSort = "";
        for (int i = 0; i < arrayString.length; i++) {
            if (stringAfterSort.length()==0) {
                stringAfterSort +=inputString.charAt(i);
            } else {
                if (stringAfterSort.charAt(stringAfterSort.length() - 1) < inputString.charAt(i)) {
                    stringAfterSort += inputString.charAt(i);
                }
            }
        }
        System.out.println("Sorted String: "+stringAfterSort);
    }
}
