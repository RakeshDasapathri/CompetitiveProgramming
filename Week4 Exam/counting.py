def count(num):
	num=bin(num)
	num=num[2:]
	count=0
	for ch in num:
		if(ch=='1'):
			count+=1
	return count

lst=[5,15,16,1,25,5,6]
for l in lst:
	res=[]
	for i in range(l+1):
		res.append(count(i))
	print(res)
		