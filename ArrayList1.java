package JavaSommerSchuleStepik;

import java.util.*;
import java.math.*;
import java.io.*;
public class ArrayList1 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
        ArrayList<Character> arrayList2 = new ArrayList<>();
        for(int i = str.length()-1; i >= 0; i--){
           System.out.print(str.charAt(i));
        }
    }
}


/*
Палиндро́м (от др.-греч. πάλιν — «назад, снова» и др.-греч. δρóμος — «бег, движение»), пе́ревертень[1] — число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.

Дана строка. Из данной строки необходимо сделать палиндром следующим образом:

Берем исходную строку и к ней добавляем ее же, но в обратном порядке.

Например дано abcde, тогда ответ abcdeedcba

Sample Input 1:

abcde
Sample Output 1:

abcdeedcba
Sample Input 2:

mymedicine
Sample Output 2:

mymedicineenicidemym
Sample Input 3:

easyprogramm
Sample Output 3:

easyprogrammmmargorpysae
*/

/*
Palindrome (from ancient Greek πάλιν - “back, again” and ancient Greek δρóμος - “running, movement”), invert [1] - a number, letter combination, word or text that is read equally in both directions.

Given a string. From this string you need to make a palindrome as follows:

We take the original line and add it to it, but in reverse order.

For example, given abcde, then the answer is abcdeedcba

Sample Input 1:

abcde
Sample Output 1:

abcdeedcba
Sample Input 2:

mymedicine
Sample Output 2:

mymedicineenicidemym
Sample Input 3:

easyprogram
Sample Output 3:

easyprogrammmmargorpysae
*/