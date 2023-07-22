package anand.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		Integer arr[] =  {1,1,3,5,5};
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(arr));
		singleNonDuplicate(input);
	}

	public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        Map<Integer,Integer> dataMap = new HashMap<>();
        for(Integer data : arr) {
            if(dataMap.containsKey(data)) {
                dataMap.remove(data);
            } else {
                dataMap.put(data, 1);
            }
        }
        Integer result =0;
        for(Integer key : dataMap.keySet()) {
            result = dataMap.get(key);
        }
        return result;
    }
}
