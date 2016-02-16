import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends AbstarctStudent
{
	public static void main(String[] arg)
	{
		Student Objst = new Student();
		Objst.enterdtls();
		Objst.totalmarks();
	}
	int sub1,sub2,sub3;
	void totalmarks()
	{
		System.out.println("Total Marks for Name-" + name +" Roll No-" + roll + " RegNo-" + regn+" Class-" + Class+" : " +(sub1+sub2+sub3));
	}
	void enterdtls()
	{
		BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Student Roll No : ");
			roll = Integer.parseInt(ins.readLine());
			System.out.println("Student Name : ");
			name = ins.readLine();
			System.out.println("Student Regn : ");
			regn = ins.readLine();
			System.out.println("Student Class : ");
			Class = Integer.parseInt(ins.readLine());
			System.out.println("Subject 1 Marks : ");
			sub1 = Integer.parseInt(ins.readLine());
			System.out.println("Subject 2 Marks : ");
			sub2= Integer.parseInt(ins.readLine());
			System.out.println("Subject 3 Marks : ");
			sub3= Integer.parseInt(ins.readLine());
			
		} catch(IOException e)
		{}
	}
}
