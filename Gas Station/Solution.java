class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length,totalfuel = 0,totalcost = 0,curr_sum = 0,start = 0;

        for(int i:gas) totalfuel += i;
        for(int i:cost) totalcost += i;

        if(totalfuel<totalcost) return -1;

        for(int i = 0;i<n;i++){
            curr_sum += gas[i]-cost[i];
            if(curr_sum <0){
                start = i+1;
                curr_sum = 0;
            }
        }
        return start;
    }
}