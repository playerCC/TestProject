import java.io.File;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        /*String s = null;
        s.concat("abc");*/
        if(new File("d:/abc.txt").exists()){
            System.out.println("aaaa");
        }
    }

    private static TreeSet<Integer> hebin(int[] A,int[] B){
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : A) {
            set.add(i);
        }
        for (int i : B) {
            set.add(i);
        }
        return set;
    }
}
