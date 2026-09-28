class Solution {
public:
    int maxDepth(string s) {
      int max_depth = 0;
      int depth = 0;
      for (const char ch: s) {
        switch (ch) {
          case '(':
            depth++;
            break;
          case ')':
            if (depth > max_depth) max_depth = depth;
            depth--;
            break;
        }
      }
      return max_depth;
    }
};