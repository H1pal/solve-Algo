class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
      const int nums_size = nums.size();
      vector<int> answer;

      sort(nums.begin(), nums.end());
      for (int i = 0;i < nums_size;i++) {
        const int& num = nums[i];
        if (num == target) answer.push_back(i);
      }
      return answer;
    }
};