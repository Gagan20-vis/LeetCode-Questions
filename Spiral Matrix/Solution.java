class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();

        int row = matrix.length; // row
        int cols = matrix[0].length; // col

        int row_start =0,row_end= row-1;
        int cols_start = 0,cols_end = cols-1;
        while(row_start<=row_end && cols_start <= cols_end){

            for(int i = cols_start;i<=cols_end;i++)
                li.add(matrix[row_start][i]);

            row_start++;
            if(row_start > row_end) break;
            for(int i=row_start;i<=row_end;i++)
                li.add(matrix[i][cols_end]);

            cols_end--;
            if(cols_start > cols_end) break;
            for(int i=cols_end;i>=cols_start;i--)
                li.add(matrix[row_end][i]);

            row_end--;
            if(row_start > row_end) break;
            for(int i = row_end;i>=row_start;i--)
                li.add(matrix[i][cols_start]);

            cols_start++;
        }
        return li;
    }
}