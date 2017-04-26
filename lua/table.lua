#!/usr/bin/env lua

-- table data type

--[[
a.x和a[x]区别
    a.x表示 a["x"]， 以字符串x来索引table
    a[x] 表示以变量x来索引table
--]]


local t1 = { a = "a1", b = "b1", c = "c1",  d = "d1";    "100b", "100a", "100c", "100d"}   --, ;

--[[
get value
--]]
print("t1.a的value是(t1.a): "..t1.a)
print("t1.a的value是(t1[\"a\"]): "..t1["a"])






--[[
table.concat(table, sep, start, end): print for arry part
--]]
print(table.concat(t1, "___"))
print(table.concat(t1, "___",1,3))


--[[
sort:
table.sort(table, comp)
default: asc
sortfunc = function(a, b) return b < a end   : desc
--]]
table.sort(t1)
print("升序排序: "..table.concat(t1, ", "))

local sortfunc = function(a, b) return b < a end
sortfunc = function(a, b) return b < a end
table.sort(t1, sortfunc)
print("降序排序: "..table.concat(t1, ", "))


--[[
arry length
#table
table.getn(table)
--]]
print("t1 table的数组长度是(#t1): "..#t1)
print("t1 table的数组长度是(table.getn(t1)): "..table.getn(t1))


--[[
table.insert(table, pos, value)
--]]
table.insert(t1, 1, "100_start_insert")   --can't cover 100d, add a new item
table.insert(t1, "100_end_insert")  -- default pos is in the end of table
table.insert(t1, 1000)  -- default pos is in the end of table
print(table.concat(t1, ", "))


--[[
table.maxn(table)
返回所有正数key中最大的key
--]]
print(table.maxn(t1))
print(#t1)


--[[
table.remove(table, pos)
pos: 除并返回table数组部分pos位置的元素, 后面元素前移, 默认为table长度, 从最后删起
--]]
print('delete item: '..table.remove(t1, 6))
print('delete item: '..table.remove(t1, 2))
print('table t1: '..table.concat(t1, ", "))


--[[
table.forearchi(table, function(i,v))
    遍历数组部分(key>=1), 并逐对进行function操作
table.forearch(table, function(i,v))
    遍历整个table, 并逐对进行function操作
--]]
print("tabe.forearhci...")
table.foreachi(t1, function(i,v) print(i,v) end)  -- table.forearchi(t1, print)

print("\ntabe.forearhci...")
table.foreach(t1, print)



