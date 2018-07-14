from itertools import permutations
class Stack:
	def __init__(self):
		self.items = []
 
	def is_empty(self):
		return self.items == []
 
	def push(self, data):
		self.items.append(data)
 
	def pop(self):
		return self.items.pop()
 
 
def isbalanced(exp):
	s = Stack()
	is_balanced = True
	for c in exp:
		if c == '(':
			s.push(1)
		elif c == ')':
			if s.is_empty():
				is_balanced = False
				break
			s.pop()
	return is_balanced
  
input=[2,3,4,1]
for i in input:
	string=i*'()'
	print(string)
	lst=[''.join(p) for p in permutations(string)]
	count=0
	output=[]
	for l in lst:
		if(isbalanced(l)):
			if l not in output:
				output.append(l)


	print(output,"-",len(output))




 