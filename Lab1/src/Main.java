public class Main {
    public static void main(String[] args) {
        int[] A= {5,2,4,6,1,3};
        //INSERTION_SORT(A);
        SELECTION_SORT(A);
        System.out.printf("A= ");
        for(int i=0;i<A.length;i++)
            System.out.printf(A[i] + " ");
        System.out.println("\nEuclid" + " " + EUCLID(102,18));
        System.out.println("\nFibonacci: " + FIBO_I(4));
        System.out.println("\nFibonacci: " + FIBO_R(4));
        int[][] A1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B1 = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] C = new int[3][3];
        C = PRODUS(A1, B1);
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++)
                System.out.print(C[i][j] + " ");
            System.out.println(" ");
        }
        System.out.println("\nRUSSE " + RUSSE(52,15));

    }
    public static void INSERTION_SORT(int[] A){
        int key, i,j;
        for(j=1;j<A.length;j++){
            key=A[j];
            i=j-1;
            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i--;
            }
            A[i+1]=key;
        }
    }

    public static void SELECTION_SORT(int[] A){
        int minj,minx, i,j,n;
        n=A.length;
        for(i=0;i<n-1;i++){
            minj=i;
            minx=A[i];
            for(j=i+1;j<n;j++){
                if(A[j]<minx){
                    minj=j;
                    minx=A[j];
                }
            }
            A[minj]=A[i];
            A[i]=minx;
        }
    }

    public static int EUCLID(int m, int n){
        int temp;
        while(n!=0){
            temp=n;
            n=m%n;
            m=temp;
        }
        return m;
    }

    public static int FIBO_R(int n){
        if(n<2)
            return n;
        else return FIBO_R(n-1)+FIBO_R(n-2);
    }

    public static int FIBO_I(int n){
        int i=0, j=1, s=1;
        for(int k=0;k<n;k++){
            i=j;
            j=s;
            s=i+j;
        }
        return i;
    }

    public static int[][] PRODUS(int[][] A, int[][] B){
        int m=A.length,n=A[0].length,p=B[0].length;
        int[][] C = new int[n][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<n;k++){
                    C[i][j] = C[i][j] + A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }

    public static int RUSSE(int a, int b){
        int X[] = new int[50];
        int Y[] = new int[50];
        int i;
        X[1]=a; Y[1]=b;
        i=1;
        while(X[i]>=1){
            X[i+1]=X[i]/2;
            Y[i+1]=Y[i]+Y[i];
            i=i+1;
        }
        int prod=0;
        while(i>=0){
            if(X[i]%2==1)
                prod=prod+Y[i];
            i=i-1;
        }
        return prod;
    }
}