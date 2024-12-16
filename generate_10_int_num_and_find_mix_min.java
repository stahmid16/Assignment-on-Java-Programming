import java.util.Random;

public class generate_10_int_num_and_find_mix_min {
    public static void main(String[] args){
        int[] randArray = new int[10];
        Random random = new Random();

        for(int i=0; i<randArray.length;i++) {
            randArray[i] = random.nextInt(100);
        }
        System.out.println("Generate random 10 int array number\n");

            for(int j=0;j<randArray.length;j++){
                System.out.println(randArray[j]);

        }

            int max=randArray[0];
            int min=randArray[0];
            for(int m=0;m<randArray.length;m++){
               if(randArray[m]>max){
                   max=randArray[m];
               }
               if(randArray[m]<min){
                   min=randArray[m];
               }
            }
        System.out.println("Maximum Number--"+max);
        System.out.println("Minimum NUmber--"+min);
    }
}
