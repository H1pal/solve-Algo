class Solution {
public:
    void backtrack(vector<string>& answer, int n, string str, int openAmount, int closeAmount) {
      if (openAmount + closeAmount == n * 2) {
        answer.push_back(str);
        return;
      }
      if (openAmount < n) backtrack(answer, n, str + "(", openAmount + 1, closeAmount);
      if (openAmount > closeAmount) backtrack(answer, n, str + ")", openAmount, closeAmount + 1);
    }
    vector<string> generateParenthesis(int n) {
      vector<string> answer;
      backtrack(answer, n, "", 0, 0);
      return answer;
    }
};