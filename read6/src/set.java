import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args){
        Set<Integer> S = new HashSet<>();
        S.add(1);
        S.add(2);
        System.out.println(S.contains(1));
    }
}
