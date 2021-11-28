public class Student_Marks {
    void studentmarks(int marks) throws ArithmeticException{ if(marks<0)
    {
        throw new ArithmeticException("Illegal Marks entered.");
    }
        if(marks<=40){ System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
    public static void main(String args[])
    {
        Student_Marks obj = new Student_Marks(); try
    {
        obj.studentmarks(-6);
    }
    catch (ArithmeticException ex)
    {
        System.out.println(ex.getMessage());
    }
    }

}
