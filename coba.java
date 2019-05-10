/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static gui.ADILA_06111840000092_TUGAS2.faktorial;

/**
 *
 * @author ASUS
 */
public class coba {
   public static void main (String []args){
       double a=1;
       double n=3;
       double x=2;
        double [] p = new double[10001];
        double es = 0.5*Math.pow(10,2-n);
        double q=0, c=0,s=0;
        p[0] = Math.sin(Math.toRadians(2*x));
         for (int i=1;i<=10000;i++){
            double c1 = (Math.pow(-1,i+1))*(Math.pow(2,(2*i)-1));
            double c2 = (Math.cos(Math.toRadians((2*x)*(Math.pow(x-a,i+1)))));
            double s1 = ((Math.pow(-1,i))*(Math.pow(2,(2*i)-2)));
            double s2 = (Math.sin(Math.toRadians((2*x)*(Math.pow(x-a,i+2)))));
            
                if(i%2==0){
                    s = (s1*s2)/(faktorial(i));
                }else{
                    c = (c1*c2)/(faktorial(i));
                }
            
            
            p[i] = p[0]+c+s;
            double ea = ((p[i]-p[i-1])/p[i])*100;
            if (Math.abs(ea)<(es)){
                 q += p[i];
                 System.out.println(i);
                 break;
            }
          }
          System.out.println(q);
    }
    
    public static int faktorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}
