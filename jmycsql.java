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
            throw new Exception("error");
        }

    }


    private void INSERT(String argv) // вставка элемента в коллекцию
    {
        int id = Integer.parseInt(processString(argv, "'id'"));
        String lastName = processString(argv, "'lastName'");
        int age = Integer.parseInt(processString(argv, "'age'"));
        Double cost = Double.parseDouble(processString(argv, "'cost'"));
        Boolean active = Boolean.parseBoolean(processString(argv, "'active'"));

        data.add(createRow
        (
            id, 
            lastName, 
            age, 
            cost, 
            active
        ));
    }


    private void UPDATE(String argv) // изменение элемента в коллекции
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
}