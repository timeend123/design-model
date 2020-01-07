package leetCodePractices.algorithms;

/**
 * @author liuyuan
 * @create 2020-01-07 19:05
 * @description 两数相加
 **/
public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //用于存放结果列表
        ListNode resultNode = new ListNode(0);
        while (true) {
            //当前节点相加
            resultNode.val = l1.val + l2.val;
            //当前节点相加大于9需要进行进位
            if (resultNode.val > 9) {
                resultNode.val=l1.val+l2.val-10;
            }
                resultNode.next.val = l1.next.val + l2.next.val+1;
        }
    }
}
