package marksheetpojo1;

public class Pojo
{
	private String name,course,fname,mname,branch,uv;
	private int sem,age,roll,year, physics,chemistry,math,hindi,english,total,n;
	private double per;
   
   public Pojo(String name,String course,String fname,String mname,String branch,String uv,int sem,int age,int roll,int year,int physics,int chemistry,int math,int hindi,int english,int total, double per,int n )
   {
       this. name = name;
       this.course = course;
       this.fname = fname;
       this.mname = mname;
       this.branch = branch;
       this.uv = uv;
       this.sem = sem;
       this.age = age;
       this.roll = roll;
       this.year = year;
       this.physics = physics;
       this.chemistry = chemistry;
       this.math = math ;
       this.hindi = hindi;
       this.english = english;
       this.total = total;
       this.per = per;
	   this.n = n;
	   
	   //Pojo.saeData();
   }
   
   
  
         

   
   
   
   
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getUv() {
        return uv;
    }
    public void setUv(String uv) {
        this.uv = uv;
    }
    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
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
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getPer() {
        return per;
    }
    public void setPer(double per) {
        this.per = per;
    }
	public int getN()
	{
		return this.n;
	}
	public void setN(int n)
	{
		this.n = n;
	}
}