import java.util.HashMap;


public class FrequencyCount {
    public static void main(String[] args){

        HashMap <Character,Integer> frequencyCount = new HashMap<>();

        String s = "apple";
        for(char c : s.toCharArray()){
            frequencyCount.merge(c,1,Integer::sum);
        }

        System.out.println(frequencyCount);
    }
}
