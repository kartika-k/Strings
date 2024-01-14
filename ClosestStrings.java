class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int d1 = -1;
        int d2 = -1;
        int minDist = Integer.MAX_VALUE;
        
        for(int i=0; i<s.size(); i++){
            //check if curr element in string is equal to word1
            if(s.get(i).equals(word1)){
                d1 = i;
                if(d2 != -1){
                    //calculate min dist b/w d1 and d2
                    int dist = Math.abs(d2-d1);
                    minDist = minDist > dist ? dist : minDist;
                }
            }
            //check if curr element in string is equal to word2
            if(s.get(i).equals(word2)){
                d2 = i;
                if(d1 != -1){
                    int dist = Math.abs(d2-d1);
                    minDist = minDist > dist ? dist : minDist;
                }
            }
        }
        return minDist;
    }
};
