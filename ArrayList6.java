package JavaSommerSchuleStepik;

import java.util.*;
import java.math.*;
import java.io.*;
public class ArrayList6 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();                          // enter content
        StringBuilder sb = new StringBuilder(word);                // flip the contents
            sb.reverse();
        int length = word.length();                                // content length
        char[][] table = new char[length][length];                 // set up a two-dimensional array

     
        for (int i = 0; i < length; i++) {                         
            for (int j = 0; j < length; j++) {
                if (i == 0) {                                      // fill in the first row
                    table[i][j] = word.charAt(j);
                } else if(j== 0){                                  // fill in the first line
                    table[i][j] = word.charAt(i);
                }else if(i == length - 1){                         // fill in the last line
                    for(int a = 0; a < length; a++){table[length - 1][a] = sb.charAt(a);}  
                }else if(j == length - 1){                         // fill in the last row 
                     for(int b = 0; b < length; b++){table[b][length - 1] = sb.charAt(b);}
                }else {
                    table[i][j] = '0';
                }System.out.print(table[i][j] + " ");
            }System.out.println();
        }        
    }
}


/*
Замостить таблицу словом
Дано слово состоящее из букв в любом регистре. Необходимо вывести на экран таблицу в соответствии с примером:

Пусть слово = "abcde", тогда таблица должна быть вот такой -

a b c d e

b 0 0 0 d

c 0 0 0 c

d 0 0 0 b

e d c b a

Где пустое пространство заполняется нулями!

Расстояние между буквами на выводе - 1 пробел

Sample Input 1:

abcde
Sample Output 1:

a b c d e 
b 0 0 0 d 
c 0 0 0 c 
d 0 0 0 b 
e d c b a 
Sample Input 2:

recursion
Sample Output 2:

r e c u r s i o n 
e 0 0 0 0 0 0 0 o 
c 0 0 0 0 0 0 0 i 
u 0 0 0 0 0 0 0 s 
r 0 0 0 0 0 0 0 r 
s 0 0 0 0 0 0 0 u 
i 0 0 0 0 0 0 0 c 
o 0 0 0 0 0 0 0 e 
n o i s r u c e r 
Sample Input 3:

binarytree
Sample Output 3:

b i n a r y t r e e 
i 0 0 0 0 0 0 0 0 e 
n 0 0 0 0 0 0 0 0 r 
a 0 0 0 0 0 0 0 0 t 
r 0 0 0 0 0 0 0 0 y 
y 0 0 0 0 0 0 0 0 r 
t 0 0 0 0 0 0 0 0 a 
r 0 0 0 0 0 0 0 0 n 
e 0 0 0 0 0 0 0 0 i 
e e r t y r a n i b
*/

/*
Tile the table with a word
Given a word consisting of letters in any case. It is necessary to display a table according to the example:

Let the word = "abcde", then the table should be like this -

a b c d e

b 0 0 0 d

c 0 0 0 c

d 0 0 0 b

e d c b a

Where empty space is filled with zeros!

The distance between letters on the output is 1 space

Sample Input 1:

abcde
Sample Output 1:

a b c d e
b 0 0 0 d
c 0 0 0 c
d 0 0 0 b
e d c b a
Sample Input 2:

recursion
Sample Output 2:

r e c u r s i o n
e 0 0 0 0 0 0 0 o
c 0 0 0 0 0 0 0 i
u 0 0 0 0 0 0 0 s
r 0 0 0 0 0 0 0 r
s 0 0 0 0 0 0 0 u
i 0 0 0 0 0 0 0 c
o 0 0 0 0 0 0 0 e
n o i s r u c e r
Sample Input 3:

binarytree
Sample Output 3:

b i n a r y t r e e
i 0 0 0 0 0 0 0 0 e
n 0 0 0 0 0 0 0 0 r
a 0 0 0 0 0 0 0 0 t
r 0 0 0 0 0 0 0 0 y
y 0 0 0 0 0 0 0 0 r
t 0 0 0 0 0 0 0 0 a
r 0 0 0 0 0 0 0 0 n
e 0 0 0 0 0 0 0 0 i
e e r t y r a n i b
*/