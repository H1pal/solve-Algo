class Solution {
public:
    bool checkValidString(const string& s) {
      int p = 0, n = 0;

      for (const char& ch: s) {
        if (ch == '(') {
          p++;
          n++;
        }
        else if (ch == ')') {
          p--;
          n--;
        }
        else {
          p++;
          n--;
        }

        if (p < 0) return false;
        if (n < 0) n = 0;
      }
      
      return n == 0;
    }
};