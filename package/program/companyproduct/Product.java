 package companyproduct;
 import companydata.CompanyData;

 public class Product extends CompanyData {
	 
	 private String pname;
	 private int mdate;
	 private int exdate;
	 
	 public void setPName (String pname)
	 {
		 this.pname = pname;
	 }
	 public String getPName()
	 {
		 return this.pname;
	 }
	 public void setmDate(int mdate)
	 {
		 this.mdate = mdate;
	 }
	 public int getmDate() {
		 return this.mdate;
	 }
	 public void setexDate(int exdate)
	 {
		 this.exdate = exdate;
	 }
	 public int getexDate() {
		 return this.exdate;
	 }
	 
 }
 