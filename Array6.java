package JavaSommerSchuleStepik;

import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String [] Words = str.split("\\s");
        for(int i = 0; i < Words.length; i++){
            char lett = Words[i].charAt(0);
            if((lett >='a' && lett <= 'h') || (lett >= 'A' && lett <= 'H')){
                System.out.println(Words[i]);
            }
        }
    } 
}


/*
Слова от a до h
﻿Вводится одна строка целиком. Необходимо вывести те слова данной строки, которые начинаются с буквы из интервала от a до h.

Словом считается совокупность букв и символов от пробела до пробела. Слова могут быть как в верхнем, так и нижнем регистре.

Выводить слова необходимо каждый раз с новой строки.

Sample Input 1:

I'm in my penthouse half naked I cooked this meal for you naked
Sample Output 1:

half
cooked
for
Sample Input 2:

The following is a true story Only the names have been changed To protect the guilty Well I left my job in my home town
Sample Output 2:

following
a
have
been
changed
guilty
home
Sample Input 3:

The bartender's working on a Late night shift She's bonka blonds and Bon Aims on a midnight drift
Sample Output 3:

bartender's
a
bonka
blonds
and
Bon
Aims
a
drift
*/

/*
Words from a to h
﻿One entire line is entered. It is necessary to output those words of a given line that begin with a letter from the interval from a to h.

A word is a collection of letters and symbols from space to space. Words can be in both upper and lower case.

Words must be printed on a new line each time.

Sample Input 1:

I'm in my penthouse half naked I cooked this meal for you naked
Sample Output 1:

half
cooked
for
Sample Input 2:

The following is a true story Only the names have been changed To protect the guilty Well I left my job in my home town
Sample Output 2:

following
a
have
been
changed
guilty
home
Sample Input 3:

The bartender's working on a Late night shift She's bonka blonds and Bon Aims on a midnight drift
Sample Output 3:

bartender's
a
bonka
blondes
and
Bon
Aims
a
drift
*/