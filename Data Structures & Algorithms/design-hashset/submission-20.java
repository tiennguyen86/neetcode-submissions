class MyHashSet {
    LinkedList<Integer>[] buckets;
    public MyHashSet() {
        buckets = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int size = 10;
        int index = key % size;

        if (!buckets[index].contains(key)){
            buckets[index].add(key);
        }
    } 

    public boolean contains(int key) {
        int size = 10;
        int index = key % size;

        if (buckets[index].contains(key)){
            return true;
        }
        else {
            return false;
        }
    }

    public void remove(int key) {
        int size = 10;
        int index = key % size;

        buckets[index].remove(Integer.valueOf(key));
    }
}