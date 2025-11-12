/*
Time Complexity:
insert() → O(L)
search() → O(L)
isPrefix() → O(P)
Space Complexity: O(N * L)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

// User function Template for Java
class TrieNode{
    TrieNode[] children;
    boolean isLeaf;
    
    TrieNode(){
        children = new TrieNode[26];
        isLeaf = false;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        // Implement Trie
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.children[c - 'a'] == null){
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c-'a'];
        }
        curr.isLeaf = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return curr.isLeaf;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                return false;
            }
            curr = curr.children[c-'a'];
        }
        return true;
    }
}
