class Solution {
public:
    vector<int> maxDepthAfterSplit(string seq) {
      const int len = seq.length();
      vector<int> answer(len, 0);
      bool isA = false;
      for (int i = 0;i < len;i++) {
        const char ch = seq[i];
        if (ch == '(') isA = !isA;
        answer[i] += isA;
        if (ch == ')') isA = !isA;
      }
      return answer;
    }
};