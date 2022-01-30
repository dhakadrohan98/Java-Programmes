static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if((head1==null)&&(head2==null))
           return null;
        else if((head1!=null)&&(head2==null))
           return head1;
        else if((head1 == null)&&(head2!=null))
           return head2;
        else if(head1.data<head2.data)
        {
            SinglyLinkedListNode temp = head1;
            while(temp.next!=null)
            {
            temp=temp.next;
            }
            temp.next=head2;
            head2=null;
            return head1;
        }

        else if(head1.data>head2.data)
        {
            SinglyLinkedListNode temp = head2;
            while(temp.next!=null)
            {
            temp=temp.next;
            }
            temp.next=head1;
            head1=null;
            return head2;
        }
        
    }
