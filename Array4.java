package JavaSommerSchuleStepik;

import java.util.Scanner;
public class Array4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[sc.nextInt()];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        int[] lens = new int[input.length];

        int max = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                lens[i] = lens[i - 1] + 1;
            } else {
                lens[i] = 0;
            }
            max = Math.max(lens[i], max);
        }
        System.out.println(max + 1);

        for (int i = 0; i < input.length; i++) {
            if (lens[i] == max) {
                for (int j = i - lens[i]; j <= i; j++) {
                    System.out.print(input[j] + " ");
                }
                System.out.println();
            }
        }
    }
}


/*
Наибольший возрастающий срез массива
Срезом будем считать последовательность подряд идущих элементов массива, где каждый следующий элемент больше предыдущего.

Для последовательности 1 2 3 1 2 5 7 1 2 1 2, существуют возрастающие срезы: 1 2 3, 1 2 5 7, 1 2, 1 2 вывести нужно срез 1 2 5 7

Для последовательности 1 2 3 1 2 5 1 2 7, существуют срезы 1 2 3, 1 2 5, 1 2 7 вывести нужно все срезы, так как они равной длины

Формат входных данных:

Дано натуральное число N, далее следуют N целых чисел.

Формат выходных данных:

В первой строке выведите длину максимального среза

Далее выведите содержание среза/срезов, разделяя элементы одним пробелом, каждый срез с новой строки

Sample Input 1:

7
2 1 2 3 1 5 7
Sample Output 1:

3
1 2 3 
1 5 7 
Sample Input 2:

5
1 2 3 4 5 
Sample Output 2:

5
1 2 3 4 5 
Sample Input 3:

7
1 2 1 5 1 7 1 
Sample Output 3:

2
1 2 
1 5 
1 7 
*/

/*
Largest increasing array slice
We consider a slice to be a sequence of consecutive array elements, where each next element is greater than the previous one.

For the sequence 1 2 3 1 2 5 7 1 2 1 2, there are increasing slices: 1 2 3, 1 2 5 7, 1 2, 1 2 you need to output the slice 1 2 5 7

For the sequence 1 2 3 1 2 5 1 2 7, there are slices 1 2 3, 1 2 5, 1 2 7, you need to output all slices, since they are of equal length

Input format:

A natural number N is given, followed by N integers.

Output format:

On the first line print the length of the maximum cut

Next, print the contents of the slice/slices, separating the elements with one space, each slice on a new line

Sample Input 1:

7
2 1 2 3 1 5 7
Sample Output 1:

3
1 2 3
1 5 7
Sample Input 2:

5
1 2 3 4 5
Sample Output 2:

5
1 2 3 4 5
Sample Input 3:

7
1 2 1 5 1 7 1
Sample Output 3:

2
12
15
1 7
*/