#! /bin/python3

sum_multiples = 0
for i in list(range(1000)):
	if (i % 3 == 0) or (i % 5 == 0):
		sum_multiples += i

print(sum_multiples)
