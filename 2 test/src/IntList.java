public class IntList {
    public int first;  // 当前节点的值
    public IntList rest;  // 指向下一个节点的引用

    // 构造函数，用于创建一个包含数字 f 的节点，rest 是下一个节点
    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
    }
    public static IntList list(int ...values){
        if(values.length == 0){
            return null;
        }
        IntList result = new IntList(values[0], null);
        IntList temp = result;
        for(int i = 1; i < values.length; i++){
            temp.rest = new IntList(values[i], null);
            temp = temp.rest;
        }

        return result;
    }

    // 计算列表的大小
    public int size() {
        int size = 0;
        IntList current = this;
        while (current != null) {
            size++;
            current = current.rest;
        }
        return size;
    }

    // 向列表添加元素，超过 3 个元素时，移除第一个元素
    public void dreaming(int n) {
        // 如果列表为空，直接添加第一个元素
        if (this.size() == 0) {
            this.first = n;
            this.rest = null;
        } else {
            IntList current = this;
            // 找到列表的最后一个元素
            while (current.rest != null) {
                current = current.rest;
            }
            // 将新元素添加到列表末尾
            current.rest = new IntList(n, null);

            // 如果列表大小超过 3，移除第一个元素
            if (this.size() > 3) {
                this.first = this.rest.first;
                this.rest = this.rest.rest;
            }
        }
    }
}
