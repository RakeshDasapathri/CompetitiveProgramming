s=input("s string")
t=input("t string")
for i in t.lower():
	if i not in s.lower() and i!=' ':
		flag=False
		break
	else:
		flag=True
print(flag)
