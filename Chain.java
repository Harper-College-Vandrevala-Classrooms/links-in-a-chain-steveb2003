import java.util.LinkedList;
import java.util.Scanner;

public class Chain {
    public static LinkedList<ChainLink> Chain_Link_list = new LinkedList<>();
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        boolean running = true;
        while (running)
        {
            System.out.println("Please enter 'Append' to append a link, 'View' to view a link, or 'Exit' to exit the program: ");
            String entry = in.next();
            switch (entry)
            {
                case "Append":
                    System.out.println("Please enter the name of the Chain link Object: ");
                    String color = in.next();
                    ChainLink Chain_link = new ChainLink(color);
                    append(Chain_link);
                    break;
                case "View":
                    System.out.println("Please enter the index number of the Chain link you would like to see: ");
                    int index = in.nextInt();
                    view(index);
                    break;
                case "Exit":
                    running = false;
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
            
        }
        in.close();
    }

    public static void append(ChainLink Chain_Link)
    {
        Chain_Link_list.add(Chain_Link);
        System.out.println(Chain_Link.color);
    }

    public static void view(int index)
    {
        System.out.println(Chain_Link_list.get(index).color);
    }
}
