public class sorted_cgpa {
    public static void main(String[] args){
        double[] cgpa ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        for(int i=0; i<cgpa.length;i++){
            for(int j=i; j<cgpa.length;j++){
                if(cgpa[i]>cgpa[j]){
                  double temp=cgpa[i];
                  cgpa[i]=cgpa[j];
                  cgpa[j]=temp;


                }
            }


        }
        for(int output=0;output<cgpa.length;output++){
            System.out.println(cgpa[output]);
        }
    }
}
