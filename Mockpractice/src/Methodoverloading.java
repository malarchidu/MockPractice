
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b;
        a=10;
        b=20;
     int result=addNum(a,b);
     System.out.println(result);
         
	}
   public static int addNum(int x, int y){
	   int result=x+y;
	   return result;
   }
}
