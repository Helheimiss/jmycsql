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
            throw new Exception("error in commandExec");
        }

    }


    private void INSERT(String argv) // вставка элемента в коллекцию
    {
        Object id = processString(argv, "'id'");
        Object lastName = processString(argv, "'lastName'");
        Object age = processString(argv, "'age'");
        Object cost = processString(argv, "'cost'");
        Object active = processString(argv, "'active'");

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
        //TODO
    }


    private void DELETE(String argv) // удаление элемента из коллекции
    {
        //TODO
    }


    private void SELECT(String argv) // поиск элементов в коллекции
    {
        //TODO
    }


    public String WHERE(String argv) throws Exception
    {
        if (!argv.contains(" where ")) 
        {
            throw new Exception("error in WHERE");
        }
    
        argv = argv.replaceAll("\\s*=\\s*", "=");
        argv = argv.replaceAll("\\s*,\\s*", ",");
       

        String sqlLower = argv.toLowerCase();
        int whereIndex = sqlLower.indexOf("where");
        
        if (whereIndex != -1) 
        {
            return argv.substring(whereIndex + 5).trim();
        }
        
        return null;
    }
}