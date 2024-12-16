import java.io.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class Employee implements Serializablef
{
String name;
int no;
Employee(String nm,int n)
{
name=nm;
no=n;
}
}
class SerializableDemo
{
public static void main(String args[])
{
Employee e1=new Employee("siri",92);
try
{
FileOutputStream f=new FileOutputStream("daddy.txt");
ObjectOutputStream o=new ObjectOutputStream(f);
o.writeObject(e1);
o.close();
f.close();
System.out.println("success");
}
catch(Exception e)
{
}
}
}