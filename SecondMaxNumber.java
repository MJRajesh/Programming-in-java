import java.io.*;
import java.util.*;
class secondmax{
    public static void main(String args[]){
        Scanner S = new Scanner (System.in);
        int x[] = new int[50];
        int i,j,temp;
        System.out.println("Enter no of Numbers: ");
        int num = S.nextInt();
        for(i=0;i<num;i++){
            x[i] = S.nextInt();
        }
        for(i=0;i<num;i++){
            for(j=0;j<i;j++){
                if(x[i]<x[j]){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;

                }
            }
        }
        for(i=0;i<num;i++){
            if(i==num-2){
                    System.out.print("Second Max : "+x[i]);
            }
            
        }
