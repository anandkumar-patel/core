package anand.learn;


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class Solution {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		
		ListNode l2 = new ListNode(1);
		
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
		Solution obj = new Solution();
		ListNode result = obj.addTwoNumbers(l1,l2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = getInt(l1);
        int num2 = getInt(l2);
        int sum = num1+num2;
        System.out.println("num1 : "+ num1);
        System.out.println("num2 : "+ num2);
        System.out.println("sum : "+ sum);
        ListNode result = getList1(sum);
        return result;
    }

    public int getInt(ListNode root) {
        ListNode temp = root;
        int dec =1;
        int digit = 0;
        while(temp != null) {
            digit = dec * temp.val+digit;
            dec = dec *10;
            temp = temp.next;
        }
        return digit;
    }

   
    public ListNode getList1(int num) {
    	System.out.println("number is :"+ num);
        ListNode root = null;
        ListNode temp = null;
        if(num ==0) {
            return new ListNode(0);
        }
        while(num !=0) {
            if(root == null) {
                root = new ListNode(num%10);
                temp = root;
            } else {
                ListNode node = new ListNode(num%10);
                temp.next = node;
                temp = temp.next;
            }
            num = num/10;
        }
        return root;
    }
}