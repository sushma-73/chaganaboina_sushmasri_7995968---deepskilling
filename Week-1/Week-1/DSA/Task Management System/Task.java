package DSA.Task Management System;

public class Task {

    int taskId;
    String taskName;
    String status;

    Task next;

    public Task(int id,String name,String status){
        taskId=id;
        taskName=name;
        this.status=status;
    }
}
