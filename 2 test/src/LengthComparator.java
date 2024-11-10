public class LengthComparator  implements NullSafeStringComparator{

    public  int compare(String s1, String s2){
        if(s1 == null && s2 != null){
            return -1;
        }else if(s1 != null && s2 == null){
            return 1;
        }else if(s1 == null && s2 == null){
            return 0;
        }
        int size1 = s1.length();
        int size2 = s2.length();
        if(size1 > size2){
            return 1;
        }else if(size1 < size2){
            return -1;
        }else{
            return 0;
        }
    }
//    public static String max(String[] a, NullSafeStringComparator sc) {
//        String maxStr = a[0];
//        for(int i = 0; ____________; i += 1) {
//            if (__________________________) {
//                _________________________;
//            }
//        }
//        return maxStr; } // 这里的括号是为了节省垂直空间
//

}
