static DoublyLinkedListNode2 sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode new_node= new DoublyLinkedListNode(data);
        if(head==null){
           head=new_node;
           return head;
         }

        else
        {
            DoublyLinkedListNode temp=head;
            DoublyLinkedListNode previous=head;
            while(temp.next!=null)
            {
                if(temp.data<data)
                {
                    temp=temp.next;
                    if(previous.next!=temp)
                       previous=previous.next;
                }
                   

                else
                {
                    new_node.next=previous.next;
                    previous.next=new_node;
                    new_node.prev=temp.prev;
                    temp.prev=new_node;
                    
                }
            }
            return head;
        }
          


    }