package JavaSommerSchuleStepik;

import java.util.Scanner;

public class Array5 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int s = str1.compareTo(str2); 
        if(s <= 0){
        System.out.print(str1);
        } else {
            System.out.print(str2);
        }
    }
}


/*
Ввод строк
Программа получает на вход строку из 2 слов, разделенных пробелом.

Необходимо вывести слово, меньшее в лексикографическом порядке.

Sample Input 1:

mother brother
Sample Output 1:

brother
Sample Input 2:

look picture
Sample Output 2:

look
Sample Input 3:

cook soup
Sample Output 3:

cook
*/

/*
Entering strings
The program receives as input a string of 2 words separated by a space.

It is necessary to output the word that is smaller in lexicographic order.

Sample Input 1:

mother brother
Sample Output 1:

brother
Sample Input 2:

look picture
Sample Output 2:

look
Sample Input 3:

cook soup
Sample Output 3:

cook
*/