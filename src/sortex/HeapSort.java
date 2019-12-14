package sortex;

public class HeapSort  implements Sort{
    @Override
    public String ascending(int[] arr) {
        return "HeapSort ascending";
    }

    @Override
    public String descending(int[] arr) {
        return "HeapSort descending";
    }

    @Override
    public void description(int[] arr) {

        System.out.println(ascending(arr));
        System.out.println(descending(arr));
    }
}
