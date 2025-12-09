package h2;

public class H2_main {
    public static void main(String[] args) {
    	
    	SimpleList myList = new SimpleList(new Node(Integer.MIN_VALUE));


        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        Node tmp = myList.getFirst();
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();

        myList.insertAfter(45, 4);

        tmp = myList.getFirst();
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();

        Node found = myList.findFirst(45);
        if (found != null) System.out.println(found.value);

        myList.delete(45);

        tmp = myList.getFirst();
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}

	