import java.util.*;
class Matrix1{
int A[][]=new int[2][2];
int B[][]=new int[2][2];

Scanner sc=new Scanner(System.in);
void put()
{
System.out.println("Enter the elements of 1st matrix");
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			A[i][j]=sc.nextInt();
				    }
				}
		
System.out.println("Enter the elements of 2nd matrix");
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			B[i][j]=sc.nextInt();
				    }
				}
		

}
void get()
{
System.out.println(" 1st matrix:");
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.print(A[i][j]+" ");
			System.out.println();
				    }
				}
		

System.out.println("2nd matrix:");
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.print(B[i][j]+" "+"\n");
			System.out.println();
				    }
				}
		}



}

class Matrix{
public static void main(String args[])
{
Matrix1 M=new Matrix1();
M.put();
M.get();

}
}