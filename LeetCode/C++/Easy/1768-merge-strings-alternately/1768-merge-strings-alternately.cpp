class Solution {
public:
    string mergeAlternately(string word1, string word2) {
      auto ch1 = word1.begin();
      auto ch2 = word2.begin();
      string answer = "";
      while (ch1 != word1.end() || ch2 != word2.end()) {
        if (ch1 != word1.end()) answer += *(ch1++);
        if (ch2 != word2.end()) answer += *(ch2++);
      }
      return answer;
    }
};