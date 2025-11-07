/*
Time Complexity :  O(n*m)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public String findOrder(String[] words) {
        // code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        int[] inDegree = new int[26];
        
        boolean[] exists = new boolean[26];
        
        for(int i = 0; i< 26; i++){
            graph.add(new ArrayList<>());
        }
        
        for(String word : words){
            for(char ch : word.toCharArray()){
                exists[ch - 'a'] = true;
            }
        }
        
        for(int i =0; i+1 < words.length; ++i){
            String w1 = words[i];
            String w2 = words[i+1];
            int len = Math.min(w1.length(), w2.length());
            int j = 0;
            
            while(j < len && w1.charAt(j) == w2.charAt(j)) ++j;
            
            if(j < len){
                int u = w1.charAt(j) - 'a';
                int v = w2.charAt(j) - 'a';
                graph.get(u).add(v);
                inDegree[v]++;
            }else if(w1.length() > w2.length()){
                return "";
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i< 26; ++i){
            if(exists[i] && inDegree[i] == 0){
                q.offer(i);
            }
        }
        
        String result = "";
        while(!q.isEmpty()){
            int u = q.poll();
            result += (char)(u + 'a');
            
            for(int v : graph.get(u)){
                inDegree[v]--;
                if(inDegree[v] == 0){
                    q.offer(v);
                }
            }
        }
        
        for(int i =0; i <26; ++i){
            if(exists[i] && inDegree[i] != 0){
                return"";
            }
        }
        return result;
    }
}
