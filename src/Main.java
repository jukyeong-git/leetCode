import Solution.*;
import Util.ListNode;
import Util.Node;
import Util.TreeNode;
import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //2239. Find Closest Number to Zero - https://leetcode.com/problems/find-closest-number-to-zero/
//        int[] nums = {-4,-2,1,4,8};
//        System.out.println(Find_Closest_Number_to_Zero.findClosestNumber(nums));

        //1768. Merge Strings Alternately - https://leetcode.com/problems/merge-strings-alternately/description/
//        String word1 = "abc", word2 = "pqr";
//        System.out.print(Merge_Strings_Alternately.mergeAlternately(word1, word2));

        //13. Roman to Integer - https://leetcode.com/problems/roman-to-integer/
//        String s = "MCMXCIV";
//        System.out.println(Roman_to_Integer.romanToInt(s));

        //392. Is Subsequence - https://leetcode.com/problems/is-subsequence/description/
//        String s = "abc", t = "ahbgdc";
//        System.out.println(Is_Subsequence.isSubsequence(s,t));

        //121. Best Time to Buy and Sell Stock - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(Best_Time_to_Buy_and_Sell_Stock.maxProfit(prices));

        //14. Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/
//        String[] strs = {"flower","flower","flower", "flower"};
//        String[] strs = {"abb","abc"};
//        System.out.println(Longest_Common_Prefix.longestCommonPrefix(strs));

        //228. Summary Ranges - https://leetcode.com/problems/summary-ranges/description/
//        int[] nums = {0,1,2,4,5,7};
//        int[] nums = {0,2,3,4,6,8,9};
//        System.out.println(Summary_Ranges.summaryRanges(nums));

        //771. Jewels and Stones - https://leetcode.com/problems/jewels-and-stones/description/
//        String jewels = "aA", stones = "aAAbbbb";
//        String jewels = "z", stones = "ZZ";
//        System.out.println(Jewels_and_Stones.numJewelsInStones(jewels, stones));

        //217. Contains Duplicate - https://leetcode.com/problems/contains-duplicate/description/
//        int[] nums = {1,2,3,1};
//        System.out.println(Contains_Duplicate.containsDuplicate(nums));

        //242. Valid Anagram - https://leetcode.com/problems/valid-anagram/description/
//        String s = "anagram", t = "nagaram";
//        System.out.println(Valid_Anagram.isAnagram(s, t));

        //1189. Maximum Number of Balloons - https://leetcode.com/problems/maximum-number-of-balloons/description/
//        String text = "nlaebolko";
//        System.out.println(Maximum_Number_of_Balloons.maxNumberOfBalloons(text));

        //1. Two Sum - https://leetcode.com/problems/two-sum/description/
//        int[] nums = {2,5,5,11};
//        int target = 10;
//        System.out.println(Arrays.toString(Two_Sum.twoSum(nums, target)));

        //169. Majority Element - https://leetcode.com/problems/majority-element/description/
//        int[] nums = {2,2,1,1,1,2,2};
//        System.out.println(Majority_Element.majorityElement(nums));

        //977. Squares of a Sorted Array - https://leetcode.com/problems/squares-of-a-sorted-array/description/
//        int[] nums = {-4,-1,0,3,10};
//        System.out.println(Arrays.toString(Squares_of_a_Sorted_Array.sortedSquares(nums)));

        //344. Reverse String - https://leetcode.com/problems/reverse-string/description/
//        char[] s = {'h','e','l','l','o'};
//        Reverse_String.reverseString(s);

        //125. Valid Palindrome - https://leetcode.com/problems/valid-palindrome/description/
//        String s = "A man, a plan, a canal: Panama";
//        String s = "0P";
//        System.out.println(Valid_Palindrome.isPalindrome(s));

        //682. Baseball Game - https://leetcode.com/problems/baseball-game/description/
//        String[] ops = {"5","2","C","D","+"};
//        String[] ops = {"5","-2","4","C","D","9","+","+"};
//        System.out.println(Baseball_Game.calPoints(ops));

        //20. Valid Parentheses - https://leetcode.com/problems/valid-parentheses/description/
