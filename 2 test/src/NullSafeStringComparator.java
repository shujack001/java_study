public interface NullSafeStringComparator {
    /** 如果 s1 '小于' s2，则返回负数；如果 '相等'，返回 0；否则返回正数。
     * Null 被视为小于任何字符串。如果两个输入都为空，则返回 0。 */
    public int compare(String s1, String s2);
}
