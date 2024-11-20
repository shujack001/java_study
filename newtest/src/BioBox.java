public class BioBox extends  StandardBox {
    @Override
    public void unlock(Key k) {
        System.out.println("UK: BioBox.unlock(Key)");
    }

    public void unlock(SkeletonKey sk) {
        System.out.println("USK: BioBox.unlock(SkeletonKey)");
    }
}
