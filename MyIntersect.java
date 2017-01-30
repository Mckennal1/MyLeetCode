import java.util.ArrayList;
import java.util.List;

/*
 * Author: Luisa McKenna
 * Problem By: LeetCode
 * 
 * Intersection of two arrays
 * Given two arrays print the output of their intersection. 
 * Each element in the result must be unique
 *The result can be in any order
 *
 */

public class MyIntersect {

	public static List<Integer> intersection(int[] nums1, int[] nums2){
		
		List<Integer> myList = new ArrayList<Integer>();
		
		for(int i = 0; i< nums1.length; i++){
			for(int j = 0; j<nums2.length; j++){
				if(nums1[i] == nums2[j] && !myList.contains(nums2[j])){
					myList.add(nums1[i]);
				}
			}
		}
		return myList;
	}
	
	public static void main (String []args){
		System.out.println(intersection(new int[]{1,2,3,4,11},new int []{11,2,5,3,11}));
		
	}
}
