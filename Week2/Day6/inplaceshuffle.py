import random
def rand(low,high):
    return random.randint(low,high)
def shuffle(input):
    n = len(input)
    for x in range(0,n-1):
        y = rand(x,n-1)
        input[x],input[y] = input[y],input[x]


sample_list = [1, 2, 3, 4, 5]
print 'Sample list:', sample_list

print 'Shuffling sample list...'
shuffle(sample_list)
print 'Shuffling sample list...', sample_list