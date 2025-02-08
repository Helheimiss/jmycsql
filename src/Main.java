public class Main
{
    public static void main(String[] args) throws Exception
    {
        jmycsql jmycsql = new jmycsql();

        // for tests
        jmycsql.commandExec("INSERT VALUES 'lastName'    =    'Федоров' , 'id'=     1, 'cost'=3.3    ,   'age'=123, 'active'=false");
        jmycsql.commandExec("INSERT VALUES 'lastName'  =    'pet' , 'id'   =  2    ,   'age'=33, 'active'=true");
        jmycsql.commandExec("INSERT VALUES 'lastName'    =    'Федоров' , 'id'=     3  ,   'age'=40, 'active'=true");


        jmycsql.printAllRowsInDataBase(jmycsql.data);


        System.out.println("------");
        String cm2 = "UPDATE VALUES 'lastName' = 'ff', 'id'=3, where 'age'=40, 'active'=true";
        jmycsql.commandExec(cm2);
        System.out.println("------");

        
        jmycsql.printAllRowsInDataBase(jmycsql.data);


    }

}