#!/usr/bin/env lua
--[[
statements kids
only [nil false] is false, the others is true

--]]

local name = "ray"
local age = 1 



--[[
== ~= <= >= < >
and or not

if then
elseif then
elseif then
else
end
--]]
if name == "ray" and age ~= 18 then
    print(name.."'s age is not 18, is "..age)
elseif name == "ray shen" then
    print("hi "..name)
else
    print("last run")
end



--[[
while do end
repeat until
--]]
while name do
    print("for loop: age is "..age)
    age = age + 1
    if age >= 5 then
        break -- break: jump out
    end
end

local age = 2
repeat
    print("repeat loop: age is "..age)
    age = age + 1
until age >= 5 



--[[
for i = x(default), m(max), n(step) do end 
for i in ipairs(table_arry) do end
for i in pairs(table_key_value) do end
--]]
local fruit = {apple = "red", pear = "yellow", orange = "yellow", banana = "yellow", "china", "english", "us"}
for i = 1, 10, 4 do
    print("from 1 to 10, step is 4, now is: "..i)
end

-- only traverse key-value
for k,v in pairs(fruit) do
    if type(k) == "string" then -- lua support type: nil, boolean, number, string, userdata, function, thread, table
        print(k,v)
    end
end

-- only traverse arry
for i,v in ipairs(fruit) do
    print(v)
end
