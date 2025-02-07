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


    private void WHERE(String argv) //
    {
        //TODO
    }
}