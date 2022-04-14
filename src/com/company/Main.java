package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        float sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("—умма трат за мес€ц составила: " + sum + " рублей");
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("ћаксимальна€ сумма трат за день составила " + max +" рублей" );
        System.out.println("ћинимальна€ сумма трат за день составила " + min + " рублей");
        float average = 0;
        for (float i = 0; i < arr.length; i++) {
            average = sum / 30;
        }
            System.out.println("—редн€€ сумма трат за мес€ц составила " + average + " рублей");
        }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
