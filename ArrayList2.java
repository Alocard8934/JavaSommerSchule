package JavaSommerSchuleStepik;

import java.util.*;
import java.math.*;
import java.io.*;
public class ArrayList2 {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
          while (in.hasNext()) {
              String [] arr = in.nextLine().split(" ");
              if (arr[0].equals("create")) {              // Erstellen und Füllen eines Arrays
                  int b = Integer.parseInt(arr[1]);
                      for (int i = 1; i <= b; i++) {
                            list.add(i);
                      } 
              } else if(arr[0].equals("add")){
                  if(arr.length == 2){
                      int a = Integer.parseInt(arr[1]);    // add
                      list.add(a);                      
                  } else if (arr.length > 2){
                      int b = Integer.parseInt(arr[1]);    // add
                      int c = Integer.parseInt(arr[2]);  
                      list.add(b, c);   
                  }
              } else if(arr[0].equals("remove")){
                      int d = Integer.parseInt(arr[1]);
                      list.remove(d);
              } else if(arr[0].equals("set")){
                      int e = Integer.parseInt(arr[1]);
                      int f = Integer.parseInt(arr[2]);   
                      list.set(e, f);
              } else if(arr[0].equals("printList")){
                      for(int i : list){
                          System.out.print(i + " "); 
                      }
              }             
         } 
    }
}


/*
Обработка списка
Существует ряд методов для класса ArrayList: add(n) - вставка в конец, add(i, n) - вставка по индексу, remove(i) - удаление по индексу, set(i, n) - изменение значения по индексу.

На вход программе подаются строки, первая из которых create N - создает исходный список с числами от 1 до N включительно. Сигнатуры остальных команд:

add 5 - вставляет 5 в конец списка

add 5 6 - вставляет 6 по индексу 5

remove 7 - удаляет 7 элемент списка

set 7 3 - заменяет значение седьмого элемента списка на 3

Команда printList - сигнализирует о конце ввода данных и должна вывести на экран список, полученный после всех манипуляций

Sample Input 1:

create 30
add 12
add 17
add 3 15
remove 4
set 12 34
printList
Sample Output 1:

1 2 3 15 5 6 7 8 9 10 11 12 34 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 12 17 
Sample Input 2:

create 60
add 12
add 13
add 14
add 15
add 1 16
add 2 17
add 3 18
add 4 19
add 5 20
remove 60
remove 50
remove 40
set 17 30
set 18 19
printList
Sample Output 2:

1 16 17 18 19 20 2 3 4 5 6 7 8 9 10 11 12 30 19 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 37 38 39 40 41 42 43 44 45 47 48 49 50 51 52 53 54 55 57 58 59 60 12 13 14 15 
Sample Input 3:

create 10
add 11
add 13
add 17
add 19
printList
Sample Output 3:

1 2 3 4 5 6 7 8 9 10 11 13 17 19 
*/

/*
List Processing
There are a number of methods for the ArrayList class: add(n) - insert at the end, add(i, n) - insert by index, remove(i) - delete by index, set(i, n) - change value by index.

The program receives strings as input, the first of which create N - creates an initial list with numbers from 1 to N inclusive. Signatures of other commands:

add 5 - inserts 5 at the end of the list

add 5 6 - inserts 6 at index 5

remove 7 - removes the 7th element of the list

set 7 3 - replaces the value of the seventh element of the list with 3

The printList command signals the end of data entry and should display the list obtained after all manipulations
*/