/**
 * MazeLocationListRefBased.java
 *
 * Authored by Mike Zastre, required to run Maze.java
 * 
 * This is a fairly simple ref-based linked-list implementation
 * that satisfies the needs of the interface. Note that a doubly-linked
 * list could make removeTail a bit more efficient, but only at
 * the cost of increasing the complexity of the nodes.   
 */

public class MazeLocationListRefBased implements MazeLocationList {
    private MazeLocationListNode head;
    private MazeLocationListNode tail;


    public MazeLocationListRefBased() {
        head = null;
        tail = null;
    }


    public boolean isEmpty() {
        return (head == null);
    }


    public int  getLength() {
        int len = 0;

        for (MazeLocationListNode l = head; l != null; l = l.next) {
            len++;
        }
        
        return len;
    }


    public MazeLocation removeTail() {
        MazeLocation result;

        if (head == null) {
            result = null;
        } else if (head == tail) {
            result = tail.loc;
            head = tail = null;
        } else {
            MazeLocationListNode l;
            for (l = head; l.next != tail; l = l.next) { }
            result = l.next.loc;
            l.next = null;
            tail = l;
        }
        return result;
    }


    public void insertTail(MazeLocation loc) {
        if (tail == null) {
            head = tail = new MazeLocationListNode(loc);
        } else {
            tail.next = new MazeLocationListNode(loc);
            tail = tail.next;
        }

    }


    public MazeLocation retrieve(int i) {
        int pos;
        MazeLocationListNode curr;

        for (pos = 0, curr = head; 
            curr != null && pos < i; curr = curr.next, pos++ ) { }

        if (pos != i || curr == null) {
            return null;
        } else {
            return curr.loc;
        }
    }


    private void dumpList() {
        String separator = "";

        for (MazeLocationListNode n = head; n != null; n = n.next) {
            System.out.print(separator + n.loc.toString());
            separator = " ";
        }
        System.out.println();
    }


    public String toString() {
        String result = "";
        String separator = "";

        for (MazeLocationListNode n = head; n != null; n = n.next) {
            result += separator + n.loc.toString();
            separator = " ";
        }

        return result;
    }
}
