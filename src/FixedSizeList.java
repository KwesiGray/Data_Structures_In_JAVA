public class FixedSizeList<E> {

        //Create a Generic Array for storing the content of the list
        // E is a generic type in Java for Element
        private E [] Gray;


        //Declare the default capacity of the fixed sized list
        //This will ensure if the user creates the list with the default
        //Constructor, the size of the list will be what is declared here
    public static final int CAPACITY = 7;

    //We need to declare a variable to keep track of the number of elements
    //in the list as a user adds or removes elements.
    private int size =0;

    //Declare constructors for creating the fixed size list

    // (A) with the default capacity

    public FixedSizeList(){
        this(CAPACITY);
    }

    // (B) with user desired capacity
    public FixedSizeList(int desiredSize){
        Gray = (E[]) new Object[desiredSize];

    }

    //Create a method to check if the index I is within the array size
    //before any operation can be performed

    public void checkIndex (int i, int n){
        if(i<0||i>=n)
            throw new IndexOutOfBoundsException("Illegal Index: "+i);
    }

    //Create a method to add an element at a given index i
    public void add(int i ,E e ){
        checkIndex(i, size+1);
        if(size == Gray.length)
            throw new IllegalStateException("List is Full");

        //If the List is not Full we want to be able to loop through the List
         for(int k = size-1; k>=i; k--){
             Gray[k+1] = Gray[k];

         }
         Gray[i] =e ;
         size++;





    }
    //Create a method to allow user add an element without specifying the index in which the element is added
    public void add(E e){
        int i = size;
        add(i,e);
    }

    public  E remove(int i){
        checkIndex(i, size);
        E temp = Gray[i];

        for(int k=i; k<size-1; k++ ){
            Gray[k] = Gray[k+1];

        }
        Gray[size-1]= null;
        size--;

        return temp;
    }

    //Create a method to return the size of the list
    public  int size(){
        return size;
    }
    //Create a method to check if the list is empty

    public boolean isEmpty(){
        return size==0;
    }
    //Create a method to return an element at an index i
    public  E get(int i) throws  IndexOutOfBoundsException{
        checkIndex(i, size);
        return Gray[i];
    }

    //Create a method to replace an element at an index i and return the replaced element
    public E replace(int i , E e) throws IndexOutOfBoundsException{
        checkIndex(i, size);

        E temp = Gray[i];
        Gray[i]= e;
        return temp;

    }
    //Create a method that will check if the list contains an element which is being searched for!
    public  boolean contains(Object item){
        for(int j=0; j<size-1; j++){
            if(get(j).equals(item)){
                return true;

            }

        }
        return false;
    }

    }


