
class Operation {
    
    public void prime(int n){
    int i;
    for( i=2;i<n;i++)
    {
        if(n%i==0){
            break;
        }
    }
    if(i==n)
    {
        System.out.println("Prime number");
    }
    else
    {
        System.out.println("Not Prime number");
    }
}
}
