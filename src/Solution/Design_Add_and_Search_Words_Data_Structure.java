package Solution;

public class Design_Add_and_Search_Words_Data_Structure {
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
     *
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
    Node root;

    public Design_Add_and_Search_Words_Data_Structure() {
        root = new Node('\0');
    }

    public void addWord(String word) {

        Node curr = root;
        char[] ch = word.toCharArray();

        for(char c : ch) {
            if(curr.child[c - 'a'] == null)
                curr.child[c - 'a'] = new Node(c);
            curr = curr.child[c - 'a'];
        }

        curr.isEnd = true;
    }

    public boolean search(String word) {
        return search(root, word);
    }

    private boolean search(Node curr, String word) {

        char[] ch = word.toCharArray();

        for(int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if(c == '.') {
                for(Node subCurr : curr.child) {
                    if (subCurr != null && search(subCurr, word.substring(i + 1)))
                        return true;
                }
                return false;
            } else {
                if(curr.child[c - 'a'] == null)
                    return false;
                curr = curr.child[c - 'a'];
            }
        }

        return curr.isEnd && curr != null;
    }

    class Node {
        private char val;
        private boolean isEnd;
        private Node[] child;

        public Node(char val) {
            this.val = val;
            this.isEnd = false;
            this.child = new Node[26];
        }
    }
}
