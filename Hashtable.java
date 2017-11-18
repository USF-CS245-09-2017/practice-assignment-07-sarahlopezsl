
public class Hashtable {

	class HashNode{
	   
		public String key;
	    public String value;
	    public HashNode next; 
	
	 
	    // Constructor
	    public HashNode(String k, String v)
	    {
	        key = k;
	        value = v;
	    }
	    
	}
	
	private HashNode arr [] = new HashNode [10]; 
	private int elements; 
	
	public boolean containsKey (String key){
		HashNode node= arr[0]; 
//		System.out.print("Node "+node);
//		while(node != null){
//			if (node.key.equals(key)){
//				return true; 
//			}
//; 
//			node = node.next; 	
//			
//		}
//		return false; 
//	}
	
		for(int i = 0; i<arr.length; i++){
			node = arr[i];  
			System.out.print("Node" + node);
//			System.out.print("Node value "+ node.value); 
			System.out.print("in while1");
			if(node != null){
				System.out.print("in while2");
				while(node.next!= null){
				
					if(node.next.key.equals(key)){
						return true; 
					}
				}
			}

		}
		System.out.print("here"); 
		return false; 
		
	}
	
	public String get (String key){
		int pos = key.hashCode()%arr.length; 
		HashNode temp = arr[pos];
		while(temp != null){
			if(temp.key.equals(key)){
				return temp.value; 
			}
			temp = temp.next;
		}
		return null; 
	}
	
	public void put (String key, String value){
		HashNode node = new HashNode(key, value);
		int pos = key.hashCode()%arr.length; 
		System.out.println("contains"+containsKey(key));
		if(containsKey(key)){
			System.out.println("hello");
			arr[pos] = node; 
			elements++;
		}
		else{
//			System.out.println("hello");
			HashNode current = new HashNode(key, value);
			while(current!= null){
	            current = current.next;
	        }
			current = node;  
			}
//				HashNode temp =arr[pos]; 
//				node.next = temp; 
//				arr[pos]= node; 
//				elements++;
				
			} 

	
	public String remove (String key){ 
		int pos = key.hashCode()%arr.length; 
		HashNode temp = arr[pos];
		
		if(temp == null){
			//throw exception; 
		}
		if(temp.key.equals(key)){
			arr[pos]= temp.next; 
			--elements; 
		}
		HashNode previous = temp; 
		while(temp!= null){
			temp = temp.next; //prev.next = temp.next
		}
		return temp.key; 
	}
	
}
