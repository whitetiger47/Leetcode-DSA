class Solution {
    public int maximalSquare(char[][] matrix) {
        int ans = 0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i =0; i<matrix.length; i++) {
            if(matrix[i][0]=='1') {
                dp[i][0] = 1;
                ans = 1;
            }
        }
        for(int i=0; i<matrix[0].length;i++) {
            if(matrix[0][i]=='1') {
                dp[0][i]=1;
                ans=1;
            }
        }
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length;j++) {
                if(matrix[i][j]=='1') {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    ans=Math.max(ans,dp[i][j]);
                }
            }
        }
        return ans*ans;
    }
}