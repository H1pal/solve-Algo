class Solution {
public:
    vector<int> maxDepthAfterSplit(string seq) {
      vector<int> answer;
      bool isA = false;
      for (const char ch: seq) {
        if (ch == '(') isA = !isA;
        answer.push_back(isA);
        if (ch == ')') isA = !isA;
      }
      return answer;
    }
};