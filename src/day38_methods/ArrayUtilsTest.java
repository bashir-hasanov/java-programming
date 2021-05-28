package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {45, 32, 1234, 90, 0, 2};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{4, -321, 1234, 903, 0, 22});

        int[] sum = {234, 38959, 1834, -32, 83, 0, 3186, 13, 6};
        System.out.println("the sum of numbers in array = " + ArrayUtils.sum(sum));

        int num = 34;
        int[] nums1 = {12, 765, 794, 0, -43, 34, 4525, 920};
        System.out.println(ArrayUtils.contains(nums1, num));

        int[] numbers1 = {2, 3, 5, 6, 4};
        int[] numbers2 = {3, 2, 5, 6, 4};
        System.out.println(ArrayUtils.equals(numbers1, numbers2));
    }
}
