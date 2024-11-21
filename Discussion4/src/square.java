public class square {
    public static void fillGrid(int[] LL, int[] UR, int[][] S){
        int N = S.length;
        int kL, kR;
        kL = kR = 0;
        int zero = 0;
        for (int i = 0; i < N; i += 1){
            for(int j = 0; j < N; j++){
                if(j == zero){
                    continue;
                }else if(j < zero){
                    S[i][j] = LL[kL];
                    kL += 1;
                }else{
                    S[i][j] = UR[kR];
                    kR += 1;
                }
            }
            zero += 1;
        }
    }
    public static void main(String[] args){
        int[] LL = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0 };
        int[] UR = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[][] S = {
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0}
        };
        fillGrid(LL, UR, S);
        System.out.println(1);
    }
}
