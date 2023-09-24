package JavaSommerSchuleStepik;

import java.util.*;
import java.math.*;
import java.io.*;
public class ArrayList5 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();     // enter the first line
        for (String i : in.nextLine().split(" ")){
            arrayList.add(Integer.parseInt(i));
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();    //enter the second line
        for (String i : in.nextLine().split(" ")){
            arrayList2.add(Integer.parseInt(i));
        }      
        ArrayList<Integer> arrayList3 = new ArrayList<>();    // display unique elements
        for(int i = 0; i < arrayList.size(); i++){
            for(int j = 0; j < arrayList2.size(); j++){
                if(arrayList.get(i).equals(arrayList2.get(j))) {
                     arrayList3.add(arrayList.get(i));
                }
        }}
        ArrayList<Integer> arrayList4 = new ArrayList<>();    // removing duplicate elements in an array
        for(int i = 0; i < arrayList3.size(); i++){
            if(!arrayList4.contains(arrayList3.get(i))){
                arrayList4.add(arrayList3.get(i));
            }
        }
        
        Collections.sort(arrayList4);
        for(int i : arrayList4){
            System.out.print(i + " "); 
        }
  
    }
}


/*
Одинаковые элементы из двух списков
Дано два списка строками с целыми числами через пробел. Необходимо вывести уникальные элементы(1 раз - 1 элемент), которые присутствуют и в первом и во втором списке. Элементы необходимо вывести в порядке возрастания. Гарантируется что хотя бы 1 одинаковый элемент в списках есть.

Sample Input 1:

1 2 3 4 5 6 7 8 9 10
7 8 1 1 1 11 1 1 1 11 1 1 11 1 1 1
Sample Output 1:

1 7 8 
Sample Input 2:

1 2 3 4 5 6 7 8 9 10 11 12
2 3 100 500
Sample Output 2:

2 3
Sample Input 3:

1 51 61 51 51 3153 48111 2 121 51 8 1 51 5 1 1 5
51 515 1181 1 1 512 215 15 151 8 98 54 545 48 8 78 945191 91 
Sample Output 3:

1 8 51
*/

/*
Identical elements from two lists
Given two lists of lines with integers separated by spaces. It is necessary to display unique elements (1 time - 1 element) that are present in both the first and second lists. The elements must be displayed in ascending order. It is guaranteed that there is at least 1 identical element in the lists.

Sample Input 1:

1 2 3 4 5 6 7 8 9 10
7 8 1 1 1 11 1 1 1 11 1 1 11 1 1 1
Sample Output 1:

1 7 8
Sample Input 2:

1 2 3 4 5 6 7 8 9 10 11 12
2 3 100 500
Sample Output 2:

2 3
Sample Input 3:

1 51 61 51 51 3153 48111 2 121 51 8 1 51 5 1 1 5
51 515 1181 1 1 512 215 15 151 8 98 54 545 48 8 78 945191 91
Sample Output 3:

1 8 51
*/