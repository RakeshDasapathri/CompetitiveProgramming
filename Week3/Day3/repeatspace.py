import unittest


def find_duplicate(int_list):

    # Find a number that appears more than once ... in O(n) time
    length = len(int_list)
    var1 = length
    var2 = length
    while True:
        var1 = int_list[var1-1]
        var2 = int_list[var2-1]
        var2 = int_list[var2-1]
        if var1 == var2:
            break
    var2 = length

    while True:
        var1 = int_list[var1-1]
        var2 = int_list[var2-1]
        if var1 == var2:
            break
    return var1
    
    
    

# Tests

class Test(unittest.TestCase):

    def test_just_the_repeated_number(self):
        actual = find_duplicate([1, 1])
        expected = 1
        self.assertEqual(actual, expected)

    def test_short_list(self):
        actual = find_duplicate([1, 2, 3, 2])
        expected = 2
        self.assertEqual(actual, expected)

    def test_medium_list(self):
        actual = find_duplicate([1, 2, 5, 5, 5, 5])
        expected = 5
        self.assertEqual(actual, expected)

    def test_long_list(self):
        actual = find_duplicate([4, 1, 4, 8, 3, 2, 7, 6, 5])
        expected = 4
        self.assertEqual(actual, expected)


unittest.main(verbosity=2)