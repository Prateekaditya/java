public class HollowRectangle{
    public static void pattern(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void invertedPyramidhalf(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
        
    public static void invertedPyramidhalfnumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            
            System.out.println();}
        }
    public static void floydtriangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void traingle01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n){
        for(int  i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j== 1 || j==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void numberpyramiid(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(+k+" ");
            }
            k++;
            System.out.println();
        }

    }
    public static void palindromic(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // pattern(7,7);
        // invertedPyramidhalf(7);
        // invertedPyramidhalfnumber(7);
        // floydtriangle(6);
        // traingle01(5);
        // butterfly(8);
        // solidRhombus(5);
        // hollowRhombus(5);
        // diamond(4);
        // numberpyramiid(5);
        palindromic(5);
    }
}