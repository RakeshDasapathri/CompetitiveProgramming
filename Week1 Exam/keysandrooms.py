l=[[1], [2,3], [1,2], [4], [1], [5]]
for i in range(1,len(l)):
	for j in range(len(l)):
		if i in l[j] and i!=j:
			# print("1")
			flag=True
			break
		else:
			# print("2")
			flag=False
	if(flag==False):
		break
print(flag)