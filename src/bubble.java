import java.util.ArrayList;
import java.util.Collections;

public class bubble {
    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(9);
        dataList.add(7);
        dataList.add(1);
//        for (int i = 0; i < 3; i ++){
//            dataList.add((int)(Math.random()*100));
//        }
        for (int index = 0; index < dataList.size() - 1; index++){
            if (dataList.get(index) > dataList.get(index + 1)){
                Collections.swap(dataList, index, index + 1);
            }
        }

        for (int index = 0; index < dataList.size() - 1; index++){
            if (dataList.get(index) > dataList.get(index + 1)){
                Collections.swap(dataList, index, index + 1);
            }
        }


        System.out.println(dataList);
    }

}
