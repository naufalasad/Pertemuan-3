import java.util.*;
public class membuat_piramida{
public static void main (String[]yanuar){

  
Scanner sc=new Scanner(System.in);
System.out.print ("masukan jumlah  baris :");
int masukan=sc.nextInt();
//atas
for (int i=1; i<=masukan; i++){
  for (int j=i; j<=masukan; j++){
    System.out.print("*");
    }
    for (int k=0; k<=(i*2)-2; k++){ 
      System.out.print ("-");
    }
    int j=1;
    for ( j=i; j<=masukan; j++){
    System.out.print("*");
    }
    System.out.println(" ");
}
//bawah
for (int i=(masukan-1);i!=0;i--){
  for (int j=i; j<=masukan; j++){
    System.out.print("*");
    }
    for (int k=0; k<=(i*2)-2; k++){
      System.out.print ("-");
    }
    int j=1;
    for (j=i; j<=masukan; j++){
    System.out.print("*");
    }
    System.out.println(" ");
}
}
}
