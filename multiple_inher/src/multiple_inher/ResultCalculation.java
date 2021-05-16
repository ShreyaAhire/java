package multiple_inher;

import java.io.*;
import java.util.*;

interface Exam
{
	public void percent_cal();	
}
class Student
{
	String name;
	int roll_no;
	double marks1;
	double marks2;
	double marks3;

	Student(String name, int roll_no,double marks1,double marks2,double marks3)
	{
	this.name=name;
	this.roll_no=roll_no;
	this.marks1=marks1;
	this.marks2=marks2;
	this.marks3=marks3;
	}

}

class Result extends Student implements Exam
{
	double average;
	double percent;
	Result(String name, int roll_no,double marks1,double marks2,double marks3 )
	{
		super(name,roll_no,marks1,marks2,marks3);
		average=0;
		percent=0;
	}
	
	public void percent_cal()
	{
		average=(marks1+marks2+marks3);
		percent= average/300*100;
		System.out.println("Percent:"+percent);				
	}
}

public class ResultCalculation {

	public static void main(String[] args) 
	{
		
		String name;
		int prn;
		double marks1;
		double marks2;
		double marks3;
		double average;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name of student:");
		name= sc.next();
		System.out.println("Enter Roll number of student:");
		prn=sc.nextInt();
		System.out.println("Enter marks of 1st subject:");
		marks1=sc.nextDouble();
		System.out.println("Enter marks of 2nd subject:");
		marks2=sc.nextDouble();
		System.out.println("Enter marks of 3rd subject:");
		marks3=sc.nextDouble();
		
		Result obj= new Result(name,prn,marks1,marks2,marks3);
		obj.percent_cal();
	}

}
