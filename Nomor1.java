import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
      int jam, i;
      double honorLembur=0;

      Scanner scanner = new Scanner(System.in);

      jam = scanner.nextInt();

      for ( i = 1; i <= jam;i++){
        if (i >= 16) {
          jam-=16;

          if (jam > 0) {
            for (int j = 0; j < jam;j++)  {
              honorLembur += 15000;
            }
          }
        }
        honorLembur+= 10000;
        }
      System.out.println(honorLembur);
    }
}
