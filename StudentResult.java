import java.util.Scanner;
class StudentResult //SubClass
{
	String generate(float per)
	{
		if(per>=70 && per<=100)
		{
			return "Distinction";
		}
		else if(per>=60 && per<70)
		{
			return "FirstClass";
		}
		else if(per>=50 && per<60)
		{
			return "SecondClass";
		}
		else if(per>=35 && per<50)
		{
			return "ThirdClass";
		}
		else
		{
			return "Fail";
		}
	}
}
class DemoMethods6 //MainClass 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Marks of Sub1:");
		int s1 = s.nextInt();
        System.out.println("Enter Marks of Sub2:");
		int s2 = s.nextInt();
        System.out.println("Enter Marks of Sub3:");
		int s3 = s.nextInt();
        System.out.println("Enter Marks of Sub4:");
		int s4 = s.nextInt();
        System.out.println("Enter Marks of Sub5:");
		int s5 = s.nextInt();
        System.out.println("Enter Marks of Sub6:");
		int s6 = s.nextInt();
		if((s1>=0 && s1<=100) && (s2>=0 && s2<=100) &&
			(s3>=0 && s3<=100) && (s4>=0 && s4<=100) &&
			(s5>=0 && s5<=100) && (s6>=0 && s6<=100))
		{
			int totMarks = s1+s2+s3+s4+s5+s6;
			float per = (float)totMarks/6;
			StudentResult sr = new StudentResult();
			String result = sr.generate(per);
			System.out.println("===StudentResult===");
			System.out.println("Totmarks:"+totMarks);
			System.out.println("Percentage:"+per);
			System.out.println("Result:"+result);
		}//end of 
		else
		{
			System.out.println("Invalid Marks...");
		}

	}
}
