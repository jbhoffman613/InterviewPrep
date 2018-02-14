import java.util.ArrayList;

/**
 * Created by JoshHoffman on 2/14/18.
 */
public class NthEnd {
  public ListNode removeNthFromEnd(ListNode a, int b) {
    ArrayList<Integer> accumulator = new ArrayList<Integer>();
    this.toList(a, accumulator);

    accumulator.remove(accumulator.size() - b);

    ListNode finalList = this.arrayToList(accumulator);

    return finalList;
  }

  private void toList(ListNode list, ArrayList<Integer> accum) {
    if (list != null) {
      accum.add(list.val);
      this.toList(list.next, accum);
    }
  }

  private ListNode arrayToList(ArrayList<Integer> arr) {

    ListNode head = new ListNode(arr.get(0));
    ListNode current = head;
    for(int i = 1; i < arr.size(); i++) {
      current.next = new ListNode(arr.get(i));
      current = current.next;
    }
    return head;
  }


}


class ListNode {
  public int val;
  public ListNode next;
  ListNode(int x) { val = x; next = null; }
}
