/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalc;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class GradeCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSub=scanner.nextInt();
        if(numSub<=0){
            System.out.println("Please enter a valid number of subjects:");
            return;
            
        }
        int totalMarks=0;
        int maxMarkPerSub=100;
        for(int i=1;i<=numSub;i++){
            System.out.println("Enter marks obtained in subject"+i+"(out of 100):");
            int marks=scanner.nextInt();
         
        if(marks<0||marks>maxMarkPerSub){
            System.out.println("Marks should be in the range of 0 to 100.Please enter valid marks.");
            i--;
        }
        else{
            totalMarks+=marks;
        }
        }
        double avgPercent=(double)totalMarks/(numSub*maxMarkPerSub)*100;
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+avgPercent+"%");
        
        String grade;
        
        if(avgPercent>=90){
            grade="A+";
        }
        else if(avgPercent>=80){
            grade="A";
        }
        else if(avgPercent>=80){
            grade="B";
        }
        else if(avgPercent>=70){
            grade="C";
        }
        else if(avgPercent>=50){
            grade="D";
        }
        else if(avgPercent>=40){
            grade="E";
        }
        else {
            grade="F";
        }
        System.out.println("Grade:"+grade);
    }
    
}
