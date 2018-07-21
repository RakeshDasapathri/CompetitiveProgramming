lst=[22,0,55,-5,12354,6,256]
# lst=[12354]
for l in lst:
	b=bin(l)
	b=b[2:]
	# print(b)
	countmax=0;
	for i in range(len(b)):
		countvar=0;
		for j in range(i,len(b)):
			if(b[j]=='1'):
				countvar+=1
			else:
				break
		if(countvar>countmax):
			countmax=countvar
	print(countmax)

