import unittest

from collections import deque
def get_closing_paren(s, i):
    if s[i] != '(':
        return -1

    d = deque()
 
    for k in range(i, len(s)):
 
        if s[k] == ')':
            d.popleft()
 
        elif s[k] == '(':
            d.append(s[i])
 
        if not d:
            return k
 
    raise Exception()


















# Tests

class Test(unittest.TestCase):

    def test_all_openers_then_closers(self):
        actual = get_closing_paren('((((()))))', 2)
        expected = 7
        self.assertEqual(actual, expected)


    def test_mixed_openers_and_closers(self):
        actual = get_closing_paren('()()((()()))', 5)
        expected = 10
        self.assertEqual(actual, expected)

    def test_no_matching_closer(self):
        with self.assertRaises(Exception):
            get_closing_paren('()(()', 2)


unittest.main(verbosity=2)