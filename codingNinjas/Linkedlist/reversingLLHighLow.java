class Node
{
    public:
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
};


public class reversingLLHighLow {
    public static Node reverseLL(Node head, int low, int high) {
        // Write your code here.

        if(head==null || head.next==null||high<low ||high ==low){
            return head;
        }
       
        Node prev = null, current = head, next = null;
        for(int i=1 ;i<low;i++){
            prev= current;
            current = current.next;
        }
        Node beforelow = prev, atlow = current;
        prev = null;
        for(int i=low;i<=high;i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;


        }
        if(beforelow!=null){
            beforelow.next = prev;

        }
        else{
            head =prev;
        }
        
        atlow.next = current;
        
        return head;

        
    }
}
