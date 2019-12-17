package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> myArrayList = new ArrayList<>();
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(2);
            myArrayList.add(r.nextInt(2));
            myLinkedList.add(r.nextInt(2));
        }
        }
public static void bubbleSort(int[]arr){
            for(int i=arr.length-1;i>0;i--){
                for(int l=0;l<i;l++){
                    if(arr[l]>arr[l+1]){
                        int temp=arr[l];
                        arr[l]=arr[l+1];
                        arr[l+1]=temp;
                        System.out.println(arr);
                    }
                }

            }
        }
    public static void bubbleSort(ArrayList<Integer>arr){
        for(int i=0;i<arr.size()-1;i++) {
            for (int l = 0; l < arr.size() - 1; l++)
                if (arr.get(l) > arr.get(l + 1)) {
                    int temp = arr.get(l);
                    arr.set(arr.get(l), arr.get(l + 1));
                    arr.set((l + 1), temp);
                }
        } System.out.println(arr);

        }
public static void bubbleSort(LinkedList<Integer>arr){
        for(int i=0;i<arr.size()-1;i++){
            for(int l=0;l<arr.size()-1;l++)
                if (arr.get(l)>arr.get(l+1)){
                    int temp=arr.get(l);
                    arr.set(arr.get(l), arr.get(l + 1));
                    arr.set((l + 1), temp);
                }
            System.out.println(arr);
        }
}
    }



