import java.util.ArrayList;

/**
 * Created by User on 14.02.2017.
 */
public class ArrayListMethod {
    ArrayList<String> list;

    public ArrayListMethod(){
        list = new ArrayList<>();

        list.add("Маша");
        list.add("Саша");
        list.add("Гена");
        list.add("Ардак");
        list.add("Костя");
        list.add("Кера");
        list.add("Олжик");
        list.add("Медет");
        list.add("Нурислам");
        list.add("Зангар");
    }

    public ArrayList<String> counter(ArrayList<String> list){
        if(list.size()!=1){
            ArrayList<String> integers = list;
            list.remove(1);
            return counter(list);
        }
        return list;
    }

    public ArrayList<String> getList() {
        return list;
    }
}
