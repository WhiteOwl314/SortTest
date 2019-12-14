package sortex;

public class BubbleSort  implements Sort{
    @Override
    public String ascending(int[] arr) {
        return "BubbleSort ascending";
    }

    @Override
    public String descending(int[] arr) {
        return "BubbleSort descending";
    }

    @Override
    public void description(int[] arr) {

        System.out.println(ascending(arr));
        System.out.println(descending(arr));
    }
}
