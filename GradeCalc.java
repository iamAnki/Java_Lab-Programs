
import java.util.Scanner;    
public class GradeCalc
{
   public static void main(String[] args)
   {
      int  score;    
      char grade;   

     
      Scanner console = new Scanner(System.in);

     
      System.out.print("Enter your numeric test score : ");
      score = console.nextInt();

     
      if (score >= 90)
      {
         grade = 'O';
      }
      else if (score >= 80)
      {
         grade = 'E';
      }
      else if (score >= 70)
      {
         grade = 'A';
      }
	  else if (score >=60)
	  {
		  grade = 'B' ;
	  }
      else if (score >= 50)
      {
         grade = 'C';
      }
	  else if (score >=40)
	  {
		  grade = 'D' ;
	  }
      else
      {
         grade = 'F';
      }

      System.out.println("Your grade is " + grade);
   }
}