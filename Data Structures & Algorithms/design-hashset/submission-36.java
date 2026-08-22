class MyHashSet {
    class ListNode{
        int key;
        ListNode next;
        
        ListNode(int key) {
            this.key = key;
        }
    }
    private final ListNode[] set;

    public MyHashSet() {
        set = new ListNode[10000];
        for (int i = 0; i < set.length; i ++) {
            set[i] = new ListNode(0);
        }
    }

    public void add(int key) {
        int index = key % set.length;
        ListNode cur = set[index];

        while (cur.next != null) {
            if (cur.next.key == key) {
                return;
            }
            else {
                cur = cur.next;
            }
        }
        cur.next = new ListNode(key);
    }

    public void remove(int key) {
        int index = key % set.length;
        ListNode cur = set[index];

        while (cur.next != null) {
            if (cur.next.key == key) {
                cur.next = cur.next.next;
                return;
            }
            else {
                cur = cur.next;
            }
        }
    }

    public boolean contains(int key) {
        int index = key % set.length;
        ListNode cur = set[index];

        while (cur.next != null) {
            if (cur.next.key == key) {
                return true;
            }
            else {
                cur = cur.next;
            }
        }
        return false;
    }

}