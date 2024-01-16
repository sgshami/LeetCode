//Code created in LeetCode. Does not have test cases. 

class TwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodeSum = new ListNode();
        ListNode temp = nodeSum;
        int sum = 0;
        
        //Loop while both lists are the same length
        while(l1 != null && l2 != null){
            temp.next = new ListNode(((l1.val + l2.val)%10 + sum)%10);
            sum = (l1.val + l2.val + sum)/10;
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }

        //When l1 is longer
        while(l1 != null){
            temp.next = new ListNode((l1.val + sum)%10);
            sum = (l1.val + sum)/10;
            l1 = l1.next;
            temp = temp.next;
        }

        //When l2 is longer
        while(l2 != null){
            temp.next = new ListNode((l2.val + sum)%10);
            sum = (l2.val + sum)/10;
            l2 = l2.next;
            temp = temp.next;
        }

        if(sum > 0){
            temp.next = new ListNode(sum);
        }

        return nodeSum.next;
    }
}
