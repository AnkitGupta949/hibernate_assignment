import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface A{
    default void sum(){
        System.out.println("hello");

    }

     void print();


}



public class test{





    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(6);
        list.add(3);
        list.add(1);


       A obj=()-> System.out.println();


        //        list.sort(((o1, o2) -> o1-o2));
//

        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return o1.intValue()-o2.intValue();
            }
        };


        list.sort(com);

        for(int i:list){
            System.out.println(i);

        }


    }
}
