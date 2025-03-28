import java.util.HashMap;

public class Duplicatenum {
    public static void main(String[] args) {
        int[] num = {1,1,1,2,2,2,3,4,7};
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i : num){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        for(int j: hm.keySet()){
            if(hm.get(j)!=1){

                System.out.println(j);

            }
        }
        System.out.println(hm);

    }
    
    
}
