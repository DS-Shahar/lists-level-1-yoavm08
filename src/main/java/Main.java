import java.util.Scanner;
public class Main {
	Scanner input = new Scanner(System.in);
	public static Scanner reader = new Scanner(System.in);
	

    public static Node<Integer> q1(int x, int y, int n)
    {
        Node<Integer> a = new Node<>((int)(Math.random()*(y-x+1))+x);
        Node<Integer> b = a;
        for (int i = 1; i < n; i++) 
        {
            b.setNext(new Node<>((int)(Math.random()*(y-x+1))+x));
            b = b.getNext();
        }
        return a;
    }


    public static int q2(Node<Integer> h, int x)
    {
        int count = 0;
        Node<Integer> a = h;
        while (a != null)
        {
            if (a.getValue() == x)
                count++;
            a = a.getNext();
        }
        return count;
    }

	public static Node<Integer> q3()
	{
		System.out.println("Enter a number");
	    int num = reader.nextInt();
	    if (num == -1)
		return null;
	    Node<Integer> a = new Node<>(num);
	    Node<Integer> b = a;
	    int i = 0;
	    while(i!= -1)
	    {
		System.out.println("Enter a number");
		    i = reader.nextInt();
		    if(i != -1)
		    {
			b.setNext(new Node<>(i));
			b = b.getNext();
		    }
	    }
	    return a;
	}
	
	
	public static void q4(Node<Integer> a)
	{
		Node<Integer> b = a;
	    while(b != null)
	    {
		if (b.getValue() % 2 == 0)
		    System.out.println(b.getValue());
		b = b.getNext();
	    }
	}
	
	
	public static boolean q5(Node<Integer> a, int b)
	{
	    if (a == null)
		return false;
	    if (a.getValue() == b)
		return true;
	    return q5(a.getNext(), b);
	}

    public static Node<Integer> q6(Node<Integer> a, int x)
	{
	    if (a == null)
	    	return null;
	    if (a.getValue() == x)
	    	return a.getNext();
	    Node<Integer> b = a;
	    while (b.getNext() != null)
	    {
	        if (b.getNext().getValue() == x) 
	        {
	            b.setNext(b.getNext().getNext());
	            return a;
	        }
	        b = b.getNext();
	    }
	    return a;
	}
	
	
	public static Node<Integer> q7(Node<Integer> a, int x)
	{
	    if (a == null || x <= 0) 
	    	return a;
	    if (x == 1) return a.getNext();
	    Node<Integer> b = a;
	    int i = 1;
	    while(b.getNext() != null && i < x - 1)
	    {
	    	b = b.getNext();
	    	i++;
	    }
	    if (b.getNext() != null)
	        b.setNext(b.getNext().getNext());
	    return a;
	}
	
	
	public static boolean exe8(Node<Integer> a, Node<Integer> b) {
        if (a == null) {
            return true;
        }
        if (b == null) {
            return false;
        }
        return q5(b, a.getValue()) && exe8(a.getNext(), b);
    }

    public static void exe9(Node<Integer> a, Node<Integer> b) {
        while (a != null) {
            if (q5(b, a.getValue())) {
                System.out.print(a.getValue() + " ");
            }
            a = a.getNext();
        }
        System.out.println();
    }


    public static Node<Integer> exe10(Node<Integer> a, Node<Integer> b) {
        Node<Integer> dummy = new Node<>(null);
        Node<Integer> current = dummy;

        while (a != null) {
            if (q5(b, a.getValue())) {
                current.setNext(new Node<>(a.getValue()));
                current = current.getNext();
            }
            a = a.getNext();
        }
        return dummy.getNext();
    }

    public static Node<Integer> exe11(Node<Integer> a, Node<Integer> b) {
        Node<Integer> dummy = new Node<>(null, a);
        Node<Integer> prev = dummy;
        Node<Integer> current = a;

        while (current != null) {
            if (q5(b, current.getValue())) {
                prev.setNext(current.getNext());
            } else {
                prev = current;
            }
            current = current.getNext();
        }
        return dummy.getNext();
    }
	
	
	
}
