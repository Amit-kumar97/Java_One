package Module_01.String;

/*
    Ptice
    Adrian, Bruno and Goran wanted to join the bird lovers’ club. However, they did not know that all applicants must pass an entrance exam. The exam consists of n questions, each with three possible answers: A, B and C.

    Unfortunately, they couldn’t tell a bird from a whale so they are trying to guess the correct answers. Each of the three boys has a theory of what set of answers will work best:

    Adrian claims that the best sequence is: A, B, C, A, B, C, A, B, C, A, B, C ...
    Bruno is convinced that this is better: B, A, B, C, B, A, B, C, B, A, B, C ...
    Goran laughs at them and will use this sequence: C, C, A, A, B, B, C, C, A, A, B, B ...

    Write a program that, given the correct answers to the exam, determines who of the three was right – whose sequence contains the most correct answers.

    Input Format
    First line contains an integer n denoting number of questions.
    Second line contains a string of n letters ‘A’, ‘B’ and ‘C’. These are, in order, the correct answers to the questions in the exam.
    Last line contains the indices separated by space.

    Output Format
    On the first line, output m, the largest number of correct answers one of the three boys gets.

    After that, output the names of the boys (in alphabetical order) whose sequences result in m correct answers.

    Example 1
    Input
    5
    BAACC

    Output
    3
    Bruno

    Explanation
    Here only Bruno has most correct answers i.e. 3.

    Example 2
    Input
    9
    AAAABBBBB

    Output
    4
    Adrian
    Bruno
    Goran

    Explanation
    Here all 3 have 4 correct answers.
 */
import java.util.Scanner;

public class Ptice {
    static void ptice(int n, String key) {
        // Write your code here and print output in this function
        String A = "ABC";
        String B = "BABC";
        String C = "CCAABB";

        int AS = 0, BS = 0, GS = 0;

        for(int i=0; i<n; i++){
            char  ch = key.charAt(i);

            if(ch==A.charAt(i%3)) AS++;

            if(ch==B.charAt(i%4)) BS++;

            if(ch==C.charAt(i%6)) GS++;
        }

        int maxScore = Math.max(AS, Math.max(BS, GS));

        System.out.println(maxScore);

        if(maxScore==AS) System.out.println("Adrian");

        if(maxScore==BS) System.out.println("Bruno");

        if(maxScore==GS) System.out.println("Goran");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        ptice(n, str);
        sc.close();
    }
}
