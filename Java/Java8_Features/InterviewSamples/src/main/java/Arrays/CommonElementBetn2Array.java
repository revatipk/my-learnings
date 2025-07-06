package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementBetn2Array {
    public static void main(String []args){
        int []nums1 = {3,2,6,4,1};
        int []nums2={6,3,6,1,2};
        fetchCommonNums(nums1,nums2);
    }

    private static void fetchCommonNums(int[] nums1, int[] nums2) {
        List<Integer> collect = Arrays.stream(nums1).filter(number -> Arrays.stream(nums2).anyMatch(number2 -> number2 == number)).boxed().collect(Collectors.toList());
        System.out.println(collect);
    }
}
