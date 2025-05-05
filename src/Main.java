import Solution.*;
import Util.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //2239. Find Closest Number to Zero - https://leetcode.com/problems/find-closest-number-to-zero/
//        int[] nums = {-4,-2,1,4,8};
//        FindClosestNumber solution = new FindClosestNumber();
//        System.out.println(solution.findClosestNumber(nums));

        //1768. Merge Strings Alternately - https://leetcode.com/problems/merge-strings-alternately/description/
//        String word1 = "abc", word2 = "pqr";
//        MergeAlternately solution = new MergeAlternately();
//        System.out.print(solution.mergeAlternately(word1, word2));

        //13. Roman to Integer - https://leetcode.com/problems/roman-to-integer/
//        String s = "MCMXCIV";
//        RomanToInt solution = new RomanToInt();
//        System.out.println(solution.romanToInt(s));

        //392. Is Subsequence - https://leetcode.com/problems/is-subsequence/description/
//        String s = "acb", t = "ahbgdc";
//        IsSubsequence solution = new IsSubsequence();
//        System.out.println(solution.isSubsequence(s,t));

        //121. Best Time to Buy and Sell Stock - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//        int[] prices = {7,1,5,3,6,4};
//        MaxProfit solution = new MaxProfit();
//        System.out.println(solution.maxProfit(prices));

        //14. Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"ab","a"};
//        LongestCommonPrefix solution = new LongestCommonPrefix();
//        System.out.println(solution.longestCommonPrefix(strs));

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
//        ContainsDuplicate solution = new ContainsDuplicate();
//        System.out.println(solution.containsDuplicate(nums));

        //242. Valid Anagram - https://leetcode.com/problems/valid-anagram/description/
//        String s = "anagram", t = "nagaram";
//        IsAnagram solution = new IsAnagram();
//        System.out.println(solution.isAnagram(s, t));

        //1189. Maximum Number of Balloons - https://leetcode.com/problems/maximum-number-of-balloons/description/
//        String text = "nlaebolko";
//        MaxNumberOfBalloons solution = new MaxNumberOfBalloons();
//        System.out.println(solution.maxNumberOfBalloons(text));

        //1. Two Sum - https://leetcode.com/problems/two-sum/description/
//        int[] nums = {3,3};
//        int target = 6;
//        TwoSum solution = new TwoSum();
//        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

        //169. Majority Element - https://leetcode.com/problems/majority-element/description/
//        int[] nums = {2,2,1,1,1,2,2};
//        MajorityElement solution = new MajorityElement();
//        System.out.println(solution.majorityElement(nums));

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
//        IsPalindrome solution = new IsPalindrome();
//        System.out.println(solution.isPalindrome(s));

        //682. Baseball Game - https://leetcode.com/problems/baseball-game/description/
//        String[] ops = {"5","2","C","D","+"};
//        String[] ops = {"5","-2","4","C","D","9","+","+"};
//        CalPoints solution = new CalPoints();
//        System.out.println(solution.calPoints(ops));

        //20. Valid Parentheses - https://leetcode.com/problems/valid-parentheses/description/
//        String s = "]";
//        IsValid solution = new IsValid();
//        System.out.println(solution.isValid(s));

        //83. Remove Duplicates from Sorted List - https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        DeleteDuplicates solution = new DeleteDuplicates();
//        head = solution.deleteDuplicates(head);
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
//        HasCycle solution = new HasCycle();
//        System.out.println(solution.hasCycle(head));

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
//        int num = 2147483647;
//        IsPerfectSquare solution = new IsPerfectSquare();
//        System.out.println(solution.isPerfectSquare(num));

        //643. Maximum Average Subarray I - https://leetcode.com/problems/maximum-average-subarray-i/description/
//        int[] nums = {1,12,-5,-6,50,3};
//        int k = 4;
//        FindMaxAverage solution = new FindMaxAverage();
//        System.out.println(solution.findMaxAverage(nums, k));

        //226. Invert Binary Tree - https://leetcode.com/problems/invert-binary-tree/description/
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(9);
//        InvertTree solution = new InvertTree();
//        root = solution.invertTree(root);

        //104. Maximum Depth of Binary Tree - https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        MaxDepth solution = new MaxDepth();
//        System.out.println(solution.maxDepth(root));

        //110. Balanced Binary Tree - https://leetcode.com/problems/balanced-binary-tree/description/
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        IsBalanced solution = new IsBalanced();
//        System.out.println(solution.isBalanced(root));

        //1046. Last Stone Weight - https://leetcode.com/problems/last-stone-weight/description/
        int[] stones = {2,7,4,1,8,1};
        LastStoneWeight solution = new LastStoneWeight();
        System.out.println(solution.lastStoneWeight(stones));
    }
}

