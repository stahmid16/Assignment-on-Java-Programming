import java.util.Scanner;

public class find_two_lowest_babeis_height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] height = new int[10];
        System.out.println("Enter 10 cm babies height\n");
        for(int i=0; i<height.length;i++){
            height[i] = scanner.nextInt();
        }

        int small=height[0];
        int small2nd=height[0];

        for(int i=0;i<height.length;i++){
            if(height[i]<small){
                small2nd=small;
                small=height[i];
            }
            else if(height[i]<small2nd && small>small2nd){
                small2nd=height[i];
            }
        }
        System.out.println("Smallest Baby--"+small);
        System.out.println("2nd Smalest Baby--"+small2nd);

    }
}
