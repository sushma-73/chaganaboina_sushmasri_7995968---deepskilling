package DSA.Task Management System;

public class TaskList {

    Task head;

    void add(int id,String name,String status){

        Task t=new Task(id,name,status);

        t.next=head;
        head=t;
    }

    void search(int id){

        Task temp=head;

        while(temp!=null){

            if(temp.taskId==id){
                System.out.println(temp.taskName);
                return;
            }

            temp=temp.next;
        }
    }

    void traverse(){

        Task temp=head;

        while(temp!=null){

            System.out.println(temp.taskName);

            temp=temp.next;
        }
    }

    void delete(int id){

        if(head.taskId==id){
            head=head.next;
            return;
        }

        Task temp=head;

        while(temp.next!=null){

            if(temp.next.taskId==id){

                temp.next=temp.next.next;
                return;
            }

            temp=temp.next;
        }
    }

    public static void main(String[] args){

        TaskList list=new TaskList();

        list.add(1,"Coding","Pending");
        list.add(2,"Testing","Done");

        list.traverse();
    }
}
