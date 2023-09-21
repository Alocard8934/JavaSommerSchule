/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSommerSchuleStepik;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int [] mas = new int[a];
        boolean flag = false;
        for(int i = 0; i < a; i++){
            mas[i]=in.nextInt();
            if(mas[i] % 2 == 0 && mas[i] < 100 && mas[i] > 9){
            System.out.print(mas[i] + " ");
                flag = true;
        }
        }
            if(flag == false){
            System.out.print(-1);
            }
    }
}


/*
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.

Среди всех чисел массива, необходимо вывести на экран двузначные, четные и положительные через пробел.

А если таких чисел в массиве нет, необходимо вывести -1.

Sample Input 1:

5
100 96 -2 96 1
Sample Output 1:

96 96
Sample Input 2:

7
1 2 3 4 5 6 7
Sample Output 2:

-1
Sample Input 3:

8
98 -98 98 -98 56 56 56 56
Sample Output 3:

98 98 56 56 56 56
*/

/*
Given an integer N not exceeding 1000. Next follow N integers.

Among all the numbers in the array, it is necessary to display two-digit, even and positive numbers separated by a space.

And if there are no such numbers in the array, you need to output -1.

Sample Input 1:

5
100 96 -2 96 1
Sample Output 1:

96 96
Sample Input 2:

7
1 2 3 4 5 6 7
Sample Output 2:

-1
Sample Input 3:

8
98 -98 98 -98 56 56 56 56
Sample Output 3:

98 98 56 56 56 56
*/