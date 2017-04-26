-- test module with class
-- module name: people
-- local _M = { _VERSION = 0.01 }

local _M = { age = 28 }
local mt = { __index = _M }

function _M:new(name)
     local property = {
          name = name,
          country = "china",
          age = self.age + 10
     }
     return setmetatable(property, mt)
end

function _M:say()
     print(self.age.."岁的"..self.name.."在说话")
end


function _M:run()
     print(self.age.."岁的"..self.name.."在跑步")
end

--[[
test like this:

people = require "people"
lucy = people:new("lucy")
lucy:say()
lucy:run()

--]]