//        String s = "]";
//        System.out.println(Valid_Parentheses.isValid(s));

        //83. Remove Duplicates from Sorted List - https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head = Remove_Duplicates_from_Sorted_List.deleteDuplicates(head);
//        while(head != null) {
//            System.out.println(head.val);
//            head = head.next;
//        }

        //206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        ListNode result = null;
//        result = Reverse_Linked_List.reverseList(head);
//        while(result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }

        //21. Merge Two Sorted Lists - https://leetcode.com/problems/merge-two-sorted-lists/description/
//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(2);
//        list1.next.next = new ListNode(4);
//        ListNode list2 = new ListNode(1);
//        list2.next = new ListNode(3);
//        list2.next.next = new ListNode(4);
//        ListNode result = null;
//        result = Merge_Two_Sorted_Lists.mergeTwoLists(list1, list2);
//        while(result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }

        //141. Linked List Cycle - https://leetcode.com/problems/linked-list-cycle/description/
//        ListNode head = new ListNode(3);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(-4);
//        ListNode cycle = head.next;
//        head.next.next.next.next = cycle;
//        System.out.println(Linked_List_Cycle.hasCycle(cycle));

        //876. Middle of the Linked List - https://leetcode.com/problems/middle-of-the-linked-list/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        ListNode result = null;
//        result = Middle_of_the_Linked_List.middleNode(head);
//        while(result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }

        //704. Binary Search - https://leetcode.com/problems/binary-search/description/
//        int[] nums = {-1,0,3,5,9,12};
//        int target = 9;
//        System.out.println(Binary_Search.search(nums, target));

        //35. Search Insert Position - https://leetcode.com/problems/search-insert-position/description/
//        int[] nums = {1,3,5,6};
//        int target = 7;
//        System.out.println(Search_Insert_Position.searchInsert(nums, target));

        //367. Valid Perfect Square - https://leetcode.com/problems/valid-perfect-square/description/
//        int num = 16;
//        System.out.println(Valid_Perfect_Square.isPerfectSquare(num));

        //643. Maximum Average Subarray I - https://leetcode.com/problems/maximum-average-subarray-i/description/
//        int[] nums = {1,12,-5,-6,50,3};
//        int k = 4;
//        System.out.println(Maximum_Average_Subarray_I.findMaxAverage(nums, k));

        //226. Invert Binary Tree - https://leetcode.com/problems/invert-binary-tree/description/
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(9);
//        root = Invert_Binary_Tree.invertTree(root);

        //104. Maximum Depth of Binary Tree - https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        System.out.println(Maximum_Depth_of_Binary_Tree.maxDepth(root));

        //110. Balanced Binary Tree - https://leetcode.com/problems/balanced-binary-tree/description/
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        System.out.println(Balanced_Binary_Tree.isBalanced(root));

        //1046. Last Stone Weight - https://leetcode.com/problems/last-stone-weight/description/
//        int[] stones = {2,7,4,1,8,1};
//        System.out.println(Last_Stone_Weight.lastStoneWeight(stones));

        //1971. Find if Path Exists in Graph - https://leetcode.com/problems/find-if-path-exists-in-graph/description/
//        int n = 3, source = 0, destination = 2;
//        int[][] edges = {{0,1},{1,2},{2,0}};
//        System.out.println(Find_if_Path_Exists_in_Graph.validPath(n, edges, source, destination));

        //509. Fibonacci Number - https://leetcode.com/problems/fibonacci-number/description/
//        int n = 2;
//        System.out.println(Fibonacci_Number.fib(n));

        //70. Climbing Stairs - https://leetcode.com/problems/climbing-stairs/description/
//        int n = 4;
//        System.out.println(Climbing_Stairs.climbStairs(n));

        //746. Min Cost Climbing Stairs - https://leetcode.com/problems/min-cost-climbing-stairs/description/
//        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        System.out.println(Min_Cost_Climbing_Stairs.minCostClimbingStairs(cost));

        //36. Valid Sudoku - https://leetcode.com/problems/valid-sudoku/description/
//        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}};
//        System.out.println(Valid_Sudoku.isValidSudoku(board));

        //383. Ransom Note - https://leetcode.com/problems/ransom-note/description/
//        String ransomNote = "a", magazine = "b";
//        System.out.println(Ransom_Note.canConstruct(ransomNote, magazine));

        //88. Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/description/
