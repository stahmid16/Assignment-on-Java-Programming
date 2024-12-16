public class five_and_ten_mark_total_100 {
    public static void main(String[] args) {
        int totalMarks = 100;
        int totalQues= 15;
        int fiveMark = 0;
        int tenMark = 0;
        for (int fiveMarks = 0; fiveMarks <= totalQues; fiveMarks++) {
            int tenMarks = totalQues- fiveMarks;

            if ((fiveMarks * 5 + tenMarks * 10) == totalMarks) {
                fiveMark = fiveMarks;
                tenMark = tenMarks;
                break;
            }
        }
        System.out.println("5-mark questions: " + fiveMark);
        System.out.println("10-mark questions: " + tenMark);



    }
}
