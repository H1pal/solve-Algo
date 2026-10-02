class Solution {
private:
    int start = 0;
    int maxLen = 0;

    void expandPalindrome(const string& s, int start, int end) {
      while (start >= 0 && end < s.size() && s[start] == s[end]) {
        start--;
        end++;
      }
      
      int curLen = end - start - 1;

      if (curLen > maxLen) {
        maxLen = curLen;
        this->start = start + 1;
      }
    }
public:
    string longestPalindrome(const string& s) {
      const int s_size = s.size();
      if (s_size == 1) return s;
      
      for (int i = 0;i < s_size-1;i++) {
        expandPalindrome(s, i, i);
        expandPalindrome(s, i, i+1);
      }
      return s.substr(start, maxLen);
    }
};