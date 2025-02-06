import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        jmycsql jmycsql = new jmycsql();
        Scanner sc = new Scanner(System.in);
        
        // jmycsql.commandExec(sc.nextLine());

        String text = "INSERT VALUES 'lastName'='Федоров' , 'id'=3, 'age'=40, 'active'=true";


        System.out.println(jmycsql.processString(text, "'active'"));
    }
}