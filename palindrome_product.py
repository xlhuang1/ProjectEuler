#! /bin/python3
# project euler problem 4

x = 800
largest_seen = 800*800
while x < 1000:
	for y in list(range(100,1000)):
		n = str(x * y)
		p = []
		q = []
		for c in n:
			p.append(c)
			q.insert(0, c)
		if p == q:
			if x * y > largest_seen:
				largest_seen = x*y
				print(n)
	x += 1
print(largest_seen)
	
