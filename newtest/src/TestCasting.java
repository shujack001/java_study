public class TestCasting {
    public static void main(String[] args) {
        // 动态类型是 BioBox，静态类型是 BioBox
        BioBox bb = new BioBox();

        // 强制类型转换：让编译器认为 bb 是 StandardBox
        StandardBox sb = (StandardBox) bb;

        // 调用 unlock 方法，传入 SkeletonKey
        SkeletonKey sk = new SkeletonKey();
        sb.unlock(sk); // 看运行结果
    }
}