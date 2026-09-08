// LB Assignment 70 (66)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Group Employees Department Wise

Employee records:

Amit  IT
Rahul HR
Pooja IT
Neha  Finance
Kiran HR
Riya  IT

Expected output:

IT:
Amit
Pooja
Riya

HR:
Rahul
Kiran

Finance:
Neha

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB347
{
    public static void main(String A[]) 
    {
        ArrayList <Employee> employees = new ArrayList <Employee> ();

        employees.add(new Employee("Amit", "IT"));
        employees.add(new Employee("Rahul", "HR"));
        employees.add(new Employee("Pooja", "IT"));
        employees.add(new Employee("Neha", "Finance"));
        employees.add(new Employee("Kiran", "HR"));
        employees.add(new Employee("Riya", "IT"));

        LinkedHashMap <String, List<String>> departmentGroup = new LinkedHashMap <String, List<String>> ();

        for (Employee emp : employees) 
        {
            if (!departmentGroup.containsKey(emp.department)) 
            {
                departmentGroup.put(emp.department, new ArrayList<>());
            }

            departmentGroup.get(emp.department).add(emp.name);
        }

        for (Map.Entry<String, List<String>> entry : departmentGroup.entrySet()) 
        {
            System.out.print(entry.getKey() + ": \n");
            
            List <String> names = entry.getValue();
            for (int i = 0; i < names.size(); i++) 
            {
                System.out.print(names.get(i));
                if (i < names.size() - 1) 
                {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}

class Employee 
{
    public String name;
    public String department;

    public Employee(String name, String department) 
    {
        this.name = name;
        this.department = department;
    }
}