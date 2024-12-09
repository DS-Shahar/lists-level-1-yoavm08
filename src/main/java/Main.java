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

    public static void main(String[] args) 
    {
        Node<Integer> a = q1(1, 10, 10);
        int z = q2(a, 7);
        System.out.println("The number " + 7 + " appears " + z + " times.");
    }
	
	
	
}
