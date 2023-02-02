package org.sunbrought.排序;

/**
 * 二分查找
 */
public class BinarySearch {

    public static void main (String[] args) {
        int[] arrary = {1, 5, 6, 8, 15, 25, 46, 63, 85, 124};
        int target = 46;
        int index = binarySearch(arrary, target);
        System.out.println(target + "的索引是" + index);
    }

    public static int binarySearch (int[] arr, int t) {
        int l = 0, r =arr.length - 1, m;
        while (l <= r ) {
            //如果数据值过大可能会发生数据溢出，两种解决方法 1.算式转换 2.符号位右移1位 >>>
//            m = (l + r) / 2;
//            l/2 + r/2 ==> l + (-l/2 + r/2) ==> l + (r - l)/2
//            m = l + (r - l)/2;
            m = (l + r) >>> 1;
            if (arr[m] == t) {
                return m;
            } else if (arr[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
