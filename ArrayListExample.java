import java.util.*;

public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        System.out.println();
        System.out.println();

        list.remove(list.size()-1);
        list.remove(0);


        
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }

    }
}