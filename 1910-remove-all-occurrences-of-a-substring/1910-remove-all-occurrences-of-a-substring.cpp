class Solution {
public:
    string removeOccurrences(string s, string part) {
        int n = part.size();
        while(true) {
            int index = s.find(part);
            if(index == -1)
                break;
            s.erase(index, n);
        }
        return s;
    }
};