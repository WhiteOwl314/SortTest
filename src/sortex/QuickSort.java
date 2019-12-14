package sortex;

import java.util.ArrayList;

public class QuickSort  implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int [] arr) {
        System.out.println("QuickSort descending");
    }


    @Override
    public void description() {

        Sort.super.description();
        System.out.println("QuickSort 로 정렬합니다.");

    }
}
