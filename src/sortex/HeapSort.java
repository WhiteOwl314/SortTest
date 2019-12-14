package sortex;

import java.util.ArrayList;

public class HeapSort  implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {

        Sort.super.description();
        System.out.println("HeapSort로 정렬합니다.");
    }
}
