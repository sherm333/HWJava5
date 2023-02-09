import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

public class task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();

        multiValueMap.put("Петров П.П.", new ArrayList<String>());
        multiValueMap.get("Петров П.П.").add("89252103675");
        multiValueMap.get("Петров П.П.").add("89252604655");
        multiValueMap.get("Петров П.П.").add("89252464655");
        multiValueMap.get("Петров П.П.").add("89255474655");
        multiValueMap.get("Петров П.П.").add("89252623455");
        
        multiValueMap.put("Иванов И.И.", new ArrayList<String>());
        multiValueMap.get("Иванов И.И.").add("89262653623");

        multiValueMap.put("Федоров Ф.Ф.", new ArrayList<String>());
        multiValueMap.get("Федоров Ф.Ф.").add("89052624617");

        multiValueMap.put("Сидоров С.С.", new ArrayList<String>());
        multiValueMap.get("Сидоров С.С.").add("89772632621");

        System.out.print(multiValueMap);
    }
   
}