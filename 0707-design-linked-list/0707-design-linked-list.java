class MyLinkedList {
    private static class Node{
        int val;
        Node next;
        
        public Node(){}
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public Node head;

    public MyLinkedList() {}
    
    public int get(int index) {
        Node currNode = head;
        int currIdx = 0;

        while(currNode != null){
            if(index == currIdx){
                return currNode.val;
            }
            currNode = currNode.next;
            currIdx++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
       Node newNode = new Node(val);
       newNode.next = head;
       head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node currNode = head;

        if(head == null){
            head = newNode;
            return;
        }

        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {

        if(index == 0){
            addAtHead(val);
            return;
        }
        
        Node currNode = head;
        int currIdx = 0;

        while(currNode != null){
            if(index == currIdx+1){
                Node newNode = new Node(val);
                newNode.next = currNode.next;
                currNode.next = newNode;
                return;
            }

            currNode = currNode.next;
            currIdx++;
        }

    }
    
    public void deleteAtIndex(int index) {
        if(head == null){
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node currNode = head;
        Node prevNode = head;

        int currIdx = 0;
        
        while(currNode.next != null){
            if(index == currIdx+1){
                currNode.next = currNode.next.next;
                return;
            }

            currNode = currNode.next;
            currIdx++;
        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */