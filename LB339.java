// LB Assignment 68 (64)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Student data is :

Amit  78
Pooja 92
Rahul 85
Neha  92
Kiran 67

Create a student class and display students according to descending marks.
If two students have equal marks, sort them alphabetically.

Expected Output: 

Neha  92
Pooja 92
Rahul 85
Amit  78
Kiran 67 

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB339
{
    public static void main(String A[])
    {
        Student S1 = new Student("Amit",78);
        Student S2 = new Student("Pooja",92);
        Student S3 = new Student("Rahul",85);
        Student S4 = new Student("Neha",92);
        Student S5 = new Student("Kiran",67);

        ArrayList <Student> aobj = new ArrayList <Student> ();

        aobj.add(S1);
        aobj.add(S2);
        aobj.add(S3);
        aobj.add(S4);
        aobj.add(S5);

        Collections.sort(aobj, new Comparator<Student>()
        {
            public int compare(Student s1, Student s2)
            {
                if(s1.marks != s2.marks)
                {
                    return s2.marks - s1.marks; 
                }

                return s1.name.compareTo(s2.name);
            }
        });

        for(Student s : aobj)
        {
            System.out.println(s);
        }
    }
}

class Student
{
    public String name;
    public int marks;

    public Student(String a, int b)
    {
        this.name = a;
        this.marks = b;
    }

    @Override
    public String toString()
    {
        return this.name+" "+this.marks;
    }
}