package companycustomer;
import companyproduct.Product;


public class Customer extends Product {
	
		private String name;
		private String address;
		private String gender;
		private String phon_num;
		

		public void setName(String name)
		{
			this.name = name;
		}
		public String getName()
		{
			return this.name;
		}

		public void setAddress(String address)
		{
			this.address =address;
		}
		public String getAddress()
		{
			return this.address;
		}	
		public void setPhonNum(String phon_num)
		{
			this.phon_num = phon_num;
		}
		public String getPhonNum()
		{
			return this.phon_num;
		}	
		
		public void setGender(String gender)
		{
			this.gender = gender;
		}
		public String getGender()
		{
			return this.gender;
		}
}