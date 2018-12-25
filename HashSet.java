 static void test_HashSet()
    {
     // Create a HashSet
     HashSet<String> hset = new HashSet<String>();
 
     //add elements to HashSet
     hset.add("Element1");
     hset.add("Element2");
     hset.add("Element3");
     hset.add("Element4");
 
     // Displaying HashSet elements
     System.out.println("HashSet contains: "+ hset);
 
     // Creating an Array
     String[] array = new String[hset.size()];
     
     //Move the elements from HashSet to array 
     hset.toArray(array);
 
     // Displaying Array elements
     System.out.println("Array elements: ");
     
     for(String temp : array)
     {
        System.out.println(temp);
     }
     
     
     HashSet<Integer> hsetInt = new HashSet<Integer>();
     
     // Add elemenets to hashset
     hsetInt.add(12);
     hsetInt.add(22);
     hsetInt.add(32);
     hsetInt.add(42);
     hsetInt.add(52);
     
     // Displaying HashSet elements
     System.out.println("HashSet contains: "+ hsetInt);
     
     Integer[] array2 = new Integer[hsetInt.size()];
     
     hsetInt.toArray(array2);
     
     for(Integer in: array2)
     {
         System.out.println(in); 
     }
     
     //Get elements using iterator
     Iterator it = hsetInt.iterator();     
     while(it.hasNext())
     {
          System.out.println(it.next()); 
     }    
     
    }
