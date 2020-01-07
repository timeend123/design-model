package leetCodePractices.algorithms;

/**
 * @author liuyuan
 * @create 2020-01-07 19:05
 * @description 两数相加
 **/
public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //初始化一个结果链表
        ListNode resultNode = new ListNode(0);

        while (l1.next != null || l2.next != null) {
            //当前节点相加
            resultNode.val = resultNode.val + l1.val + l2.val;
            if (l1.next == null && l2.next != null) {
                l1.next = new ListNode(0);
            }
            if (l2.next == null && l1.next != null) {
                l2.next = new ListNode(0);
            }
            resultNode.val = resultNode.val % 10;
            resultNode.next = new ListNode(resultNode.val / 10);
//            resultNode = resultNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return resultNode;

    }

    public static void main(String[] args) {
        ListNode result;
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println("结束");
    }
}
