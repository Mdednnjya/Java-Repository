public class main{
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7,5,10,198,220,04};
        int maxvalue = 0;

        for(int i=0;i< a.length;i++){
            if(a[i] > maxvalue){
                maxvalue = a[i];
            }

        }         
        System.out.println(maxvalue);;
    }
}