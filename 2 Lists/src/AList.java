/** Array based list.
 *  @author Josh Hug
 */

//         0 1 2 3 4
// items: [1 2 3 4 5 0 0 0 0 0 ...]
// size : 5
    // Find Invariants(不变量 保证数据结构成立的规则 很重要):
    // addlast: The next items we want to add, will go into position size
    // size: The number of items in the AList should be size
    // getlast: The item we want to return is in position size - 1

public class AList<Glorp> {
    private int size;
    private Glorp[] items;

    /** Creates an empty list. */
    public AList() {
        items = (Glorp[]) new Object[100];
        size = 0;
    }

    /** Resize the underLying array to the target capacity */
    private void resize(int capacity){
        Glorp[] a = (Glorp[])new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Glorp x) {
        if(size == items.length){
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public Glorp getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Glorp get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Glorp removeLast() {
        Glorp x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }


}
