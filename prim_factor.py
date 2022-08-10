#! /bin/python3
# project euler problem 3

def generate_primes(n):
	numbers_list = list(range(2,n+1))
	for i in list(range(2,n)):
		if i in numbers_list:
			x = i
			while x < n:
				x += i 
				if x in numbers_list:
					numbers_list.remove(x)
	return numbers_list


n = 100
x = 600851475143
largest_prime = 0

while x >= n:
	primes_list = generate_primes(n)
	for p in primes_list:
		while x % p == 0:
			largest_prime = p
			print("found larger prime: "+str(largest_prime))
			x = x/p
	n = int(min(n * 2, x))
	if x == 1:
		break
	print("x is: " + str(x) + " n is : " + str(n))
print(largest_prime)
