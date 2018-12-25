 static void test_LinkedHashMap()
    {
        // Create a hash table
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        
        hm.put(2, "Shang");
        hm.put(3, "Teva");
        hm.put(4, "Sam");
        hm.put(5, "Tim");
        
        // Check whether the given key is there or not
        
        if(hm.containsValue("Shang"))
        {
            System.out.print("Yes, Shang value is here \n");
        }
        
        if(hm.containsKey(3))
        {
            System.out.print("Yes, key 3 is here \n");;
        }
        
        // Print the value of a specific key
        System.out.print(hm.get(3));
        
        Set s = hm.entrySet();
        
        Iterator it = s.iterator();
        
        while(it.hasNext())
        {
           Map.Entry me = (Map.Entry)it.next();
           
            System.out.print("Key is: "+ me.getKey() + " & Value is: "+me.getValue()+"\n");
        }     
        
    }
