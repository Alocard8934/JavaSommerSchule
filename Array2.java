package JavaSommerSchuleStepik;

import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] mas = new int[a];
        int count = 0;
        for(int i = 0; i < a; i++){
            mas[i] = in.nextInt();
        }
        
        for(int i = 0; i < a-1; i++){
            if(mas[i] > mas[i+1]){
                count++;
            }
        } System.out.println(count);
    }
}


/*
﻿Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.

Порядок нарушен тогда, когда среди двух соседних элементов массива левый элемент больше правого.

Программа должна считать количество нарушенных порядков в массиве и выводить это количество на экран.

Sample Input 1:

5
2 4 1 9 7
Sample Output 1:

2
Sample Input 2:

7
1 2 3 4 5 6 7
Sample Output 2:

0
Sample Input 3:

7
7 6 5 4 3 2 1
Sample Output 3:

6
*/
/*
Given an integer N not exceeding 1000. Next follow N integers.

The order is violated when, among two adjacent elements of the array, the left element is larger than the right one.

The program should count the number of broken orders in the array and display this number on the screen.

Sample Input 1:

5
2 4 1 9 7
Sample Output 1:

2
Sample Input 2:

7
1 2 3 4 5 6 7
Sample Output 2:

0
Sample Input 3:

7
7 6 5 4 3 2 1
Sample Output 3:

6
*/