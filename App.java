package com.zensar.b2b;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 
  
public class App
{ 
    public static void main(String[] args) throws Exception  
    { 
        // Creating an object for JSON parser
        JSONParser parser = new JSONParser();
        
        //Reader object to read a file
        Reader reader = new FileReader("Assets/ConfigResponse.txt");
        
        //Parsing the read file and storing into an object named obj
        Object obj=parser.parse(reader);
          
        // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj ; 
        
        
        //list to access the child elements sss
        
        List <JSONObject> childjo = new ArrayList<>();
        childjo= (List<JSONObject>) (jo.get("majorLine")); //Gives us the child elements in an array. 
        
        
         System.out.println(childjo.size());//test    
         
         //Map to store the appended tags and their values of Config response. 
        /* Map <String, String> ConfigResApp = new HashMap<>(); */
         
     /*    JSONArray ja = (JSONArray) jo.get("majorLine");
         
      childjo.getJS
 
         */
         //Iterator itr = childjo.iterator();
         int i = 0;
         while(i<childjo.size()) {
        	 
        	 JSONObject rec =  childjo.get(i);
        	// System.out.println(rec);
        	 System.out.println(rec.get("itemName"));
        	 Set keys = rec.keySet();
        	 
        	 Iterator a = keys.iterator();
        	    while(a.hasNext()) {
        	    	
        	    	
        	    	String key = (String) a.next();
        	    	/*JSONObject k = key.getString(a);
        	    	if((boolean)key.get())
         	    	{
        	    		System.out.println(key);
        	    		
        	    	
        	    	
         	    		key = key+(String) a.next();
*/         	    	
        	        key = rec.get("itemName").toString()+"|"+key;
        	    	 
        	    	
        	        // loop to get the dynamic k
        	       // String value = (String)rec.get(key);
        	     //   System.out.print(key);
        	        
        	        System.out.println("\n"+key);
        	       
        	        
        	        
        	
        	 
        	 
        
         } i++;
         
         
      /* for(int i=0; i<childjo.size(); ++i)
         {
        	 JSONObject rec =  childjo.get(i);
        	 String Line = (String) rec.get("itemName");
        	 
        	 
  
        	 System.out.println(Line);
             
        	
         }*/
        
         
      //   for (Iterator key=childjo.keys)
        //System.out.println(childjo);
    }
}}