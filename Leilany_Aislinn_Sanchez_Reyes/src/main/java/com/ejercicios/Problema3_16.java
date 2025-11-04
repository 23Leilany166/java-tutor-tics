// Problema3_16.java
package com.ejercicios;
import java.util.*;

public class Problema3_16 {
  public static Map<String,Object> resolver(int[][] V, int N){
    int[] tipo = new int[6];     // 1..5
    int[] tot  = new int[N+1];   // 1..N
    for(int i=1;i<=N;i++)
      for(int j=1;j<=5;j++){ tipo[j]+=V[i][j]; tot[i]+=V[i][j]; }

    int anioMax=1, max2=V[1][2];
    for(int i=2;i<=N;i++) if(V[i][2]>max2){max2=V[i][2]; anioMax=i;}

    List<Integer> sin3 = new ArrayList<>();
    for(int i=1;i<=N;i++) if(V[i][3]==0) sin3.add(i);

    Map<String,Object> r=new HashMap<>();
    r.put("tipo",tipo); r.put("tot",tot);
    r.put("anioMaxTipo2",anioMax); r.put("maxTipo2",max2); r.put("sinTipo3",sin3);
    return r;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt(); int[][] V=new int[N+1][6];
    for(int i=1;i<=N;i++) for(int j=1;j<=5;j++) V[i][j]=sc.nextInt();
    var r = resolver(V,N);
    System.out.println(r.get("anioMaxTipo2")+" "+r.get("maxTipo2"));
    System.out.println(r.get("sinTipo3"));
  }
}
