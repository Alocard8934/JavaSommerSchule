package JavaSommerSchuleStepik;

import java.util.*;
import java.math.*;
import java.io.*;
public class ArrayList7 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String s1 = in.next();
       char[] strToArray = s1.toCharArray();
       StringBuilder bui = new StringBuilder(s1); 
       bui.reverse();
       
       if(s1.equals(bui.toString())){
           System.out.println(s1);
       }else{
           for(int i = 0; i < s1.length(); i++){      
               bui.insert(i, strToArray[i]);
               bui.reverse();
               if(bui.toString().equals(bui.reverse().toString())){
                   System.out.println(bui); 
                   break;
               }
           }
        }                        
    }
}

/*
Сложный палиндром
Палиндро́м (от др.-греч. πάλιν — «назад, снова» и др.-греч. δρóμος — «бег, движение»), пе́ревертень[1] — число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.

Дана строка. Из данной строки необходимо сделать палиндром следующим образом:

Необходимо сделать из данной строки палиндром минимально возможной длины.

Например: abcb -> abcba, aaa -> aaa, a -> a, abcded -> abcdedcba



Sample Input 1:

abcb 
Sample Output 1:

abcba
Sample Input 2:

aaa 
Sample Output 2:

aaa 
Sample Input 3:

abcded 
Sample Output 3:

abcdedcba
*/

/*
Complex palindrome
Palindrome (from ancient Greek πάλιν - “back, again” and ancient Greek δρóμος - “running, movement”), invert [1] - a number, letter combination, word or text, equally readable on both sides.

Given a string. The neobodium line is related to the palindrome with the following explanation:

Now you can draw from palindrome strings of minimum length.

For example: abcb -> abcba, aaa -> aaa, a -> a, abcded -> abcdedcba



Input example 1:

ABCB
Example output 1:

abkba
Input example 2:

ahh
Example output 2:

ahh
Input example 3:

retreated
Example output 3:

abcdedcba
*/