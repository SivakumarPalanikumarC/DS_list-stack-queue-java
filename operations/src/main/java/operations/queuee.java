package operations;
import java.util.*;


    /*

     * Java Program to Implement Queue

     */

     

    
     

    /*  Class arrayQueue  */

    class queuee

    {

        protected int Queue[] ;

        protected int front, rear, size, len;

     

        /* Constructor */

        public queuee(int n) 

        {

            size = n;

            len = 0;

            Queue = new int[size];

            front = -1;

            rear = -1;

        }    

        
        /*  Function to insert an element to the queue */

        public void insert(int i) 

        {

            if (rear == -1) 

            {

                front = 0;

                rear = 0;

                Queue[rear] = i;

            }

            else if (rear + 1 >= size)

                throw new IndexOutOfBoundsException("Overflow Exception");

            else if ( rear + 1 < size)

                Queue[++rear] = i;    

            len++ ;    

        }    
        /*  Function to check if queue is empty */

        public boolean isEmpty() 

        {

            return front == -1;

        }    

        /*  Function to remove front element from the queue */

        public int remove() 

        {

            if (isEmpty())

               throw new NoSuchElementException("Underflow Exception");

            else 

            {

                len-- ;

                int ele = Queue[front];

                if ( front == rear) 

                {

                    front = -1;

                    rear = -1;

                }

                else

                    front++;                

                return ele;

            }        

        }

        /*  Function to display the status of the queue */

        public void display()

        {

            System.out.print("\nQueue = ");

            if (len == 0)

            {

                System.out.print("Empty\n");

                return ;

            }

            for (int i = front; i <= rear; i++)

                System.out.print(Queue[i]+" ");

            System.out.println();        

        }

        public static void main(String[] args) {
    		// TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);

            

            System.out.println("Array Queue Test\n");

            System.out.println("Enter Size of Integer Queue ");

            int n = scan.nextInt();

            /* creating object of class arrayQueue */

            queuee q = new queuee(n);        

            /* Perform Queue Operations */        

            char ch;

            do{

                System.out.println("\nQueue Operations");

                System.out.println("1. insert");

                System.out.println("2. remove");

               

                int choice = scan.nextInt();

                switch (choice)

                {

                case 1 : 

                    System.out.println("Enter integer element to insert");

                    try

                    {

                        q.insert( scan.nextInt() );

                    }

                    catch(Exception e)

                    {

                        System.out.println("Error : " +e.getMessage());

                    }                         

                    break;                         

                case 2 : 

                    try

                    {

                        System.out.println("Removed Element = "+q.remove());

                    }

                    catch(Exception e)

                    {

                        System.out.println("Error : " +e.getMessage());

                    }

                    break;                         

                default : System.out.println("Wrong Entry \n ");

                    break;

                }

                /* display Queue */

                q.display();            

                System.out.println("\nDo you want to continue (Type y or n) \n");

                ch = scan.next().charAt(0);

     

            } while (ch == 'Y'|| ch == 'y');                                                        

        }    

    }
    	
  

     

    