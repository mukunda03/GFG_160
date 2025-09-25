/*
Time Complexity :  O(nlogn + n*m²) 
Space Complexity : O(n*m)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        
        HashMap<String, Integer> dp = new HashMap<>();
        
        int res = 1;
        
        for(String w : words){
            dp.put(w,1);
            
            for(int i =0;i < w.length(); i++){
                String pred = w.substring(0,i) + w.substring(i+1);
                if(dp.containsKey(pred)){
                    dp.put(w, Math.max(dp.get(w), dp.get(pred) +1));
                }
            }
            res = Math.max(res, dp.get(w));
        }
        return res;
    }
}
