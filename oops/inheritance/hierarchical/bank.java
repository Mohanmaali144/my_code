import java.util.Scanner;

class Bank
{
	String accNum,holderName,ifsc,type;

    public String getAccNum() {
        return this.accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getIfsc() {
        return this.ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		
		this.type = type;
	}
}

class SBI extends Bank
{
	String locker;
	String cifNum;
	public SBI()
	{
		this.locker = "";
		this.cifNum = "";
	}
	
	public SBI(String locker,String cifNum)
	{
		this.locker = locker;
		this.cifNum = cifNum;
	}
}
class BOI extends Bank
{
	String 
}
