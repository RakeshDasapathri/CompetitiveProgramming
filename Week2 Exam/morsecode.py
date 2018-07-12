ml=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
"-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."	] 


til=[["gin", "zen", "gig", "msg"],["a", "z", "g", "m"],["bhi", "vsv", "sgh", "vbi"],["a", "b", "c", "d"],["hig", "sip", "pot"]]
for k in til:
	il=k
	ol=[]
	for i in range(len(il)):	
		s=''
		for ch in il[i].upper():
			s+=ml[ord(ch)-65]
		ol.append(s)

	temp=[]
	for j in ol:
		if j not in temp:
			temp.append(j)
	print(len(temp),end=" ")