public class find_2nd_highest_score {
    public static void main(String[] args){
        double[] cgpa ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double max=cgpa[0];
        double secMax=cgpa[0];
        for(int i=0; i<cgpa.length; i++){
            if(cgpa[i]>max){
                secMax=max;
                max=cgpa[i];

            }
            else if(cgpa[i]>secMax && secMax<max){
                secMax=cgpa[i];

            }
        }
        //System.out.println(max);
        System.out.println("2nd Highest CGPA -"+secMax);
    }
}
