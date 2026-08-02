#Given an array of integers "nums" and a target, return indices of the two numbers such that they add up to target.

#Example.

#Input: [2,7,12,14], target =19 

#output: [1,2]


list1 = [2,7,12,14]
target = 25

result = -1



for i in range(len(list1)):
    if target - list1[i] in list1:
        index2 = list1.index(target-list1[i])
        result = [i, index2]

print(result)

    
