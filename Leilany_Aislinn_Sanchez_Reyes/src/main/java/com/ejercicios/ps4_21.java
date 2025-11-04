// ps4_21.java
package com.ejercicios;

public class ps4_21 {
  public static class Res { double max; int diaMax,mesMax; double[] promMes; int mesPromMax; double valPromMax; }
  public static Res resolver(double[][] TEMP, boolean bisiesto){
    int[] DIAS={0,31,28,31,30,31,30,31,31,30,31,30,31};
    if(bisiesto) DIAS[2]=29;
    Res r=new Res(); r.max=-1e18; r.promMes=new double[13];
    for(int m=1;m<=12;m++){
      double s=0; for(int d=1; d<=DIAS[m]; d++){
        double t=TEMP[m][d];
        if(t>r.max){ r.max=t; r.diaMax=d; r.mesMax=m; }
        s+=t;
      }
      r.promMes[m]=s/DIAS[m];
    }
    r.mesPromMax=1; r.valPromMax=r.promMes[1];
    for(int m=2;m<=12;m++) if(r.promMes[m]>r.valPromMax){ r.mesPromMax=m; r.valPromMax=r.promMes[m]; }
    return r;
  }
  public static void main(String[] args){}
}
