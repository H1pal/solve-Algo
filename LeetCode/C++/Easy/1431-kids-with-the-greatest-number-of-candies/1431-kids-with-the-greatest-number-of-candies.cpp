class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, const int& extraCandies) {
      vector<bool> answer(candies.size());

      int max = candies[0];
      for (auto& i: candies) {
        if (i > max) {
          max = i;
        }
        i += extraCandies;
      }
      cout << max << '\n';
      for (auto i: candies) {
        cout << i << " ";
      }
      cout << endl;

      transform(candies.begin(), candies.end(), answer.begin(),
      [max](int n) {
        cout << n << " " << max << " ";
        return n >= max;
      });

      return answer;
    }
};