//        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
//        int m = 3, n =3;
//        Merge_Sorted_Array.merge(nums1, m, nums2, n);

        //27. Remove Element - https://leetcode.com/problems/remove-element/description
//        int[] nums = {3,2,2,3};
//        int val = 3;
//        System.out.println(Remove_Element.removeElement(nums,val));

        //26. Remove Duplicates from Sorted Array - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(Remove_Duplicates_from_Sorted_Array.removeDuplicates(nums));

        //80. Remove Duplicates from Sorted Array II - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description
//        int[] nums = {1,1,1,2,2,3};
//        System.out.println(Remove_Duplicates_from_Sorted_Array_II.removeDuplicates(nums));

        //167. Two Three_Sum II - Input Array Is Sorted - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//        int[] numbers = {2,7,11,15};
//        int target = 9;
//        System.out.println(Arrays.toString(Two_Sum_II_Input_Array_Is_Sorted.twoSum(numbers, target)));

        //3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//        String s = "abcabcbb";
//        System.out.println(Longest_Substring_Without_Repeating_Characters.lengthOfLongestSubstring(s));

        //54. Spiral Matrix - https://leetcode.com/problems/spiral-matrix/description/
//        int[][] matrix = {
//                {1 ,2 ,3 ,4 },
//                {5 ,6 ,7 ,8 },
//                {9 ,10,11,12},
//                {13,14,15,16},
//                {17,18,19,20},
//                {21,22,23,24}

//                {1,2,3},
//                {4,5,6},
//                {7,8,9}

//                {1 ,2 ,3 ,4},
//                {5 ,6 ,7 ,8},
//                {9 ,10,11,12}
//        };
//        System.out.println(Spiral_Matrix.spiralOrder(matrix));

        //205. Isomorphic Strings - https://leetcode.com/problems/isomorphic-strings/description/
//        String s = "badc", t = "baba";
//        String s = "papap", t = "titii";
//        System.out.println(Isomorphic_Strings.isIsomorphic(s, t));

        //290. Word Pattern - https://leetcode.com/problems/word-pattern/description/
//        String pattern = "abba", s = "dog cat cat dog";
//        System.out.println(Word_Pattern.wordPattern(pattern, s));

        //56. Merge Intervals - https://leetcode.com/problems/merge-intervals/description/
//        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        int[][] intervals = {{4,7},{1,4}};
//        System.out.println(Arrays.deepToString(Merge_Intervals.merge(intervals)));

        //57. Insert Interval - https://leetcode.com/problems/insert-interval/description/
//        int[][] intervals = {{1,3}, {6,9}};
//        int[] newInterval = {2,5};
//        int[][] intervals = {{1,5}};
//        int[] newInterval = {0,3};
//        System.out.println(Arrays.deepToString(Insert_Interval.insert(intervals, newInterval)));

        //71. Simplify Path - https://leetcode.com/problems/simplify-path/description/
//        String path = "/home/";
//        String path = "/home//foo/";
//        String path = "/home/user/Documents/../Pictures";
//        String path = "/../";
//        String path = "/.../a/../b/c/../d/./";
//        String path = "/a/./b/../../c/";
//        System.out.println(Simplify_Path.simplifyPath(path));

        //209. Minimum Size Subarray Three_Sum - https://leetcode.com/problems/minimum-size-subarray-sum/description/
//        int target = 7;
//        int[] nums = {2,3,1,2,4,3};
//        System.out.println(Minimum_Size_Subarray_Sum.minSubArrayLen(target, nums));

        //155. Min Stack - https://leetcode.com/problems/min-stack/description/
//        Min_Stack minStack = new Min_Stack();
//        minStack.push(-1);
//        System.out.println(minStack.top());
//        System.out.println(minStack.getMin()); // return -3
//        minStack.push(1);
//        System.out.println(minStack.top());    // return 0
//        System.out.println(minStack.getMin()); // return -2

        //2. Add Two Numbers - https://leetcode.com/problems/add-two-numbers/description/
//        ListNode l1 = new ListNode(2,new ListNode((4)));
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5,new ListNode((6)));
//        l2.next.next = new ListNode(4);

