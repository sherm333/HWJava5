import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        String[] people = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Чернова",
        "Анна Иванова", "Анна Петрова", "Иван Сидоров", "Петр Петров", "Павел Чернов",
        "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
        "Марина Лугова", "Анна Владимирова", "Иван Светляков", "Петр Петин", "Иван Курочкин" };

    Map<String, Integer> names = new HashMap<>();
    for (String person : people) {
      String name = person.split(" ")[0];
      if (!names.containsKey(name))
        names.put(name, 1);
      else
        names.put(name, names.get(name) + 1);
    }

    names.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(person -> System.out.println("Имя \"" + person.getKey() + "\" попадается " +
            person.getValue() + " раз"));
  }
}
    