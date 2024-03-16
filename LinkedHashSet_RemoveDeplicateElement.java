import java.util.*;
public class Main
{
	public static void main(String[] args) {
       //Using set interface
      //in set we using add method for adding the element
      //set collection cannot contain duplicate elements
	    LinkedHashSet<Integer> set=new LinkedHashSet<>();
	    int arr[]={1,2,1,3,3,4,4,5,4,5,6,6,7};
	    for(int i=0;i<arr.length;i++){
	        set.add(arr[i]);
	    }
	    System.out.print(set);
	}
}

//OUTPUT: [1, 2, 3, 4, 5, 6, 7]
