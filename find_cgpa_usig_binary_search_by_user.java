import java.util.Scanner;

public class find_cgpa_usig_binary_search_by_user {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

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
            //System.out.println(cgpa[output]);
        }
        System.out.println();

        System.out.print("Enter cgpa");
        double userInput = scanner.nextDouble();

        int left = 0;
        int right = cgpa.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpa[mid] == userInput) {
                found = true;
                break;
            }

            if (cgpa[mid] > userInput) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (found) {
            System.out.println( userInput +" is found.");
        } else {
            System.out.println(" Not founded");
        }

    }





}
