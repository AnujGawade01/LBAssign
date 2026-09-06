// LB Assignment 69 (65)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . A hospital receives patients with severity levels:

Rahul 2
Amit 5
Pooja 1
Neha 4

Higher severity should be treated first.

Expected order:

Amit
Neha
Rahul
Pooja

Create a Patient class containing:

String name;
int severity;

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB342
{
    public static void main(String A[])
    {
        Patient P1 = new Patient("Rahul",2);
        Patient P2 = new Patient("Amit",5);
        Patient P3 = new Patient("Pooja",1);
        Patient P4 = new Patient("Neha",4);

        ArrayList <Patient> aobj = new ArrayList <Patient> ();

        aobj.add(P1);
        aobj.add(P2);
        aobj.add(P3);
        aobj.add(P4);

        Collections.sort(aobj, new Comparator<Patient>()
        {
            public int compare(Patient p1, Patient p2)
            {
                if(p1.severity != p2.severity)
                {
                    return p2.severity - p1.severity; 
                }

                return p1.name.compareTo(p2.name);
            }
        });

        for(Patient p : aobj)
        {
            System.out.println(p);
        }
    }
}

class Patient
{
    public String name;
    public int severity;

    public Patient(String a, int b)
    {
        this.name = a;
        this.severity = b;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}

