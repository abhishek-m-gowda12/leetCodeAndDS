package com.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] combArr=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            combArr[k++]=(nums1[i]<nums2[j])? nums1[i++]: nums2[j++];
        }
        //getting the rest of the arrays
        while(i<nums1.length){
            combArr[k++]=nums1[i++];
        }
        while(j<nums2.length){
            combArr[k++]=nums2[j++];
        }
        int half=combArr.length/2;
        double median=(combArr.length%2==0)? (double)(combArr[half]+combArr[half-1])/2:(double)combArr[half];
        return median;
    }

    public double findMedianSortedArrays(List<Integer> nums1, List<Integer> nums2) {

        List<Integer> aa = new ArrayList<>();
        aa.addAll(nums1);
        aa.addAll(nums2);

        double sum =  aa.stream().mapToInt(Integer::intValue).sum();

        return (sum/2);
    }
}
