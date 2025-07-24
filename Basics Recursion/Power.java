public class Power {
    
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static int powerOpt(int x ,int n){
        if(n==0){
            return 1;
        }
        int halfPower= powerOpt(x, n/2);
        int halfPowerSq=halfPower * halfPower;
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }
    //if is n is negative you have to do differently a bit
    public static void main(String[] args){
        int x=2;
        int n=10;
        System.out.println(powerOpt(x, n));
    }
}
