class Solution {
public:
    int sumCounts(vector<int>& nums) {
      const int nums_size = nums.size();
      unordered_set<int> s;

      int result = nums_size;

      for (int i = 0;i < nums_size-1;i++) {
        s.insert(nums[i]);
        for (int j = i+1;j < nums_size;j++) {
          s.insert(nums[j]);

          const int distinct = s.size();
          result += distinct * distinct;
        }
        s.clear();
      }
      return result;
    }
};