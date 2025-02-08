import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class jmycsql extends jmycsqlDataFoo
{
    public List<Map<String,Object>> data = new ArrayList<>();

    
    public void commandExec(String argv) throws Exception
    {
        if (argv.startsWith(INSERT_VALUES))
        {
            INSERT(argv);
        }
        else if(argv.startsWith(UPDATE_VALUES))
        {
            UPDATE(argv);
        }
        else if(argv.startsWith(SELECT_WHERE))
        {
            SELECT(argv);
        }
        else if(argv.startsWith(DELETE_WHERE))
        {
            DELETE(argv);
        }
        else
        {
            throw new Exception("error in commandExec{ INSERT_VALUES, UPDATE_VALUES, SELECT_WHERE, DELETE_WHERE } not found command");
        }

    }


    private void INSERT(String argv) throws Exception // вставка элемента в коллекцию
    {
        argv = textTransform(argv);
        Object id = getObjectFromText(argv, fields[0]);
        Object lastName = getObjectFromText(argv, fields[1]);
        Object age = getObjectFromText(argv, fields[2]);
        Object cost = getObjectFromText(argv, fields[3]);
        Object active = getObjectFromText(argv, fields[4]);


        data.add(createRow
        (
            id, 
            lastName, 
            age, 
            cost, 
            active
        ));
    }


    private void UPDATE(String argv) throws Exception // изменение элемента в коллекции
    {
        argv = textTransform(argv);
        System.out.println("[+] log (where): " + WHERE(argv)); // for test
        

        //INPROCESS
    }


    private void DELETE(String argv) throws Exception // удаление элемента из коллекции
    {
        //TODO
    }


    private void SELECT(String argv) throws Exception // поиск элементов в коллекции
    {
        //TODO
    }


    private String WHERE(String argv) throws Exception //
    {
        if (!argv.contains(" where ") || argv.contains("UPDATE VALUES where"))
        {
            throw new Exception("error in WHERE { UPDATE, DELETE, SELECT } incorrect use of where");
        }

        argv = textTransform(argv);

               
        return getWhereFromString(argv);
    }
}