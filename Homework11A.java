import java.util.ArrayList;

public class Homework11A extends Homework11 {
  private ArrayList<Integer> arrMatey;
    public Homework11A() {
      arrMatey = new ArrayList<Integer>();
    }
    public int problem4() {
   int sum = 0;
   for (int i : arr) {
     sum += i;
   }
   return sum;
 }

    public void problem2(int n) {
  		int run = 0;
  		while (run < arr.size()) {
  			int nu = arr.get(run);
          if ((n % nu) != 0) {
            arr.remove(run);
          }else {
            run++;
          }
  			}
  		}
  	}
