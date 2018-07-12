input_list=[
				[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]],
				[[12,0], [6,3], [3,4], [9,2], [11,1], [1,5]],
				[[2,4], [5,1], [3,3], [1,5], [4,2], [6,0]]
			]

output_list=[
				[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]],
				[[12,0],[11,1],[9,2],[6,3],[3,4],[1,5]],
				[[6,0], [5,1], [4,2], [3,3], [2,4], [1,5]]
			]
final_list=[]

for lst in input_list:
	lst=sorted(lst)
	# print(lst)
	lst.reverse()
	# print(lst)
	for i in range(len(lst)-1):
		if(lst[i][0]==lst[i+1][0]):
			if(lst[i][1]>lst[i+1][1]):
				lst[i],lst[i+1]=lst[i+1],lst[i]
				i=0
	output = []
	# print(lst)
	for j in lst:
		output.insert(j[1], j)
	   
	final_list.append(output)
	# print(output)

print(final_list==output_list)