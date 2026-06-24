package DSA.Employee Management System;

public class EmployeeSystem {

    static Employee[] employees=new Employee[10];
    static int count=0;

    static void add(Employee e){
        employees[count++]=e;
    }

    static void search(int id){

        for(int i=0;i<count;i++){

            if(employees[i].employeeId==id){
                System.out.println(employees[i].name);
                return;
            }
        }
    }

    static void traverse(){

        for(int i=0;i<count;i++)
            System.out.println(employees[i].name);
    }

    static void delete(int id){

        for(int i=0;i<count;i++){

            if(employees[i].employeeId==id){

                for(int j=i;j<count-1;j++)
                    employees[j]=employees[j+1];

                count--;
            }
        }
    }

    public static void main(String[] args){

        add(new Employee(1,"John"));
        add(new Employee(2,"David"));

        traverse();
    }
}
