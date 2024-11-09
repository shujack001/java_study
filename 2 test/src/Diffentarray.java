public class Diffentarray {
    public static void main(String[] argvs){
        Object[][] SIarray = new Object[2][];
       // SIarray[0] = new Integer[]; 会报错 不能这样初始化
        SIarray[0] = new Integer[3]; // 如果不输入实际值 就要输入数组大小
       // SIarray[0] = {1, 2, 3} 这样也不行 这只适用于 数组类型已知 或后面那样
        SIarray[0] = new Integer[]{1, 2, 3}; // 这样也行 直接赋值
        SIarray[1] = new String[2]; // 同理
        SIarray[1] = new String[]{"shu", "wen", "jie"};

        Object[][] SIarray2 = {{1, 2, 3, 4}, {"shu", "wen", "jie"}}; // 这样也行
    }
}
