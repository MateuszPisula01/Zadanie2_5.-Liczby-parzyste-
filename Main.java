import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     int liczba = 0;
 System.out.print("Liczby parzyste do 100: ");
 for(int i = 1;i<=101;i++)
 {
 if(liczba%2==0){
 System.out.print(liczba+", ");
}
 liczba++;
  }
}
}