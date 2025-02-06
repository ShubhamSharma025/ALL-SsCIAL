import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextgreat {
    public int[] nextGreater(int[]nums1,int[]nums2){
        Map<Integer,Integer> next =new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num: nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                next.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int[] result =new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=next.getOrDefault(nums1[i],-1 );

        }
        return result;


    }
    public static void main(String[] args) {
        nextgreat obj=new nextgreat();
        int[]nums1={4,1,2};
        int[]nums2={1,3,4,2};
        System.out.println(Arrays.toString(obj.nextGreater(nums1, nums2)));
    }
}
