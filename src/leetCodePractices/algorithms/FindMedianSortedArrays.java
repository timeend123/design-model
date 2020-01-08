package leetCodePractices.algorithms;

/**
 * @author liuyuan
 * @create 2020-01-08 21:26
 * @description
 **/
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int [] arr=new int[m+n];
        //先进行归并排序
        int x=0,i=0,j=0;
        while (i<m&&j<n){
            if (nums1[i]<=nums2[j]){
                arr[x++]=nums1[i++];
            }else{
                arr[x++]=nums2[j++];
            }
        }
        while (i<m){
            arr[x++]=nums1[i++];
        }
        while (j<n){
            arr[x++]=nums2[j++];
        }
        //中位数的位置
        int middle1=(m+n)/2;
        if ((m+n)%2==0){
            int middle2=middle1-1;
            return (arr[middle1]+ arr[middle2])/2D;
        }
        return arr[middle1];
    }

    public static void main(String[] args) {
        int [] nums1=new int[]{1,3};
        int [] nums2=new int[]{2,3};
        double v = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.println(v);
    }
}
