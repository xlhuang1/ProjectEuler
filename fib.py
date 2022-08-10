#! /bin/python3
# project euler problem 2

current_sum = 0
prev_fib = 1
current_fib = 2

while current_fib < 4000000:
	if current_fib % 2 == 0:
		current_sum += current_fib
	current_fib = prev_fib + current_fib
	prev_fib = current_fib - prev_fib

print(current_sum)
