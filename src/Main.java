public class Main
{
    public static void main(String[] args) throws Exception
    {
        jmycsql jmycsql = new jmycsql();

        String cm = "INSERT VALUES 'lastName'    =    'Федоров' , 'id'=     3    ,    'age'=40, 'active'=true";
        jmycsql.commandExec(cm);
        System.out.println(jmycsql.data.get(0));
        
    }

}