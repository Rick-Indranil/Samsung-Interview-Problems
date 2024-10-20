class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n=matrix[0].length;
        Map<List<Integer>, Integer> mpp=new HashMap<>();
        int ans=0;
        for(int[] it:matrix)
        {
            List<Integer> ls=new ArrayList<>();
            if(it[0]==1)
            {
                for(int j:it)
                {
                    ls.add(j);
                }
            }
            else
            {
                for(int j:it)
                {
                    ls.add(j^1);
                }
            }
            mpp.put(ls, mpp.getOrDefault(ls, 0)+1);
            ans=Math.max(ans, mpp.get(ls));
        }
        return ans;
    }
}