//        ListNode l1 = new ListNode(9,new ListNode((9)));
//        l1.next.next = new ListNode(9);
//        l1.next.next.next = new ListNode(9);
//        l1.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next.next = new ListNode(9);
//        ListNode l2 = new ListNode(9,new ListNode((9)));
//        l2.next.next = new ListNode(9);
//        l2.next.next.next = new ListNode(9);

//        ListNode result = Add_Two_Numbers.addTwoNumbers(l1, l2);
//        while(result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }

        //55. Jump Game - https://leetcode.com/problems/jump-game/description/
//        int[] nums = {2,3,1,1,4};
//        System.out.println(Jump_Game.canJump(nums));

        //2745. Construct the Longest New String - https://leetcode.com/problems/construct-the-longest-new-string/description/
//        int x = 2, y = 5, z = 1;
//        System.out.println(Construct_the_Longest_New_String.longestString(x, y, z));

        //219. Contains Duplicate II - https://leetcode.com/problems/contains-duplicate-ii/description/
//        int[] nums = {1,2,3,1};
//        int k = 3;
//        int[] nums = {1,2,3,1,2,3};
//        int k = 2;
//        System.out.println(Contains_Duplicate_II.containsNearbyDuplicate(nums,k));

        //442. Find All Duplicates in an Array - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
//        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(Find_All_Duplicates_in_an_Arra.findDuplicates(nums));

        //15. 3Sum - https://leetcode.com/problems/3sum/description/
//        int[] nums = {-1,0,1,2,-1,-4};
//        System.out.println(Three_Sum.threeSum(nums));

        //138. Copy List with Random Pointer - https://leetcode.com/problems/copy-list-with-random-pointer/description/
//        Node head = new Node(7);                // 0
//        head.next = new Node(13);               // 1
//        head.next.next = new Node(11);          // 2
//        head.next.next.next = new Node(10);     // 3
//        head.next.next.next.next = new Node(1); // 4
//        head.next.random = head;
//        head.next.next.random = head.next.next.next.next;
//        head.next.next.next.random = head;
//        head.next.next.next.next.random = head;
//        Node result = Copy_List_with_Random_Pointer.copyRandomList(head);
//        while(result != null) {
//            System.out.print(result.val +", ");
//            System.out.println(result.random != null ? result.random.val : "null");
//            result = result.next;
//        }

        //189. Rotate Array - https://leetcode.com/problems/rotate-array/description/
//        int[] nums = {1,2,3,4,5,6,7};
//        int k = 3;
//        Rotate_Array.rotate(nums, k);

        //122. Best Time to Buy and Sell Stock II - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(Best_Time_to_Buy_and_Sell_Stock_II.maxProfit(prices));

        //45. Jump Game II - https://leetcode.com/problems/jump-game-ii/description/
//        int[] nums = {2,3,1,1,4};
//        int[] nums = {1,1,1,1};
//        int[] nums = {10,9,8,7,6,5,4,3,2,1,1,0};
//        int[] nums = {3,4,3,1,0,7,0,3,0,2,0,3};
//        System.out.println(Jump_Game_II.jump(nums));

        //2208. Minimum Operations to Halve Array Three_Sum - https://leetcode.com/problems/minimum-operations-to-halve-array-sum/
//        int[] nums = {5,19,8,1};
//        System.out.println(Minimum_Operations_to_Halve_Array_Sum.halveArray(nums));

        //274. H-Index - https://leetcode.com/problems/h-index/description/
//        int[] citations = {3,0,6,1,5};
//        System.out.println(H_Index.hIndex(citations));

        //380. Insert Delete GetRandom O(1) - https://leetcode.com/problems/insert-delete-getrandom-o1/description/
//        Insert_Delete_GetRandom_O solution = new Insert_Delete_GetRandom_O();
//        System.out.println(solution.insert(1));
//        System.out.println(solution.remove(2));
//        System.out.println(solution.insert(2));
//        System.out.println(solution.getRandom());
//        System.out.println(solution.remove(1));
//        System.out.println(solution.insert(2));
//        System.out.println(solution.getRandom());

        //238. Product of Array Except Self - https://leetcode.com/problems/product-of-array-except-self/description/
