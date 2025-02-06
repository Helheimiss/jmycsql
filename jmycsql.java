import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class jmycsql extends jmycsqlDataFoo
{
    private List<Map<String,Object>> data = new ArrayList<>();

    
    public void commandExec(String argv) throws Exception
    {
        if (argv.startsWith(INSERT_VALUES))
        {
            processString(argv, "'id'");
            data.add(createRow
            (
                Integer.parseInt(processString(argv, "'id'")), // id
                processString(argv, "'lastName'"), // lastName
                Integer.parseInt(processString(argv, "'age'")), // age
                Double.parseDouble(processString(argv, "'cost'")), // cost
                Boolean.parseBoolean(processString(argv, "'cost'")) // active
            ));
        }
        else if(argv.startsWith(UPDATE_VALUES))
        {

        }
        else if(argv.startsWith(SELECT_WHERE))
        {

        }
        else if(argv.startsWith(DELETE_WHERE))
        {

        }
        else
        {
            throw new Exception("error");
        }

    }


    private void INSERT(String argv) // вставка элемента в коллекцию
    {
        //TODO
    }


    private void UPDATE() // изменение элемента в коллекции
    {
        //TODO
    }


    private void DELETE() // удаление элемента из коллекции
    {
        //TODO
    }


    private void SELECT() // поиск элементов в коллекции
    {
        //TODO
    }
}
