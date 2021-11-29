1812. Determine Color of a Chessboard Square

You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.


Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.

class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a[] = coordinates.toCharArray();
        boolean left = (a[0]-'a'+1)%2==0;
        boolean right = (a[1]-'0')%2==0;
        if(left && right){
            return false;   
        }else if(!left && !right){
            return false;   
        }else 
        return true;
    }
}