//        int[] nums = {-1, 1, 0, -3, 3};
//        System.out.println(Arrays.toString(Product_of_Array_Except_Self.productExceptSelf(nums)));

        //134. Gas Station - https://leetcode.com/problems/gas-station/description/
//        int[] gas = {5,8,2,8}, cost = {6,5,6,6};
//        System.out.println(Gas_Station.canCompleteCircuit(gas, cost));

        //12. Integer to Roman - https://leetcode.com/problems/integer-to-roman/description/
//        int num = 1994;
//        System.out.println(Integer_to_Roman.intToRoman(num));

        //58. Length of Last Word - https://leetcode.com/problems/length-of-last-word/description/
//        String s = "Hello World";
//        System.out.println(Length_of_Last_Word.lengthOfLastWord(s));

        //151. Reverse Words in a String - https://leetcode.com/problems/reverse-words-in-a-string/description/
//        String s = "the sky is blue";
//        System.out.println(Reverse_Words_in_a_String.reverseWords(s));

        //28. Find the Index of the First Occurrence in a String - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
//        String haystack = "sadbutsad", needle = "sad";
//        System.out.println(Find_the_Index_of_the_First_Occurrence_in_a_String.strStr(haystack, needle));

        //6. Zigzag Conversion - https://leetcode.com/problems/zigzag-conversion/
//        String s = "PAYPALISHIRING";
//        int numRows = 3;
//        System.out.println(Zigzag_Conversion.convert(s, numRows));

        //11. Container With Most Water - https://leetcode.com/problems/container-with-most-water/description/
//        int[] height = {1,8,6,2,5,4,8,3,7};
//        System.out.println(Container_With_Most_Water.maxArea(height));

        //274. H-Index - https://leetcode.com/problems/h-index/description/
//        int[] citations = {3,0,6,1,5};
//        System.out.println(H_Index.hIndex(citations));

        //347. Top K Frequent Elements - https://leetcode.com/problems/top-k-frequent-elements/description/
//        int[] nums = {1,1,1,2,2,3};
//        int k = 2;
//        System.out.println(Arrays.toString(Top_K_Frequent_Elements.topKFrequent(nums, k)));

        //48. Rotate Image - https://leetcode.com/problems/rotate-image/description/
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        Rotate_Image.rotate(matrix);

        //73. Set Matrix Zeroes - https://leetcode.com/problems/set-matrix-zeroes/description/
//        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
//        Set_Matrix_Zeroes.setZeroes(matrix);

        //49. Group Anagrams - https://leetcode.com/problems/group-anagrams/description/
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        System.out.println(Group_Anagrams.groupAnagrams(strs));

        //202. Happy Number - https://leetcode.com/problems/happy-number/description/
//        int n = 2;
//        System.out.println(Happy_Number.isHappy(n));

        //128. Longest Consecutive Sequence - https://leetcode.com/problems/longest-consecutive-sequence/description/
//        int[] nums = {100,4,200,1,3,2};
//        System.out.println(Longest_Consecutive_Sequence.longestConsecutive(nums));

        //100. Same Tree - https://leetcode.com/problems/same-tree/description/
//        TreeNode p = new TreeNode(1);
//        p.left = new TreeNode(2);
//        p.right = new TreeNode(3);
//        TreeNode q = new TreeNode(1);
//        q.left = new TreeNode(2);
//        q.right = new TreeNode(3);
//        System.out.println(Same_Tree.isSameTree(p, q));

        //101. Symmetric Tree - https://leetcode.com/problems/symmetric-tree/description/
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);
//        System.out.println(Symmetric_Tree.isSymmetric(root));

        //112. Path Sum - https://leetcode.com/problems/path-sum/description/
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.left.left = new TreeNode(11);
//        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(2);
//        root.right = new TreeNode(8);
//        root.right.left = new TreeNode(13);
//        root.right.right = new TreeNode(4);
//        root.right.right.right = new TreeNode(1);
//        int targetSum = 22;

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        int targetSum = 1;

