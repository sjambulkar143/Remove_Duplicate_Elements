package remove_duplicates;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "RemoveDuplicatesFunctions", prefix = "shiv", namespace = "http://EniqueSolutions.com/RemoveDuplicates", helpText = "Custom defined function")
public class RemoveDuplicatesFunctions {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "ArrayElements", optional = false, optionalValue = "") })
	public String RemoveDuplicates(String ArrayElements) {
		String str = ArrayElements;
		String[] strarr = str.split(",");
		String output = " ";
		int temp=0;

		int size = strarr.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
         arr[i] = Integer.parseInt(strarr[i]);
        }
		
		

		
		
		for(int i=0; i<arr.length;i++)
			{
				for(int j = i+1;j<arr.length;j++)
				
				{
					if (arr[i]== arr[j])
				
						{
							arr[i] = -1;
						}
					
				
				}
			
			}
		
		for (int i = 0; i < arr.length; i++) 
		 {     
	            for (int j = i+1; j < arr.length; j++)
	            {     
	               if(arr[i] > arr[j]) 
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
		
			for(int i=0; i<arr.length;i++)
			
				if(arr[i] != -1)
				{
			
					System.out.print("\t"+arr[i]);
					output += arr[i];
					if (i != arr.length-1) 
					{
					output += ',';
					}
			}
			
			 return output;
			
		}
}