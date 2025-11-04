// ps3_27.java
package com.ejercicios;
import java.util.*;

public class ps3_27 {
  static class Res { String matF,matM; double maxF,maxM,prom1,prom3,prom5,prom7; }
  public static Res resolver(int N,List<String> MAT,List<Integer> SEX,List<Integer> SEM,List<Double> PRO){
    Res r=new Res(); r.maxF=-1; r.maxM=-1;
    double s1=0,s3=0,s5=0,s7=0; int c1=0,c3=0,c5=0,c7=0;
    for(int i=0;i<N;i++){
      int sex=SEX.get(i), sem=SEM.get(i); double p=PRO.get(i);
      if(sex==0 && p>r.maxF){ r.maxF=p; r.matF=MAT.get(i); }
      if(sex==1 && p>r.maxM){ r.maxM=p; r.matM=MAT.get(i); }
      if(sem==1){ s1+=p; c1++; } else if(sem==3){ s3+=p; c3++; }
      else if(sem==5){ s5+=p; c5++; } else if(sem==7){ s7+=p; c7++; }
    }
    r.prom1 = c1==0?0:s1/c1; r.prom3=c3==0?0:s3/c3; r.prom5=c5==0?0:s5/c5; r.prom7=c7==0?0:s7/c7;
    return r;
  }
  public static void main(String[] args){
    // Deja este main para pruebas rápidas si gustas
  }
}