//        TreeNode root = new TreeNode(-2);
//        root.right = new TreeNode(-3);
//        int targetSum = -5;
//        System.out.println(Path_Sum.hasPathSum(root, targetSum));

        //222. Count Complete Tree Nodes - https://leetcode.com/problems/count-complete-tree-nodes/description/
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.right = new TreeNode(3);
//        System.out.println(Count_Complete_Tree_Nodes.countNodes(root));

        //637. Average of Levels in Binary Tree - https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(1);
//        System.out.println(Average_of_Levels_in_Binary_Tree.averageOfLevels(root));

        //530. Minimum Absolute Difference in BST - https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
//        TreeNode root = new TreeNode(236);
//        root.left = new TreeNode(104);
//        root.left.right = new TreeNode(227);
//        root.right = new TreeNode(701);
//        root.right.right = new TreeNode(911);
//        System.out.println(Minimum_Absolute_Difference_in_BST.getMinimumDifference(root));

        //108. Convert Sorted Array to Binary Search Tree - https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
//        int[] nums = {-10,-3,0,5,9};
//        TreeNode root = Convert_Sorted_Array_to_Binary_Search_Tree.sortedArrayToBST(nums);

        //67. Add Binary - https://leetcode.com/problems/add-binary/description/
//        String a = "11", b = "1";
//        System.out.println(Add_Binary.addBinary(a,b));

        //190. Reverse Bits - https://leetcode.com/problems/reverse-bits/description/
//        int n = 43261596;
//        System.out.println(Reverse_Bits.reverseBits(n));

        //191. Number of 1 Bits - https://leetcode.com/problems/number-of-1-bits/description/
//        int n = 11;
//        System.out.println(Number_of_1_Bits.hammingWeight(n));

        //136. Single Number - https://leetcode.com/problems/single-number/description/
//        int[] nums = {2,2,1};
//        System.out.println(Single_Number.singleNumber(nums));

        //9. Palindrome Number - https://leetcode.com/problems/palindrome-number/description/
//        int x = 121;
//        System.out.println(Palindrome_Number.isPalindrome(x));

        //66. Plus One - https://leetcode.com/problems/plus-one/description/
//        int[] digits = {1,2,3};
//        int[] res = Plus_One.plusOne(digits);
//        for(int ans : res) {
//            System.out.println(ans);
//        }

        //69. Sqrt(x) - https://leetcode.com/problems/sqrtx/description/
//        int x = 4;
//        System.out.println(Sqrt_x.mySqrt(x));

        //452. Minimum Number of Arrows to Burst Balloons - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
//        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//        int[][] points = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
//        System.out.println(Minimum_Number_of_Arrows_to_Burst_Balloons.findMinArrowShots(points));

        //150. Evaluate Reverse Polish Notation - https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
//        String[] tokens = {"4","13","5","/","+"};
//        System.out.println(Evaluate_Reverse_Polish_Notation.evalRPN(tokens));

        //92. Reverse Linked List II - https://leetcode.com/problems/reverse-linked-list-ii/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        int left = 2, right = 4;
//        ListNode res = Reverse_Linked_List_II.reverseBetween(head, left, right);
//        while(res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }

        //19. Remove Nth Node From End of List - https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        int n = 2;
//        ListNode res = Remove_Nth_Node_From_End_of_List.removeNthFromEnd(head, n);
//        while(res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }

        //82. Remove Duplicates from Sorted List II - https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next.next = new ListNode(5);
//        ListNode res = Remove_Duplicates_from_Sorted_List_II.deleteDuplicates(head);
//        while(res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }

        //61. Rotate List - https://leetcode.com/problems/rotate-list/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        int k = 2;
//        ListNode res = Rotate_List.rotateRight(head, k);
//        while(res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }

        //86. Partition List - https://leetcode.com/problems/partition-list/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(2);
//        int x = 3;
//        ListNode res = Partition_List.partition(head, x);
//        while(res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }

        //146. LRU Cache - https://leetcode.com/problems/lru-cache/description/
//        LRU_Cache lRUCache = new LRU_Cache(2);
//        lRUCache.put(1, 1);                     // cache is {1=1}
//        lRUCache.put(2, 2);                     // cache is {1=1, 2=2}
//        System.out.println(lRUCache.get(1));    // return 1
//        lRUCache.put(3, 3);                     // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        System.out.println(lRUCache.get(2));    // returns -1 (not found)
//        lRUCache.put(4, 4);                     // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        System.out.println(lRUCache.get(1));    // return -1 (not found)
//        System.out.println(lRUCache.get(3));    // return 3
//        System.out.println(lRUCache.get(4));    // return 4

        //105. Construct Binary Tree from Preorder and Inorder Traversal - https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
