package org.prep;
/*Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.
*/
public class SolutionfindKthLargest {
    public int findKthLargest(int[] nums, int k) {
    	MinHeap Heap = new MinHeap(nums.length+1); 
    	
    	for(int i = 0; i <nums.length;i++)
    	{
    		Heap.insert(nums[i]);
    		
    		
    	}
    	Heap.minHeap();
    	for(int i =0; i <=k;i++)
    		Heap.remove();
    	
        
    }
}
