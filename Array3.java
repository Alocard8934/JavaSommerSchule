package JavaSommerSchuleStepik;

import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] mas = new int[a];
        int buf;
        for(int i = 0; i < a; i++){
            mas[i] = in.nextInt();
           
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a-1; j++){
                if(mas[j] > mas[j+1]){
                    buf = mas[j+1];
                    mas[j+1] = mas[j];
                    mas[j] = buf;                 
                }
            }
        }
        for(int i:mas)System.out.print(i + " ");
    }
}

/*
Дано натуральное число N, далее следуют N целых чисел. ﻿

Необходимо вывести на консоль отсортированную последовательность.

Sample Input:

5
2 1 3 4 5
Sample Output:

1 2 3 4 5
*/
/*
A natural number N is given, followed by N integers.﻿

You need to print the sorted sequence to the console.

Sample Input:

5
2 1 3 4 5
Sample Output:

1 2 3 4 5
*/