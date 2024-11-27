import java.util.ArrayList;
import java.util.List;

public class IterableUtils {
    public static <T> List<T> toList(Iterable<T> iterable) {
        // 填写代码
        List<T> returnlist = new ArrayList<>();
        for(T item : iterable){
            if(item == null){
                throw new IllegalArgumentException("null illegal");
            }
            returnlist.add(item);
        }
        return returnlist;
    }
}
