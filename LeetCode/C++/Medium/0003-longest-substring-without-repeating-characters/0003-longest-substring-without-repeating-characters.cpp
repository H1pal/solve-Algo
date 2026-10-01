class Solution {
public:
    int lengthOfLongestSubstring(string s) {
      const int s_size = s.length();
      map<char, int> dup;
      int start = 0;
      int maxLen = 0;

      for (int i = 0;i < s_size;i++) {
        const char ch = s[i];
        if (dup.count(ch) && dup[ch] >= start) {
          start = dup[ch] + 1;
        }
        dup[ch] = i;
        maxLen = max(maxLen, i - start + 1);
      }
      return maxLen;
    }
};