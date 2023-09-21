package JavaSommerSchuleStepik;

import java.util.Scanner;
public class Array8 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        
        String newStr = s[0];
        String newStr2 = s[1];
        String[] str1 = newStr.split("");
        String[] str2 = newStr2.split("");
        
        for(int i = 0; i < str1.length; i++){
            for(int j = 0; j < str2.length; j++){
                if(str1[i].equals(str2[j])){
                    str = str.replace(str1[i], "");
                }
            }

        }
        System.out.print(str.replaceAll(" ",""));
    }
}


/*
Вычитание строк
Вычитанием строк назовем операцию при которой все буквы вычитаемого вычеркиваются из уменьшаемого, а если в уменьшаемом таких букв не было они дописываются в конец уменьшаемого в порядке обхода вычитаемого от 0 индекса к последнему.

Например: abcdef - abcfonpq = deonpq или abcdef - fedcloj = abloj или abcdef - fealobjm = cdlojm

Sample Input 1:

abcdef abcfonpq
Sample Output 1:

deonpq
Sample Input 2:

abcdef fedcloj 
Sample Output 2:

abloj
Sample Input 3:

abcdef fealobjm
Sample Output 3:

cdlojm
*/

/*
Subtracting lines
Line subtraction is an operation in which all the letters of the subtrahend are crossed out from the minuend, and if there were no such letters in the minuend, they are added to the end of the minuend in the order of traversing the index subtracted from 0 to the last one.

For example: abcdef - abcfonpq = deonpq or abcdef - fedcloj = abloj or abcdef - fealobjm = cdlojm

Sample Input 1:

abcdef abcfonpq
Sample Output 1:

deonpq
Sample Input 2:

abcdef fedcloj
Sample Output 2:

abloj
Sample Input 3:

abcdef fealobjm
Sample Output 3:

cdlojm
*/