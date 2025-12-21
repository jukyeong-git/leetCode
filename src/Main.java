import Solution.*;
import Util.ListNode;
import Util.Node;
import Util.TreeNode;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //2239. Find Closest Number to Zero - https://leetcode.com/problems/find-closest-number-to-zero/
//        int[] nums = {-4,-2,1,4,8};
//        System.out.println(Find_Closest_Number_to_Zero.findClosestNumber(nums));

        //1768. Merge Strings Alternately - https://leetcode.com/problems/merge-strings-alternately/description/
//        String word1 = "abc", word2 = "pqr";
//        MergeAlternately solution = new MergeAlternately();
//        System.out.print(solution.mergeAlternately(word1, word2));

        //13. Roman to Integer - https://leetcode.com/problems/roman-to-integer/
//        String s = "MCMXCIV";
//        System.out.println(Roman_to_Integer.romanToInt(s));

        //392. Is Subsequence - https://leetcode.com/problems/is-subsequence/description/
//        String s = "abc", t = "ahbgdc";
//        System.out.println(Is_Subsequence.isSubsequence(s,t));

        //121. Best Time to Buy and Sell Stock - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//        int[] prices = {7,1,5,3,6,4};
//        MaxProfit solution = new MaxProfit();
//        System.out.println(solution.maxProfit(prices));

        //14. Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/
//        String[] strs = {"flower","flower","flower", "flower"};
//        String[] strs = {"abb","abc"};
//        System.out.println(Longest_Common_Prefix.longestCommonPrefix(strs));

        //228. Summary Ranges - https://leetcode.com/problems/summary-ranges/description/
//        int[] nums = {0,1,2,4,5,7};
//        int[] nums = {0,2,3,4,6,8,9};
//        SummaryRanges solution = new SummaryRanges();
//        System.out.println(solution.summaryRanges(nums));

        //771. Jewels and Stones - https://leetcode.com/problems/jewels-and-stones/description/
//        String jewels = "aA", stones = "aAAbbbb";
//        String jewels = "z", stones = "ZZ";
//        NumJewelsInStones solution = new NumJewelsInStones();
//        System.out.println(solution.numJewelsInStones(jewels, stones));

        //217. Contains Duplicate - https://leetcode.com/problems/contains-duplicate/description/
//        int[] nums = {1,2,3,1};
//        System.out.println(Contains_Duplicate.containsDuplicate(nums));

        //242. Valid Anagram - https://leetcode.com/problems/valid-anagram/description/
//        String s = "anagram", t = "nagaram";
//        System.out.println(Valid_Anagram.isAnagram(s, t));

        //1189. Maximum Number of Balloons - https://leetcode.com/problems/maximum-number-of-balloons/description/
//        String text = "nlaebolko";
//        MaxNumberOfBalloons solution = new MaxNumberOfBalloons();
//        System.out.println(solution.maxNumberOfBalloons(text));

        //1. Two Three_Sum - https://leetcode.com/problems/two-sum/description/
//        int[] nums = {2,5,5,11};
//        int target = 10;
//        TwoSum solution = new TwoSum();
//        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

        //169. Majority Element - https://leetcode.com/problems/majority-element/description/
//        int[] nums = {2,2,1,1,1,2,2};
//        System.out.println(Majority_Element.majorityElement(nums));

        //977. Squares of a Sorted Array - https://leetcode.com/problems/squares-of-a-sorted-array/description/
//        int[] nums = {-4,-1,0,3,10};
//        SortedSquares solution = new SortedSquares();
//        System.out.println(Arrays.toString(solution.sortedSquares(nums)));

        //344. Reverse String - https://leetcode.com/problems/reverse-string/description/
//        char[] s = {'h','e','l','l','o'};
//        ReverseString solution = new ReverseString();
//        solution.reverseString(s);

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
//        ReverseList solution = new ReverseList();
//        ListNode result = null;
//        result = solution.reverseList(head);
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
//        MergeTwoLists solution = new MergeTwoLists();
//        result = solution.mergeTwoLists(list1, list2);
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
//        MiddleNode solution = new MiddleNode();
//        result = solution.middleNode(head);
//        while(result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }

        //704. Binary Search - https://leetcode.com/problems/binary-search/description/
//        int[] nums = {-1,0,3,5,9,12};
//        int target = 9;
//        Search solution = new Search();
//        System.out.println(solution.search(nums, target));

        //35. Search Insert Position - https://leetcode.com/problems/search-insert-position/description/
//        int[] nums = {1,3,5,6};
//        int target = 7;
//        SearchInsert solution = new SearchInsert();
//        System.out.println(solution.searchInsert(nums, target));

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
//        ValidPath solution = new ValidPath();
//        System.out.println(solution.validPath(n, edges, source, destination));

        //509. Fibonacci Number - https://leetcode.com/problems/fibonacci-number/description/
//        int n = 2;
//        System.out.println(Fibonacci_Number.fib(n));

        //70. Climbing Stairs - https://leetcode.com/problems/climbing-stairs/description/
//        int n = 4;
//        System.out.println(Climbing_Stairs.climbStairs(n));

        //746. Min Cost Climbing Stairs - https://leetcode.com/problems/min-cost-climbing-stairs/description/
//        int[] cost = {10,15,20};
//        MinCostClimbingStairs solution = new MinCostClimbingStairs();
//        System.out.println(solution.minCostClimbingStairs(cost));

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
//        MergeSortedArray.merge(nums1, m, nums2, n);

        //27. Remove Element - https://leetcode.com/problems/remove-element/description
//        int[] nums = {3,2,2,3};
//        int val = 3;
//        System.out.println(RemoveElement.removeElement(nums,val));

        //26. Remove Duplicates from Sorted Array - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(RemoveDuplicatesfromSortedArray.removeDuplicates(nums));

        //80. Remove Duplicates from Sorted Array II - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description
//        int[] nums = {1,1,1,2,2,3};
//        System.out.println(RemoveDuplicatesfromSortedArrayII.removeDuplicates(nums));

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
//        System.out.println(WordPattern.wordPattern(pattern, s));

        //56. Merge Intervals - https://leetcode.com/problems/merge-intervals/description/
//        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        int[][] intervals = {{4,7},{1,4}};
//        System.out.println(Arrays.deepToString(MergeIntervals.merge(intervals)));

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
//        System.out.println(SimplifyPath.simplifyPath(path));

        //209. Minimum Size Subarray Three_Sum - https://leetcode.com/problems/minimum-size-subarray-sum/description/
//        int target = 7;
//        int[] nums = {2,3,1,2,4,3};
//        System.out.println(MinimumSizeSubarraySum.minSubArrayLen(target, nums));

        //155. Min Stack - https://leetcode.com/problems/min-stack/description/
//        MinStack minStack = new MinStack();
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
//            System.out.print(result.val);
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
//        RotateArray.rotate(nums, k);

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
//        System.out.println(MinimumOperationsToHalveArraySum.halveArray(nums));

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
//        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
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
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Group_Anagrams.groupAnagrams(strs));

    }
}


