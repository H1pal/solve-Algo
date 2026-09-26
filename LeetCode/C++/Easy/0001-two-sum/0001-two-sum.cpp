class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int len = nums.size();
        bool chk = false;
        int i, j;
        for (i = 0;i < len-1;i++) {
            for (j = i + 1;j < len;j++) {
                if (nums[i] + nums[j] == target) {
                    chk = true;
                    break;
                };
            }
            if (chk) break;
        }
        return vector<int> {i, j};
    }
};