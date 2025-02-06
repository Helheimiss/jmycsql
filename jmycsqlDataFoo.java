import java.util.HashMap;
import java.util.Map;

public class jmycsqlDataFoo extends jmycsqlCommands
{
    protected String processString(String text, String field)
    {
        text = text.replaceAll("\\s*=\\s*", "=");
        text = text.replaceAll("\\s*,\\s*", ",");
        
        
        String[] parts = text.split(",");
        
        for (String part : parts) {
            if (part.contains(field + "=")) 
            {
                String lastNamePart = part.split("=")[1].trim();
                lastNamePart = lastNamePart.replace("'", "");
                return lastNamePart;
            }
        }

        return null;
    } 


   protected Map<String, Object> createRow(int id, String lastName, int age, double cost, boolean active) 
   {
       Map<String, Object> row = new HashMap<>();
       row.put("id", id);
       row.put("lastName", lastName);
       row.put("age", age);
       row.put("cost", cost);
       row.put("active", active);
       return row;
   }
}