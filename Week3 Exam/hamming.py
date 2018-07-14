a=int(input(""))
b=int(input(""))

a=str(bin(a))
b=str(bin(b))

a=a[2:]
b=b[2:]


print(a,b)
a=a[::-1]
b=b[::-1]
print(a,b)
if(abs(len(a)-len(b))!=0):
	if(len(a)>len(b)):
		b=b+(abs(len(a)-len(b))*'0')
	a=a+(abs(len(a)-len(b))*'0')
		

print(a,b)
count=0
for i in range(len(a)):
	if(a[i]!=b[i]):
		count+=1

print(count)