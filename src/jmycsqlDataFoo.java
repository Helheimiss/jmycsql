import java.util.HashMap;
import java.util.Map;

public class jmycsqlDataFoo extends jmycsqlCommands
{
   protected Map<String, Object> createRow(Object id, Object lastName, Object age, Object cost, Object active) 
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