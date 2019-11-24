package leetCodePractices.algorithms;

/**
 * @author liuyuan
 * @create 2019-11-24 16:18
 * @description
 **/
public class Test {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            //计算另外一个值
            int other=target-nums[i];
            //查找是否包含这个值
            for (int j = 0; j < nums.length; j++) {
                if (other==nums[j]&&i!=j){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int target=9;
        int[] result=new Test().twoSum(arr,target);
        System.out.println(result[0]+"---"+result[1]);
    }
}
