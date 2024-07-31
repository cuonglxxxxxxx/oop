
package com.mycompany.vd1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Vd1 {


public static void main(String args[]) {
int n;
Scanner sc=new Scanner(System.in);
    System.out.println("Nhap kich thuoc cua mtr:");
n=sc.nextInt();
int c1=0;
int c2=n-1;int h1=0;int h2=n-1;
int [][] m=new int[n][n];
int cnt;
cnt=1;
if(n%2!=0){
    m[h2/2][c2/2]=n*n;
}
while(h1<=h2 && c1<c2){
for (int i=c1;i<c2;i++){
m[h1][i]=cnt;
cnt++;
}
for(int i=h1;i<h2;i++){
m[i][c2]=cnt;
cnt++;
}
for(int i=c2;i>c1;i--){
m[h2][i]=cnt;
cnt++;
}
for(int i=h2;i>h1;i--){
m[i][c1]=cnt;
cnt++;
}
h1++;
h2--;
c1++;
c2--;
}

for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
       System.out.printf(" %d ",m[i][j]);
   }
    System.out.println("\n");
}
}

}
