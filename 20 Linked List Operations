import java.util.*;
class main23454
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    LinkList l1=new LinkList();
    LinkList l2=new LinkList();
    boolean b=true;
    while(b)
    {
              System.out.println("Press 1 for Add First");
              System.out.println("Press 2 for Add Last");
              System.out.println("Press 3 to Add Before specific element");
              System.out.println("Press 4 to Add After specific element");
              System.out.println("Press 5 for Delete First");
              System.out.println("Press 6 for Delete Last");
              System.out.println("Press 7 for Display");
              System.out.println("Press 8 to replace element");
              System.out.println("Press 9 to display using recursion");
              System.out.println("Press 10 to display odd elements");
              System.out.println("Press 11 to display even elements");
              System.out.println("Press 12 to display i'th element from start");
             System.out.println("Press 13 to display in reverse ");
             System.out.println("Press 14 to insert in a sorted manner ");
             System.out.println("Press 15 to delete specific element");
             System.out.println("Press 16 to delete even position elements");
             System.out.println("Press 17 to delete odd position elements");
             System.out.println("Press 18 to find middle element");
             System.out.println("Press 19 to Insert at i'th position");
             System.out.println("Press 20 to Delete at i'th position");
              System.out.println("Press 21 to exit");
              int choice= sc.nextInt();
              switch(choice)
              {
                case 1:
                {
                    System.out.println("Enter element to Add first");
                    int data=sc.nextInt();
                    l1.addFirst(data);
                    System.out.println(":::::::::::::::::::::::::");
                    l1.display();
                    System.out.println(":::::::::::::::::::::::::");
                    break; 
                }
                case 2:
                {
                    System.out.println("Enter element to Add last");
                    int data=sc.nextInt();
                    l1.addLast(data);
                    System.out.println(":::::::::::::::::::::::::");
                     l1.display();
                     System.out.println(":::::::::::::::::::::::::");
                    break; 
                }
                case 3:
                {
                    System.out.println("Enter element to put  in linklist");
                    int a =sc.nextInt();
                    System.out.println("Enter element to be put above element before in linklist");
                    int pb =sc.nextInt();
                    l1.addBeforeElement(a, pb);
                    System.out.println(":::::::::::::::::::::::::");
                    l1.display();
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 4:
                {
                    System.out.println("Enter element to put  in linklist");
                    int a =sc.nextInt();
                    System.out.println("Enter element to be put above element after in linklist");
                    int pb =sc.nextInt();
                    l1.addAfterElement(a, pb);
                    System.out.println(":::::::::::::::::::::::::");
                    l1.display();
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 5:
                {
                       l1.deleteFirst();
                       System.out.println(":::::::::::::::::::::::::");
                       l1.display();
                       System.out.println(":::::::::::::::::::::::::");
                       break;
                }
                case 6:
                {
                       l1.deleteLast();
                       System.out.println(":::::::::::::::::::::::::");
                       l1.display();
                       System.out.println(":::::::::::::::::::::::::");
                       break;
                }
                case 7:
                {
                    System.out.println("Displaying LinkList");
                    l1.count();
                    System.out.println(":::::::::::::::::::::::::");
                    l1.display();
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 8:
                {
                    System.out.println("Enter element to put  in linklist");
                    int a =sc.nextInt();
                    System.out.println("Enter element to be replaced by above element in linklist");
                    int pb =sc.nextInt();
                    l1.replaceElement(a, pb);
                    System.out.println(":::::::::::::::::::::::::");
                    l1.display();
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 9:
                {

                    System.out.println("Displaying LinkList");
                    System.out.println(":::::::::::::::::::::::::");
                    l1.displayR();
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 10:
                {
                    System.out.println("Displaying odd elements");
                    System.out.println(":::::::::::::::::::::::::");
                    l1.displayOdd();
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 11:
                {
                    System.out.println("Displaying even elements");
                    System.out.println(":::::::::::::::::::::::::");
                    l1.displayEven();
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 12:
                {
                  System.out.println("Enter i'th element to be found");
                  System.out.println(":::::::::::::::::::::::::");
                  int ith=sc.nextInt();
                  System.out.println(":::::::::::::::::::::::::");
                 l1.displayITH(ith);
                          break;
                }
             
                case 13:
                {
                    System.out.println("Displaying elements in reverse");
                    System.out.println(":::::::::::::::::::::::::");
                    l1.reverseDisplay(l1.head);
                    System.out.println(":::::::::::::::::::::::::");
                    break;
                }
                case 14:
                {
                            boolean boo=true;
                        while(boo)
                        {
                            System.out.println("Press 1 to enter element");
                            System.out.println("Press 2 to display");
                            System.out.println("Press 3 to exit");
                            System.out.println(":::::::::::::::::::::::::");
                            int l=sc.nextInt();
                            System.out.println(":::::::::::::::::::::::::");
                            if(l==1)
                        {
                            System.out.println("Enter element");
                            System.out.println(":::::::::::::::::::::::::");
                            int x=sc.nextInt();
                            l2.sortedInsert(x);
                        }
                        else if(l==2)
                        {
                                l2.display();
                        }
                        else if(l==3)  
                        {
                        boo=false;
                        }
                        }
                        break;
                }
                case 15:
                {
                    System.out.println("Enter element you want to delete");
                    System.out.println(":::::::::::::::::::::::::");
                    int x=sc.nextInt();
                    System.out.println(":::::::::::::::::::::::::");
                    l1.deleteSpecific(x);
                    
                    
                    l1.display();
                    break;
                }
                case 16:
                {
                       l1.deleteEven();
                       System.out.println(":::::::::::::::::::::::::");
                       l1.display();
                       break;
                }
                case 17: 
                {
                    l1.deleteOdd();
                    System.out.println(":::::::::::::::::::::::::");
                    l1.display();
                    break;
                }
                case 18:
                {
                         System.out.println(":::::::::::::::::::::::::");
                         l1.findMiddle();
                         System.out.println(":::::::::::::::::::::::::");
                         break;
                }
                case 19:
                {
                    System.out.println("Enter index (Head is at index 0)");
                    System.out.println(":::::::::::::::::::::::::");
                    int i=sc.nextInt();
                    System.out.println("Enter value to input");
                    int x=sc.nextInt();
                    l1.insertAtIth(i, x);
                    System.out.println(":::::::::::::::::::::::::");
                    l1.display();
                    break;
                }
                case 20:
                {
                    System.out.println("Enter index (Head is at index 0)");
                    System.out.println(":::::::::::::::::::::::::");
                    int i=sc.nextInt();
                    System.out.println(":::::::::::::::::::::::::");
                    l1.displayR();
                    break;
                }
                case 21:
                {
                    b=false;
                    System.out.println("System Termination");
                    break;
                }
                
              }
     }
}
}
class node
{
      int data ;
      node next;
      node(int data)
      {
        this.data=data;
      }
}
class LinkList {
    Scanner sc=new Scanner(System.in);
    node head;

     void addFirst(int data)
     {
        node n=new node(data);
        if(head==null)
        {
               head=n;
        }
        else
        {
            n.next=head;
            head=n;
        }
     }
     void addLast(int data)
     {
         node n=new node(data);
             if(head==null)
             {
                head=n;
             } 
             else
             {
                node temp=head;
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    temp.next=n;
             }       
     }  
     void display()
    {
        if(head==null)
        {
            System.out.println("Link list is empty");
        }
        else
        {
            node temp=head;
            while(temp!=null){
                   System.out.println(temp.data);
                   temp=temp.next;
            }
        }
    }
    void deleteFirst()
    {
        if (head==null)
        {
       System.out.println("Link list is empty");
        }
        else{

            System.out.println(head.data + " is deleted");
            head=head.next;
        }
    }
    void deleteLast()
     {
        if (head==null)
        {
       System.out.println("Link list is empty");
        }
        else
        {
            node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
     }
     void addBeforeElement(int x , int value)
     {
        node tp=head;
        int ptr=0;
        while(tp!=null)
        {
             if(tp.data==value)
            {
                  ptr=1;             
            }
           tp=tp.next;
        }
        if(ptr==0)
        {
            System.out.println("No value such exists in linklist");
        }
        else
        {
            node n=new node(x);
            if(head.data==value)
            {
                    addFirst(x);
            }
            else
            {
                node temp=head;
                while(temp.next.data!=value)
                {
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
            }
        }
     }
     void addAfterElement(int x , int value)
     {
        node tp=head;
        int ptr=0;
        while(tp!=null)
        {
             if(tp.data==value)
            {
                  ptr=1;             
            }
           tp=tp.next;
        }
        if(ptr==0)
        {
            System.out.println("No value such exists in linklist");
        }
        else
        {
            node n=new node(x);
            if(head.data==value)
            {
                    n.next=head.next;
                    head.next=n;
            }
            else
            {
                node temp=head;
                while(temp.data!=value)
                {
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
            }
        }
     }
     void count()
     {
            if(head==null)
            {
            System.out.println("Link list is empty");
            }
            else
            { 
              int count=0;
              int evencount=0;
              int oddcount=0;
              node temp=head;
              while(temp!=null)
              { 
                if(temp.data%2==0)
                {
                    evencount++;

                }
                else
                {
                    oddcount++;
                }
                    temp=temp.next;
                   count++;
              }
              System.out.println("Number of elements in link list " + count); 
              System.out.println("Even elements " + evencount);                 
              System.out.println("Odd elements " + oddcount);                 
             }
     }
     void replaceElement(int x, int value)
     {
        if (head==null)
        {
            System.out.println("link list empty");
        }
else{
        node temp=head;
        while(temp.data!=value)
        {
            temp=temp.next;
        }
      temp.data=x;
     }
    }
    void displayR()
    {
        displayRecursion(head);
    }

    void displayRecursion(node temp)
    {
        if(temp==null)
    {
        System.out.println("Link List empty");
    }
    else
    {
            System.out.println(temp.data);
        
        displayRecursion(temp.next);
    }
    }
    void displayOdd()
    {
            if(head==null)
            {
                System.out.println("link list is empty");               
            }
            else
            { node temp=head;
                while(temp!=null)
                {
                    if(temp.data%2!=0)
                    {
                        System.out.println(temp.data);
                    }
                    temp=temp.next;
                    
                }
            }
    }
    void displayEven()
    {
            if(head==null)
            {
                System.out.println("link list is empty");               
            }
            else
            { node temp=head;
                while(temp!=null)
                {
                    if(temp.data%2==0)
                    {
                        System.out.println(temp.data);
                    }
                    temp=temp.next;
                }
            }
    }
    void displayITH(int x)
{
     if(head==null)
     {
      System.out.println("link list empty");
     }
     else
     {
        node temp=head;
        int count=0;
        while(temp!=null)
        {
             if(count==x)
             {
                System.out.println(temp.data);
             }
             if(count>x)
             {
                System.out.println("You have exceeded the link list length");
             }
             count++;
             temp=temp.next;
             
        }
     }
}
void reverseDisplay(node head)
{
    if(head==null)
    {
        System.out.println("Link list empty");
    }
    else
    {
     reverseDisplay(head.next);
     System.out.println(head.data);
    }
}
    void sortedInsert(int x)
    {
     if(head==null)
    {
        addFirst(x);
    }
    else 
    {
        if(x<head.data) 
        {
            addFirst(x);
        }
        else 
        {
            node temp=head;
            node n=new node(x);
            while(temp.next!=null && temp.next.data<x)
            {
                  temp=temp.next;     
            }
            if(temp.next==null) 
            {
                addLast(x);
            }
             n.next=temp.next;
             n=temp.next;
        }
    }
    }
    void deleteSpecific(int x) 
    {
       if(head==null) 
       {
        System.out.println("Link list empty ");
       }
       else 
       {
        node t=head;
        int ptr=0;
        while(t!=null) 
        {
            if(t.data==x)
            {
                ptr=1;
            }
            t=t.next;
        }
        if(ptr==0)
         {
               System.out.println("Value does not exist");
        }
        else 
        {
            if(head.data==x) 
            {
            deleteFirst();
            }
            else
            {
                node temp=head;
                while(temp.next.data!=x) 
                {
                       temp=temp.next;
                }
               temp.next=temp.next.next;
               
            }
        }
       }
    }
    void deleteEven()
    {
        if(head==null)
        {
            System.out.println("Link list empty");
        }
        else
         {
             node temp=head;
             while(temp!=null && temp.next!=null) 
             { 
                 temp.next=temp.next.next;
                 temp=temp.next;
             }
         }
    }
 void deleteOdd() 
 {
    if(head==null) 
    {
         System.out.println("Link list empty");
    }
    else 
    {
         node temp=head.next;
         while(temp!=null && temp.next!=null) 
         { 
             temp.next=temp.next.next;
             temp=temp.next;
         }
         deleteFirst();
    }
 }
 void findMiddle()
 {
      if(head==null)
      {
        System.out.println("Link list empty");
      }
      else
      {
        node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
      
            node t=head;
           for(int i=0 ; i!=(count/2)-1 ; i++)
           {
             t=t.next;
           }
           if(count%2==0)
           {

               System.out.println(t.data);
            }
            else
            {
               System.out.println(t.next.data);
           }
        

      }
 }
void insertAtIth(int i,int x) 
{
    node temp=head;
    int count=0;
    while(temp!=null)
    {
        count++;
        temp=temp.next;
    }
    
    if(count<i)
    {
        System.out.println("Entered index does not exist");
    }
    else
    {

        if(i==0)
        {
            addFirst(x);
        }
        else
        {
            node n=new node(x);
            node t=head;
            int c=0;
            while(c!=(i-1))
            {
                t=t.next;
                c++;
            }
            if(c==(i-1))
            {
                n.next=t.next;
                t.next=n;
            }
        }
    }
    }
void deleteAtITH(int i)
{
    if(head==null)
    {
        System.out.println("Link list empty");
    }
    else{

        node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count<i)
        {
            System.out.println("Entered index does not exist");
        }
        else
        {

            if(i==0)
            {
                deleteFirst();
            }
          
        }
    }
}

}//class SLL
