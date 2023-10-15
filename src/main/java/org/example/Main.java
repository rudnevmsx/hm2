package org.example;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstTask(5, "Hello there!");
        secondTask(new int[]{3,4,6,9,9});
        thirdTask(5, new int[5]);
        fourthTask(3, new int[]{1,2,4,5});
        fifthTask(new int[]{4,5,6,7,1,3});
    }

    public static void firstTask(int count, String string){
        for(int i = 0; i < count; i++){
            System.out.println(string);
        }
    }

    public static void secondTask(int [] arr){
        int sum = 0;
        for (int element : arr){
            if (element > 5){
                sum += element;
            }
        }
        System.out.println("Сумма элементов > 5: " + sum);
    }

    public static void thirdTask(int value, int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = value;
        }
        System.out.println("Готовый массив: " + Arrays.toString(arr));
    }

    public static void fourthTask(int value, int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] += value;
        }
        System.out.println("Готовый массив: " + Arrays.toString(arr));
    }

    public static void fifthTask(int [] arr){
        int halfLength = arr.length / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for(int i = 0; i < halfLength; i++){
            sumFirstHalf += arr[i];
        }
        for(int i = halfLength; i < arr.length; i++){
            sumSecondHalf += arr[i];
        }
        if(sumFirstHalf > sumSecondHalf){
            System.out.println("Длина первой половины больше");
        }
        else{
            System.out.println("Длина второй половины больше");
        }
    }

}