import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        jmycsql jmycsql = new jmycsql();
        Scanner sc = new Scanner(System.in);
        
        jmycsql.commandExec(sc.nextLine());
    }
}