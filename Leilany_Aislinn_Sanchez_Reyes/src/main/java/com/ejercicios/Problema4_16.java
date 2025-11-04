// Problema4_16.java
package com.ejercicios;
import java.util.*;

public class Problema4_16 {
  public static long[] construirB(long[][] A,int M,int N){
    long[] B=new long[M+1];
    for(int i=1;i<=M;i++){
      long s=0;
      if(i%2==0) for(int j=1;j<=N;j++) s+=A[i][j]*A[i-1][j];
      else       for(int j=1;j<=N;j++) s+=A[i][j];
      B[i]=s;
    }
    return B;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt(), N=sc.nextInt();
    long[][] A=new long[M+1][N+1];
    for(int i=1;i<=M;i++) for(int j=1;j<=N;j++) A[i][j]=sc.nextLong();
    long[] B=construirB(A,M,N);
    for(int i=1;i<=M;i++) System.out.print(B[i]+(i<M?" ":"\n"));
  }
}
