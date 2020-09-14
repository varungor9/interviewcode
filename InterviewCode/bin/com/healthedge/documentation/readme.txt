Explanation of the program.
 
 	Problem
		- Given a linked list of numbers,  arrange them to be all odds first and all evens after that. Within odds/even,
	  the numbers  can be in any order.
	  
	Solution 1:- 
		- Taking the java inbuilt linked list as input parameter to the method.
		- Initializing two different linked lists to group even and odd elements.  
		- Iterating over the list and finding even/odd elements, adding these to their respective lists.
		- After the list iteration is complete, adding even list at the end of odd list (if odd list exists) otherwise returning even list.
		- Returning the odd list
	  
	Solution 2:-
		- Creating a Node class to store the value and next element in the list.
		- Creating the list using the node class.
		- Taking head (node class) as input parameter to the method.
		- Maintaining even and odd head and tail nodes to track both the lists.  
		- Iterating over the list and finding even/odd elements, creating the nodes and appending it to their respective lists.
		- After the list iteration is complete, appending even head value to the odd tail node (if exists), otherwise returning even head node value.
		  
