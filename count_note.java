import java.util.Scanner;

public class count_note {
    public static void main(String[] args){

        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount\n");
        int amount = scanner.nextInt();

        for(int i=0;i<notes.length;i++){
            if(amount>=notes[i]){
                int count = amount/notes[i];
                amount=amount % notes[i];
                System.out.println(notes[i]+" "+count);
            }
        }

    }
}
