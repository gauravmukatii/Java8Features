import java.util.HashMap;
import java.util.Map;

public class Multithreading {

    public static void main (String args[]){

        String str = "aabbbcddffej";

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }

    }


}
