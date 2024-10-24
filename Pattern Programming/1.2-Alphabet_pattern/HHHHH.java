public class HHHHH {
    
    public static void main(String... args){

        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==(n-1)/2){
                    System.err.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println( );
        }
    }
}
