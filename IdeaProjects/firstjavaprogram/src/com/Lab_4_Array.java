package com;
import java.util.Scanner;
public class Lab_4_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The size of array: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k < n-1; k++){
                        arr[k] = arr[k+1];
                    }
                    n = n -1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
