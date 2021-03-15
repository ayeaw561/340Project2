public class LList{
    public static int count;
    public Node head;

    public LList(){

    }

    public static void main(String[] args){
      LList list = new LList();

    }

    void add(Object data){
        if(head == null)
            head = new Node(data);

        Node temp = new Node(data);
        Node current = head;

        if(current != null){

            while(current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(temp);
        }
        addCount();
    }

    static int getCount(){
        return count;
    }

    static void addCount(){
        count++;
    }
    
    static void subCount(){
        count--;
    }

    void add(Object data, int size){
        Node temp = new Node(data);
        Node current = head;

        if(current != null){

            for(int i = 0; i < size; i++){

                if(current.getNext() == null){
                    break;
                }else{
                    current = current.getNext();
                }

            }
        }

        temp.setNext(current.getNext());
        current.setNext(temp);

        addCount();
    }

    Object get(int val){
        if(val < 0)
            return null;

        Node current = null;

        if(head != null) {
            current = head.getNext();

            for(int i = 0; i < val; i++){
                if(current.getNext() == null){
                    return null;
                }
                current = current.getNext();
            }
            return current.getData();
        }
        return current;
    }

    boolean remove(int size) {
        if(size < 1 || size > size()){
            return false;
        }

        Node current = head;
        if(head != null){
            for(int i = 0; i < size; i++){
                if(current.getNext() == null){
                    return false;
                }
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());

            subCount();
            return true;
        }
        return false;
    }

    int size(){
        return getCount();
    }

    public String toString() {
		String output = "";
 
		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
	            current = current.getNext();
			}
 
		}
		return output;

    }

}

class Node{

    Node next;
    Object data;

    Node(Object dataV){
        next = null;
        data = dataV;
    }

    Node(Node nextV, Object dataV){
        next = nextV;
        data = dataV;
    }

    Object getData(){
        return data;
    }

    void setData(Object dataV){
        data = dataV;
    }

    Node getNext(){
        return next;
    }

     void setNext(Node nextValue){
         next = nextValue;
     }

}