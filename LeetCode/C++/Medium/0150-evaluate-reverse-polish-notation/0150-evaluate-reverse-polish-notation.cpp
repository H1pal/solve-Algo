class Solution {
public:
    int evalRPN(vector<string>& tokens) {
      stack<int> st;
      int len = tokens.size();
      for (int i = 0;i < len;i++) {
        string ch = tokens[i];
        if (ch == "+") {
          int n2 = st.top();
          st.pop();
          int n1 = st.top();
          st.pop();
          st.push(n1 + n2);
        }
        else if (ch == "-") {
          int n2 = st.top();
          st.pop();
          int n1 = st.top();
          st.pop();
          st.push(n1 - n2);
        }
        else if (ch == "*") {
          int n2 = st.top();
          st.pop();
          int n1 = st.top();
          st.pop();
          st.push(n1 * n2);
        }
        else if (ch == "/") {
          int n2 = st.top();
          st.pop();
          int n1 = st.top();
          st.pop();
          st.push(n1 / n2);
        }
        else st.push(stoi(ch));
      }
      return st.top();
    }
};