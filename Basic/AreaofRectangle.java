import java.util.Scanner;

public class AreaofRectangle{
  
  public void Calculation(int length, int wide){
    int area = length * wide;
    System.out.println(area);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner();
    int length = sc.nextInt();
    int wide = sc.nextInt();
    
    AreaofRectangle obj = new AreaofRectangle();
    
    sc.close();
    
    obj.Calculation(length,wide);
  }
}
