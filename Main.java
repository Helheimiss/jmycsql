import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        jmycsql jmycsql = new jmycsql();
        Scanner sc = new Scanner(System.in);
        
        // jmycsql.commandExec(sc.nextLine());

        // System.out.println(jmycsql.data.get(0));

        String sql1 = "UPDATE VALUES 'active'=true  where 'Name'='pety'";
        String sql2 = "UPDATE VALUES 'active'=false, 'cost'=10.1 where 'id'=3";
        
        System.out.println(jmycsql.WHERE(sql1));
    }

}