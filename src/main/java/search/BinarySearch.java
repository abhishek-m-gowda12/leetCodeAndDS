package search;

import java.util.List;

public class BinarySearch {
    public static int search(List<Integer> list, int elemnet) {
        int start = 0;
        int end = list.size() - 1;
        int middle = (int) Math.floor((start + end) / 2);
        while (list.get(middle) != elemnet && start <= end) {
            if (elemnet < list.get(middle - 1)) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (int) Math.floor((start + end) / 2);
        }
        return list.get(middle) == elemnet ? middle : -1;
    }

    public static void main(String[] args) {
        int ans = search(List.of(2, 5, 6, 9, 13, 15, 28, 30), 66);
        System.out.println(ans);
    }

}
