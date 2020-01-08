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
        ListNode resultNode = new ListNode(0);
        ListNode currentNode = resultNode, p = l1, q = l2, temp;

        while (p != null || q != null) {
            //当前节点相加
            currentNode.val = currentNode.val + p.val + q.val;
            if (p.next == null && q.next != null) {
                p.next = new ListNode(0);
            }
            if (q.next == null && p.next != null) {
                q.next = new ListNode(0);
            }
            temp = new ListNode(currentNode.val / 10);
            currentNode.val = currentNode.val % 10;
            currentNode.next = temp;
            if (p.next == null && q.next == null&&currentNode.next.val==0) {
                currentNode.next = null;
            }
            currentNode = temp;
            p = p.next;
            q = q.next;
        }
        return resultNode;
    }

    public static void main(String[] args) {


        ListNode result;
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println("结束");
    }
}
