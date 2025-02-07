import java.util.HashMap;
import java.util.Map;

public class jmycsqlDataFoo extends jmycsqlCommands
{
    String[] fields = {"id", "lastName", "age", "cost", "active"};

    protected String textTransform(String input)
    {
        String output = input.replaceAll("'(\\w+)'\\s*=\\s*'([^']*)'", "$1=$2")
                             .replaceAll("'(\\w+)'\\s*=\\s*([^',\\s]+)", "$1=$2")
                             .replaceAll("\\s*,\\s*", ", ")
                             .replaceAll("\\s*=", "=")
                             .trim();
        

        return output;
    }


    protected Object getObjectFromText(String input, String field)
    {
        field += "=";
        int startAt = input.indexOf(field);
        int endTo = startAt;

        int i = startAt;
        input += ",";
        try 
        {            
            while (input.toCharArray()[i] != ',')
            {
                endTo++;
                i++;
            }
        }
        catch (Exception e) 
        {
            return null;
        }

        String newInputText = input.substring(startAt, endTo);

        for (String f : fields) 
        {
            newInputText = newInputText.replace(f, "");
        }


        return newInputText.replace("=", "");
    }


    protected Map<String, Object> createRow(Object id, Object lastName, Object age, Object cost, Object active) 
    {
       Map<String, Object> row = new HashMap<>();
       row.put(fields[0], id);
       row.put(fields[1], lastName);
       row.put(fields[2], age);
       row.put(fields[3], cost);
       row.put(fields[4], active);
       return row;
    }
}