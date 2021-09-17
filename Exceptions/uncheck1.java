class uncheck1 {
    public static void main(String[] args)
    {
        try{

            int arr[] ={1,2,3,4,5};
            System.out.println(arr[7]);
            
            }
            catch(ArrayIndexOutOfBoundsException e){   // Unchecked exception and could not continue the code without modifying the code.
            
            System.out.println("The specified index does not exist " +"in array. Please correct the error.");
            
            }
    }
}