/*
8. Evaluation of Postfix Expression
Given string S representing a postfix expression, the task is to evaluate the expression
and find the final value. Operators will only include the basic arithmetic operators like *,
/, + and -.
Example 1:
Input: S = "231*+9-"
Output: -4
Explanation:
After solving the given expression,
we have -4 as a result.
Example 2:
Input: S = "123+*8-"
Output: -3
Explanation:
After solving the given postfix
expression, we have -3 as a result.
Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)
Constraints:
1 ≤ |S| ≤ 105
0 ≤ |Si|≤ 9 (And given operators)
*/