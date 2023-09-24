package JavaSommerSchuleStepik;

import java.util.*;
import java.math.*;
import java.io.*;
public class ArrayList4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a = in.nextInt();
         for (int i = 1; i <= a; i++) {
             list.add(in.nextInt());             
         }
        int b = in.nextInt();
        for (int i = 1; i <= b; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i : list){
            System.out.print(i + " "); 
        }
    }
}


/*
Слияние списков
﻿Даны два списка. Необходимо слить два списка в один, отсортировать по убыванию и вывести.

Вводится целое число N и N чисел со следующей строки, потом целое число M и М чисел со следующей строки.

Sample Input 1:

5
1 2 3 4 5
7
5 4 3 1 2 6 7
Sample Output 1:

7 6 5 5 4 4 3 3 2 2 1 1 
Sample Input 2:

7
0 3 1 5 7 4 6
11
1 1 1 1 1 1 1 1 1 1 1 
Sample Output 2:

7 6 5 4 3 1 1 1 1 1 1 1 1 1 1 1 1 0 
Sample Input 3:

2
1 2
5
5 4 3 2 1
Sample Output 3:

5 4 3 2 2 1 1
*/

/*
Merging Lists
﻿Two lists are given. It is necessary to merge two lists into one, sort in descending order and display.

Enter an integer N and N numbers from the next line, then an integer M and M numbers from the next line.

Sample Input 1:

5
1 2 3 4 5
7
5 4 3 1 2 6 7
Sample Output 1:

7 6 5 5 4 4 3 3 2 2 1 1
Sample Input 2:

7
0 3 1 5 7 4 6
eleven
1 1 1 1 1 1 1 1 1 1 1
Sample Output 2:

7 6 5 4 3 1 1 1 1 1 1 1 1 1 1 1 1 0
Sample Input 3:

2
12
5
5 4 3 2 1
Sample Output 3:

5 4 3 2 2 1 1
*/