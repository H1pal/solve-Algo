class Solution {
public:
    bool isValid(const string& s) {
      stack<char> brackets;
      bool isValid = true;

      for (const char& ch: s) {
        switch (ch) {
          case '(': case '{': case '[':
            brackets.push(ch);
            break;
          case ')':
            if (brackets.empty() || brackets.top() != '(') return false;
            brackets.pop();
            break;
          case '}': 
            if (brackets.empty() || brackets.top() != '{') return false;
            brackets.pop();
            break;
          case ']': 
            if (brackets.empty() || brackets.top() != '[') return false;
            brackets.pop();
            break;
        }
      }
      
      return brackets.empty();
    }
};