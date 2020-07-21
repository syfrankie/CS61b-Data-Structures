public interface List61b<TypeofItem> {
    public void addFirst(TypeofItem x);
    public void addLast(TypeofItem x);
    public void insert(TypeofItem x, int pos);

    public TypeofItem getLast();
    public TypeofItem getFirst();
    public TypeofItem get(int i);

    public int size();
    public TypeofItem removeLast();
}
