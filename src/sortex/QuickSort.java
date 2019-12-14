package sortex;

public class QuickSort  implements Sort{
    @Override
    public String ascending(int[] arr) {
        return "QuickSort ascending";
    }

    @Override
    public String descending(int[] arr) {
        return "QuickSort descending";
    }

    @Override
    public void description(int[] arr) {

        System.out.println(ascending(arr));
        System.out.println(descending(arr));
    }
}