//        int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};
//        TreeNode res = Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal.buildTree(preorder, inorder);

        //106. Construct Binary Tree from Inorder and Postorder Traversal - https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
//        int[] inorder = {9, 3, 15, 20, 7}, postorder = {9, 15, 7, 20, 3};
//        TreeNode res = Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal.buildTree(inorder, postorder);

        //117. Populating Next Right Pointers in Each Node II - https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right = new Node(3);
//        root.right.right = new Node(7);
//        Node res = Populating_Next_Right_Pointers_in_Each_Node_II.connect(root);

        //114. Flatten Binary Tree to Linked List - https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.right = new TreeNode(5);
//        root.right.right = new TreeNode(6);
//        Flatten_Binary_Tree_to_Linked_List.flatten(root);

        //129. Sum Root to Leaf Numbers - https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(9);
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(1);
//        root.right = new TreeNode(0);
//        System.out.println(Sum_Root_to_Leaf_Numbers.sumNumbers(root));

        //173. Binary Search Tree Iterator - https://leetcode.com/problems/binary-search-tree-iterator/description/
//        TreeNode root = new TreeNode(7);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(15);
//        root.right.left = new TreeNode(9);
//        root.right.right = new TreeNode(20);
//        Binary_Search_Tree_Iterator bSTIterator = new Binary_Search_Tree_Iterator(root);
//        System.out.println(bSTIterator.next());    // return 3
//        System.out.println(bSTIterator.next());    // return 7
//        System.out.println(bSTIterator.hasNext()); // return True
//        System.out.println(bSTIterator.next());    // return 9
//        System.out.println(bSTIterator.hasNext()); // return True
//        System.out.println(bSTIterator.next());    // return 15
//        System.out.println(bSTIterator.hasNext()); // return True
//        System.out.println(bSTIterator.next());    // return 20
//        System.out.println(bSTIterator.hasNext()); // return False

        //236. Lowest Common Ancestor of a Binary Tree - https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(5);
//        root.left.left = new TreeNode(6);
//        root.left.right = new TreeNode(2);
//        root.left.right.left = new TreeNode(7);
//        root.left.right.left.right = new TreeNode(4);
//        root.right = new TreeNode(1);
//        root.right.left = new TreeNode(0);
//        root.right.right = new TreeNode(8);
//        TreeNode p = root.left, q = root.right;
//        TreeNode res = Lowest_Common_Ancestor_of_a_Binary_Tree.lowestCommonAncestor(root, p, q);
//        System.out.println(res.val);

        //199. Binary Tree Right Side View - https://leetcode.com/problems/binary-tree-right-side-view/description/
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.right = new TreeNode(5);
//        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(4);
//        System.out.println(Binary_Tree_Right_Side_View.rightSideView(root));

        //102. Binary Tree Level Order Traversal - https://leetcode.com/problems/binary-tree-level-order-traversal/description/
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        System.out.println(Binary_Tree_Level_Order_Traversal.levelOrder(root));

        //103. Binary Tree Zigzag Level Order Traversal - https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(5);
//        System.out.println(Binary_Tree_Zigzag_Level_Order_Traversal.zigzagLevelOrder(root));

        //230. Kth Smallest Element in a BST - https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(1);
//        root.left.right = new TreeNode(2);
//        root.right = new TreeNode(4);
//        int k = 1;
//        System.out.println(Kth_Smallest_Element_in_a_BST.kthSmallest(root, k));

        //98. Validate Binary Search Tree - https://leetcode.com/problems/validate-binary-search-tree/description/
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(6);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(7);
//        System.out.println(Validate_Binary_Search_Tree.isValidBST(root));

        //200. Number of Islands - https://leetcode.com/problems/number-of-islands/description/
//        char[][] grid = {
//                {'1', '1', '1', '1', '0'},
//                {'1', '1', '0', '1', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '0', '0', '0'}
//            };
//        System.out.println(Number_of_Islands.numIslands(grid));

        //130. Surrounded Regions - https://leetcode.com/problems/surrounded-regions/description/
