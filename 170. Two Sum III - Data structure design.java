package leetcode;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumIII {
    private HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();

    public void add(int number) {
        if (elements.containsKey(number)) {
            elements.put(number, elements.get(number) + 1);
        } else {
            elements.put(number, 1);
        }
    }

    public boolean find(int value) {
        for (Integer i : elements.keySet()) {
            int target = value - i;
            if (elements.containsKey(target)) {
                if (i == target && elements.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSumIII twoSum = new TwoSumIII();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a number");
            System.out.println("2. Find if a pair exists for a given sum");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number to add:");
                    int number = scanner.nextInt();
                    twoSum.add(number);
                    System.out.println("Number added.");
                    break;
                case 2:
                    System.out.println("Enter the value to find:");
                    int value = scanner.nextInt();
                    boolean result = twoSum.find(value);
                    if (result) {
                        System.out.println("Pair found.");
                    } else {
                        System.out.println("No pair found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
