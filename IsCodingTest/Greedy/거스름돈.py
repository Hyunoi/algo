# 87p

total = 1260

coins = [ 500, 100, 50, 10 ]

count = 0

for coin in coins:
    count += total // coin
    total = total % coin

print(count)