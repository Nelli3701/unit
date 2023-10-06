import java.util.ArrayList;

public class NumList {
    double average(ArrayList<Integer> list) {

        if (list.size() == 0) {
            throw new ArithmeticException("Пустой список");
        } else {
            double sum = 0;

            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

            return sum / list.size();
        }
    }

    String compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        double average1 = average(list1);
        double average2 = average(list2);
        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

}
