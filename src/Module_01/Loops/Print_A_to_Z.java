package Module_01.Loops;

/*
    Print A to Z
    You are required to write a program that prints Upper-Case Characters from A to Z

    Input Format
    No input required

    Output Format
    Print A to Z

    Example 1
    Input
    No input required

    Output
    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

    Explanation
    Print A to Z.
 */
public class Print_A_to_Z {
    public static void main(String[] args) {
        // write your code here
        for(int i=65; i<=90; i++){
            char c = (char)i;
            System.out.print(c+" ");
        }
    }
}