//        char[][] board = {
//                {'X','X','X','X'},
//                {'X','O','O','X'},
//                {'X','X','O','X'},
//                {'X','O','X','X'}
//            };
//        Surrounded_Regions.solve(board);

        //133. Clone Graph - https://leetcode.com/problems/clone-graph/description/
//        int[][] adjList = {{2, 4},{1, 3},{2, 4},{1, 3}};
//        Node root = Clone_Graph.buildGraph(adjList);
//        Node res = Clone_Graph.cloneGraph(root);

        //207. Course Schedule - https://leetcode.com/problems/course-schedule/description/
//        int numCourses = 2;
//        int[][] prerequisites = {{1, 0}, {0, 1}};
//        System.out.println(Course_Schedule.canFinish(numCourses, prerequisites));

        //210. Course Schedule II - https://leetcode.com/problems/course-schedule-ii/description/
//        int numCourses = 4;
//        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
//        System.out.println(Arrays.toString(Course_Schedule_II.findOrder(numCourses, prerequisites)));

        //909. Snakes and Ladders - https://leetcode.com/problems/snakes-and-ladders/description/
//        int[][] board = {{-1,-1,-1,-1,-1,-1},
//                         {-1,-1,-1,-1,-1,-1},
//                         {-1,-1,-1,-1,-1,-1},
//                         {-1,35,-1,-1,13,-1},
//                         {-1,-1,-1,-1,-1,-1},
//                         {-1,15,-1,-1,-1,-1}};
//        System.out.println(Snakes_and_Ladders.snakesAndLadders(board));

        //433. Minimum Genetic Mutation - https://leetcode.com/problems/minimum-genetic-mutation/
//        String startGene = "AACCGGTT", endGene = "AACCGGTA";
//        String[] bank = {"AACCGGTA"};
//        System.out.println(Minimum_Genetic_Mutation.minMutation(startGene, endGene, bank));

        //208. Implement Trie (Prefix Tree) - https://leetcode.com/problems/implement-trie-prefix-tree/description/
//        Implement_Trie_Prefix_Tree trie = new Implement_Trie_Prefix_Tree();
//        trie.insert("apple");
//        System.out.println(trie.search("apple"));   // return True
//        System.out.println(trie.search("app"));     // return False
//        System.out.println(trie.startsWith("app"));       // return True
//        trie.insert("app");
//        System.out.println(trie.search("app"));     // return True

        //211. Design Add and Search Words Data Structure - https://leetcode.com/problems/design-add-and-search-words-data-structure/
//        Design_Add_and_Search_Words_Data_Structure wordDictionary = new Design_Add_and_Search_Words_Data_Structure();
//        wordDictionary.addWord("bad");
//        wordDictionary.addWord("dad");
//        wordDictionary.addWord("mad");
//        System.out.println(wordDictionary.search("pad")); // return False
//        System.out.println(wordDictionary.search("bad")); // return True
//        System.out.println(wordDictionary.search(".ad")); // return True
//        System.out.println(wordDictionary.search("b..")); // return True

        //17. Letter Combinations of a Phone Number - https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
//        String digits = "23";
//        System.out.println(Letter_Combinations_of_a_Phone_Number.letterCombinations(digits));

        //77. Combinations - https://leetcode.com/problems/combinations/description/
//        int n = 4, k = 2;
//        System.out.println(Combinations.combine(n, k));

        //46. Permutations - https://leetcode.com/problems/permutations/description/
//        int[] nums = {1,2,3};
//        System.out.println(Permutations.permute(nums));

        //39. Combination Sum - https://leetcode.com/problems/combination-sum/description/
//        int[] candidates = {2,3,5};
//        int target = 8;
//        System.out.println(Combination_Sum.combinationSum(candidates, target));

        //22. Generate Parentheses - https://leetcode.com/problems/generate-parentheses/
//        int n = 3;
//        System.out.println(Generate_Parentheses.generateParenthesis(n));

        //79. Word Search - https://leetcode.com/problems/word-search/description/
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
             };
        String word = "SEE";
        System.out.println(Word_Search.exist(board, word));
    }
}

