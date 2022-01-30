 static int GetNode(SinglyLinkedListNode head, int positionFromTail) {

      SinglyLinkedListNode p = head;
        SinglyLinkedListNode f = head;
        positionFromTail++;
        int i=1;
        while(i<=positionFromTail-1)
           f=f.next;
        while(f.next!=null)
        {
            f=f.next;
            p=p.next;
        }
        return (p.data);
   
}