package JavaSommerSchuleStepik;

import java.util.*;
import java.math.*;
import java.io.*;
public class ArrayList3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (String i : in.nextLine().split(" "))
            if (Integer.parseInt(i) > 0) {
                list.add(Integer.parseInt(i));
            } 
        for (String i : in.nextLine().split(" "))
            if ((Integer.parseInt(i)%2) == 0){
                list.add(Integer.parseInt(i));
            }
        for (String i : in.nextLine().split(" "))
            if ((Integer.parseInt(i)%7) == 0){
                list.add(Integer.parseInt(i));
            }    
        Collections.sort(list);
        for(int i : list){
            System.out.print(i + " "); 
        }  
    }
}


/*
Даны три списка целых чисел строками через пробел.

Первая строка - первый список, вторая - второй, третья - третий.

Из первого списка нужно выбрать положительные элементы, из второго - четные, из третьего - кратные 7. Все выбранные элементы необходимо объединить в единый список и вывести его в порядке не убывания.

Sample Input 1:

1 2 3 4 -2 -2 -2 -2
2 5 4 3 9 7 8 1 7 12 16
7 21 15 16 19 18
Sample Output 1:

1 2 2 3 4 4 7 8 12 16 21 
Sample Input 2:

-1 -2 -3 -4 -5 -6 -7 1 1 1 1 1 1 1 1 1 1 1 1 2 3 4 5 6 7 8 1 2 3 4 1 2 3 5
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
7 7 7 7 7 2 1 2 1 2 1 21 21 21 21
Sample Output 2:

1 1 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 3 3 3 4 4 5 5 6 7 7 7 7 7 7 8 21 21 21 21 
Sample Input 3:

1 -2 -3 -2 -3 -2 -3 -2 -3 -2 -3 -2 -3 -2 -3 -2 -3
2 4 6 8 10 12 16 18 20 22 242 4 6 8 10 12 16 18 20 22 242 4 6 8 10 12 16 18 20 22 242 4 6 8 10 12 16 18 20 22
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Sample Output 3:

1 2 4 4 4 4 6 6 6 6 7 8 8 8 8 10 10 10 10 12 12 12 12 14 16 16 16 16 18 18 18 18 20 20 20 20 22 22 22 22 242 242 242 
*/

/*
Three lists
Given three lists of integers in lines separated by spaces.

The first line is the first list, the second is the second, the third is the third.

From the first list you need to select positive elements, from the second - even, from the third - multiples of 7. All selected elements must be combined into a single list and displayed in non-descending order.
*/