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

    public static void main(String[] args) 
    {
        Node<Integer> a = q1(1, 10, 10);
        int z = q2(a, 7);
        System.out.println("The number " + 7 + " appears " + z + " times.");
    }
	
	
	
}
