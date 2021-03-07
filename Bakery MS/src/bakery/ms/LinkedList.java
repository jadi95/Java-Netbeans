
package bakery.ms;
public class LinkedList {
    class Node {
        String Product;
        int Stock;
        int price;
        Node Next;
        
        public Node(String d,int p,int s)
        {
            Product = d;
            Stock = s;
            price = p;
            Next = null;
        }
    }

    Node Head;

    public LinkedList() {
        Head = null;
    }
    
    public void InsertNew (String product,int p,int s)
    {
        if(Head == null)
            Head = new Node(product,p,s);
        else
        {
            Node Temp = Head;
            while(Temp.Next != null)
            {
                Temp = Temp.Next;
            }
            Temp.Next = new Node(product,p,s);
        }
        System.out.println(product+" Inserted");
    }
    public boolean Search (String product)
    {
        Node Temp = Head;
            while(Temp != null)
            {
                if(Temp.Product.equalsIgnoreCase(product))
                {
                    System.out.println(product + " Found in the List");
                    return true;
                }
                Temp = Temp.Next;
            }
            System.out.println(product + " Not Found in the List");
            return false;
    }
    
    public boolean Update (String product,int p,int s)
    {
        Node Temp = Head;
            while(Temp != null)
            {
                if(Temp.Product.equalsIgnoreCase(product))
                {
                    Temp.Stock =s;
                    Temp.price =p;
                    return true;
                }
                Temp = Temp.Next;
            }
            System.out.println(product + " Not Found in the List");
            return false;
    }
    
    public String Buy (String product,int item)
    {
        Node Temp = Head;
            while(Temp != null)
            {
                if(Temp.Product.equalsIgnoreCase(product))
                {
                    if(item <= Temp.Stock)
                    {
                        Temp.Stock -= item;
                        int Tprice = Temp.price*item;
                        return ""+Tprice;
                    }
                    else{
                        return "OverFlow";
                    }
                }
                Temp = Temp.Next;
            }
            return "NotAvailable";
    }
    
    
    public boolean Delete (String product)
    {
        if(Head != null)
        {
           if(Head.Product.equalsIgnoreCase(product))
        {
            Head = Head.Next;
            System.out.println(product + " Deleted");
            return true;
        }
        else
        {
            Node Temp = Head;
            Node Prev = Head;
            while(Temp != null)
            {
                if(Temp.Product.equalsIgnoreCase(product))
                {
                    System.out.println(product + " Deleted");
                    Prev.Next = Temp.Next;
                    Temp = null;
                    return true;
                }
                Prev = Temp;
                Temp = Temp.Next;
            }
            System.out.println(product + " Not Found in the List");
        } 
        }
        return false;
    }
    
}
