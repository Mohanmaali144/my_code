package studentdata;
import java.io.*;

public class StudentData{
	
	private String name,course,fname,mname,branch,uv;
	private int sem,age,roll,year, physics,chemistry,math,hindi,english,total;
	private double per;
   
   
   public StudentData(String name,int roll,int physics,int chemistry,int math,int hindi,int english;)
   {
       this. name = name;
       this.roll = roll;
       this.physics = physics;
       this.chemistry = chemistry;
       this.math = math ;
       this.hindi = hindi;
       this.english = english;
       /* this.total = total;
       this.per = per; */
   }
   
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
   
    public int getPhysics() {
        return physics;
    }
    public void setPhysics(int physics) {
        this.physics = physics;
    }
    public int getChemistry() {
        return chemistry;
    }
    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getHindi() {
        return hindi;
    }
    public void setHindi(int hindi) {
        this.hindi = hindi;
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
}

