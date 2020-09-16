s = str(input())
x = str(input())
a = '' 
for i in range (0,len(s),1):
  if s[i]==x:
    continue
  a = a + (s[i])
print(a)