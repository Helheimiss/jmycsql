public class Main
{
    public static void main(String[] args) throws Exception
    {
        jmycsql jmycsql = new jmycsql();

        // for tests
        String cm = "INSERT VALUES 'lastName'    =    'Федоров' , 'id'=     3    ,   'age'=40, 'active'=true";
        String cm2 = "UPDATE VALUES 'lastName'    =    'Федоров' , 'id'=     3    ,   where 'age'=40, 'active'=true";
        jmycsql.commandExec(cm);
        jmycsql.commandExec(cm2);
        System.out.println(jmycsql.data.get(0));


    }

}