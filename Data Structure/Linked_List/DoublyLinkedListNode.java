static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        if(head==null){
           head.data=data;
           head.next=null;
           head.prev=null;
           return head;
         }

        else
        {
            DoublyLinkedListNode temp=head;
            while(temp!=null)
            {
                if(temp.data<data)
                   temp=temp.next;
                else
                {
                    DoublyLinkedListNode new_node;
                    new_node.prev = temp.prev;
                    DoublyLinkedListNode previous;
                    previous =new_node.prev;
                    previous.next = new_node;
                    new_node.data=data;
                    new_node.next=temp;
                    temp.prev=new_node;
                    return head;
                }
            }
        }
          


    }