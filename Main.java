import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        jmycsql jmycsql = new jmycsql();

        jmycsql.commandExec("INSERT VALUES 'lastName'='Федоров'  ,  'cost'  =  null  , 'active'=true, 'id'=3, 'age'=40");
        System.out.println(jmycsql.data.get(0));
        

    }

}