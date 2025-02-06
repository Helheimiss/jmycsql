import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sql {
//    Map<String,Object> row1 = new HashMap<>();
//    row1.put("id",1);
//    row1.put("lastName","Петров");
//    row1.put("age",30);
//    row1.put("cost",5.4);
//    row1.put("active", true);
//
//    Map<String,Object> row2 = new HashMap<>();
//    row2.put("id",2);
//    row2.put("lastName","Иванов");
//    row2.put("age",25);
//    row2.put("cost",4.3);
//    row2.put("active", false);
    List<Map<String,Object>> data = new ArrayList<>();
//    data.add(row1);
//    data.add(row2);


    // INSERT VALUES ‘lastName’ = ‘Федоров’ , ‘id’=3, ‘age’=40, ‘active’=true
    //  ‘lastName’ = ‘Федоров’ , ‘id’=3, ‘age’=40, ‘active’=true
    public void command(String argv)
    {
        if (argv.startsWith("INSERT VALUES "))
        {
            INSERT(argv);
        }
    }


    void INSERT(String argv) // вставка элемента в коллекцию
    {
        String text = argv.replace("INSERT VALUES ", "");
        data.add(new HashMap<String, Object>()
        {
            {
                put("id", 1);
                put("lastName", "Петров");
                put("age", 30);
                put("cost", 5.4);
                put("active", true);
            }
        });
    }

    void UPDATE() // изменение элемента в коллекции
    {
        //TODO
    }

    void DELETE() // удаление элемента из коллекции
    {
        //TODO
    }

    void SELECT() // поиск элементов в коллекции
    {
        //TODO
    }
}
