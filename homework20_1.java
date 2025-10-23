/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
public class homework20_1
{
   public static void main(String[] args)
   {
      //add your code here
      int[] exVals1 = {1,2,3,3,5};
      int[] exVals2 = {1,1,1,2,3};
      //int[] exVals3 = new int[100];
      
      for(int i = 0; i<exVals3.length;i++){
         exVals3[i] = i%10;
      }
      ExchangeSort(exVals3);

      LinkedList llist = new LinkedList();
      llist.head = new ListNode(exVals1[0]);

      ListNode head = llist.head;
      for(int i = 1; i<exVals1.length; i++){
         head.next = new ListNode(exVals1[i]);
         head = head.next;
      }

      System.out.println(llist);
      deleteDuplicates(llist);
      System.out.println(llist);


      llist.head = new ListNode(exVals2[0]);
      head = llist.head;
      for(int i = 1; i<exVals2.length; i++){
         head.next = new ListNode(exVals2[i]);
         head = head.next;
      }
      System.out.println(llist);
      deleteDuplicates(llist);
      System.out.println(llist);
      /*
      llist.head = new ListNode(exVals3[0]);
      head = llist.head;
      for(int i = 1; i<exVals3.length; i++){
         head.next = new ListNode(exVals3[i]);
         head = head.next;
      }
      System.out.println(llist);
      deleteDuplicates(llist);
      System.out.println(llist);
      */
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      //add your code here
      ListNode prev = llist.head;
      ListNode node = new ListNode(0);
      if(prev.next!=null){
         node = prev.next;
      }
      else{
         return;
      }


      if(prev.value==node.value){
         prev.next = node.next;
      }
      while(prev.next!=null){
         if(prev.value==node.value){
            prev.next = node.next;
         }
         else{
            prev = prev.next;
         }
         node = node.next;
      }
   }
   public static void ExchangeSort(int[] arr){
      for(int i = 0; i<arr.length-1;i++){
         for(int j = i+1; j<arr.length;j++){
            if(arr[i]>arr[j]){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
   }
}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
