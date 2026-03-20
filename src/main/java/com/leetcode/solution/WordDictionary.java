package com.leetcode.solution;

public class WordDictionary {
    //211. Design Add and Search Words Data Structure - https://leetcode.com/problems/design-add-and-search-words-data-structure/

    /*
     * Design a data structure that supports adding new words and finding if a string matches any previously added string.
     *
     * Implement the WordDictionary class:
     * - WordDictionary() Initializes the object.
     * - void addWord(word) Adds word to the data structure, it can be matched later.
     * - bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise.
     * - word may contain dots '.' where dots can be matched with any letter.
     *
     * Example:
     *      Input:  ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
     *              [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
     *      Output: [null,null,null,null,false,true,true,true]
     * Explanation
     *      WordDictionary wordDictionary = new WordDictionary();
     *      wordDictionary.addWord("bad");
     *      wordDictionary.addWord("dad");
     *      wordDictionary.addWord("mad");
     *      wordDictionary.search("pad"); // return False
     *      wordDictionary.search("bad"); // return True
     *      wordDictionary.search(".ad"); // return True
     *      wordDictionary.search("b.."); // return True
     *
     * Constraints:
     *      1 <= word.length <= 25
     *      word in addWord consists of lowercase English letters.
     *      word in search consist of '.' or lowercase English letters.
     *      There will be at most 2 dots in word for search queries.
     *      At most 104 calls will be made to addWord and search.
     */
    private WordDictionary[] child;
    private boolean isEnd;

    public WordDictionary() {

        child = new WordDictionary[26];
        isEnd = false;
    }

    public void addWord(String word) {

        WordDictionary curr = this;

        for(char c : word.toCharArray()) {

            if(curr.child[c - 'a'] == null)
                curr.child[c - 'a'] = new WordDictionary();

            curr = curr.child[c - 'a'];
        }

        curr.isEnd = true;
    }

    public boolean search(String word) {
        return search(word, this, 0);
    }

    private boolean search(String word, WordDictionary curr, int index) {

        if(index == word.length()) {
            return curr.isEnd;
        }

        char c = word.charAt(index);

        if(c == '.') {

            for(WordDictionary child : curr.child) {

                if(child != null && search(word, child,index + 1)) {
                    return true;
                }
            }

            return false;

        } else {

            if(curr.child[c - 'a'] == null) {
                return false;
            }

            return search(word, curr.child[c - 'a'], index + 1);
        }
    }
}
