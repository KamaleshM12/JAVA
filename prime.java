
public class prime {
    public static void main(String[] args) {
        int n = 20;
        int count=0;

        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i%j==0){
                    count++;
                }
                
            }
            if(count==2){
                System.out.println(j);
            }
            
        }

        
        
    }
}
