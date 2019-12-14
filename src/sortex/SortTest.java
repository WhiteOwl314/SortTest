package sortex;

import java.util.ArrayList;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args){

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        QuickSort quickSort = new QuickSort();
        HeapSort heapSort = new HeapSort();
        BubbleSort bubbleSort = new BubbleSort();

        while(true){
            System.out.println("숫자를 입력해주세요. 숫자 0 을 입력하면 중지합니다.");
            int select = scanner.nextInt();
            if(select == 0){
                System.out.println("중지되었습니다.");
                break;
            }
            numberList.add(select);
        }


        System.out.println("정렬 방법을 선택해 주세요.");
        System.out.println("q : QuickSort 의 방법으로 정렬합니다.");
        System.out.println("h : QuickSort 의 방법으로 정렬합니다.");
        System.out.println("b : QuickSort 의 방법으로 정렬합니다.");

        String select = scanner.next();
        if(select == "q"){

        }
    }

}
