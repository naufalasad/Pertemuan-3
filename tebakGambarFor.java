import java.util.*;
public class tebakGambarFor {
  public static void main (String [] naufal){
  Scanner masukan=new Scanner (System.in);

  int gambar=0;
  int angka=0;
  System.out.println("No."+"\t|  HASIL LEMPARAN");
  System.out.println("--------------------------");

  for (int i=1;i<=12;i++){
  int bilRandom=(int)(Math.random()+0.5);

  if (bilRandom>=1){
    System.out.println(i+"\t|\t Gambar");
    gambar+=1;
  }
  else{
    System.out.println(i+"\t|\t Angka");
    angka+=1;
  }
  }
 System.out.println("--------------------------");
 System.out.println("SKOR GAMBAR :"+gambar);    
 System.out.println("SKOR ANGKA  :"+angka);
 
 if (angka==gambar){
    System.out.println("SERI"); 
  }
  else{
    if (angka<gambar){
    System.out.println("GAMBAR MENANG");
    }
    else{
    System.out.println("ANGKA MENANG");}
  }
  }
}