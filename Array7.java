package JavaSommerSchuleStepik;

import java.util.Scanner;
public class Array7 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        System.out.println(s[0] + ":");
        for(int i = 2; i < s.length; i++){
            System.out.println("-" + s[i].replace(",", ""));
        }
    }
}


/*
Сплит
Дана строка вида термин - определение1, определение2, определение3, .....

Необходимо вывести ответ в формате:

Термин:

-определение1

-определение2

-определение3

Sample Input 1:

banana - a, b, c, d, e
Sample Output 1:

banana:
-a
-b
-c
-d
-e
Sample Input 2:

aa - asaf, asf, asff, asfasf, asfasf, asfasf
Sample Output 2:

aa:
-asaf
-asf
-asff
-asfasf
-asfasf
-asfasf
Sample Input 3:

abc - a, b
Sample Output 3:

abc:
-a
-b
*/

/*
Split
Given a string of the form term - definition1, definition2, definition3, .....

The response must be output in the following format:

Term:

-definition1

-definition2

-definition3

Sample Input 1:

banana - a, b, c, d, e
Sample Output 1:

banana:
-a
-b
-c
-d
-e
Sample Input 2:

aa - asaf, asf, asff, asfasf, asfasf, asfasf
Sample Output 2:

aa:
-asaf
-asf
-asff
-asfasf
-asfasf
-asfasf
Sample Input 3:

abc - a, b
Sample Output 3:

abc:
-a
-b
*/