

public class Calc {

		Calculat4 four1 = (a,b,c,d)-> (a+b+c+d);
		Calculat4 four2 = (a,b,c,d)-> (a-b-c-d);
		Calculat4 four3 = (a,b,c,d)-> (a*b*c*d);
		Calculat4 four4 = (a,b,c,d)-> (a/b/c/d);
		Calculat4 four5 = (a,b,c,d)-> (a%b%c%d);
		//three digit
		Calculat3 three1 = (a,b,c)-> (a+b+c);
		Calculat3 three2 = (a,b,c)-> (a-b-c);
		Calculat3 three3 = (a,b,c)-> (a*b*c);
		Calculat3 three4 = (a,b,c)-> (a/b/c);
		Calculat3 three5 = (a,b,c)-> (a%b%c);
		//two digit
		Calculat2 two1 = (a,b)-> (a+b);
		Calculat2 two2 = (a,b)-> (a-b);
		Calculat2 two3 = (a,b)-> (a*b);
		Calculat2 two4 = (a,b)-> (a/b);
		Calculat2 two5 = (a,b)-> (a%b);
		//one digit
		Calculat1 one1 = (a)-> (a*a);
		Calculat1 one2 = (a)-> (a*a*a);		
}