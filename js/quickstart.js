//strict模式防止 变量声明不加var,导致多个js文件中相同变量名之间的互相影响
'use strict';

/*
对象: 一组由键-值组成的无序集合,值可以是任意类型,通过 [对象变量.属性名]的格式调用,属性名包含特殊字符，就必须用''括起来
js的对象是动态类型，你可以自由地给一个对象添加或删除属性
    添加: obj.max_age = 40;
    删除: delete obj.team;
    检测: 'title' in obj;                     有可能来自继承
          obj.hasOwnProperty('title');        对象自身拥有
 */
var obj = {
    team: 'youmeng+ obj',
    member_old: ['shenlei','zhangmingxing','wangxiang','lilele','luowenchuan'],
    member_young: ['二炮'],
    title: 'PE',
    avg_age: 110,
    city: 'Beijing',
    zipcode: null
}

var obj1 = {name: 'for loop for obj', type: 'test'}

//----------------------------------------------------------------------------------------------------------------------

/*
变量
 */
var msg3 = '滚犊子，你全家中了2000万!';
var age = 18;
//undefind
var sex

//----------------------------------------------------------------------------------------------------------------------

/*
数组内元素可以是任意类型,通过索引来访问,起始位置0
 */
var arr = [2,'门前大桥下'];
var arr1 = [[1, 2, 3], [400, 500, 600], '-'];


var msg1 = '恭喜团队: ' + obj.team.toUpperCase() + ' 中18岁的' + obj.member_old + '中奖100万元';
var msg2 = `恭喜未满18岁的 ${obj.member_young} 中奖100元!
验证码: 029313
请及时登陆 http://yuerblog.cc 领取!`;
var msg3 = '恭喜 ' + obj.city + '房价均价超过4w... '

//----------------------------------------------------------------------------------------------------------------------

/*
if () { ... } else if { ... } else { ... }, 大括号只有语句块里只有一条语句时可以省略
js把null、undefined、0、NaN和空字符串'' 视为false，其他值一概视为true
    ==会自动转换数据类型再比较，很多时候，会得到非常诡异的结果； !=
    ===不会自动转换数据类型，如果数据类型不一致，返回false，如果一致，再比较 !==
 */
if (obj.avg_age >= age && obj.city !== 'Beijing') {
    alert(msg1);
    alert('再见!');

} else if (obj.city === 'Beijing') {
    alert(msg3);

}

//----------------------------------------------------------------------------------------------------------------------

/*
for loop
    for (i=x; i<=xxxx; i++) { ... }
    for (;;) { ... } 死循环 break; 退出
 */
var x = 1;
var i
for (i=2; i<=10; i++) {
    x = x * i
}
if (x === 3628800) {
    alert('1 x 2 x 3 x ... x 10 = ' + x);
} else {
    alert('计算错误');
}

//var index
//for (index=0; index<arr.length; index++) {
//    alert(arr[index]);
//}
//for (var item in obj1) {
//    alert(item);   //obj keys
//}


//for (var item in arr) {
//    alert(item);   //index id
//}

//----------------------------------------------------------------------------------------------------------------------

/*
while loop
    while () { ... }
    do { ... } while ();


 */

var y = 0;
var n = 99;
while (n > 0) {
    y = y + n;
    n = n - 2;
}
alert('100以内的奇数和是: '+ y);

var z = 0;
var m = 1;
do {
    z = z + m
    m = m + 1
} while (m<=100);
alert('1+2+3..+100= ' + z);

//----------------------------------------------------------------------------------------------------------------------
/*
map and set

map
    m0.set('wangxiang',300);    add
    m0.has('shenlei');          exist
    m0.get('liwengang');        get
    m0.delete('liwengang');     delete

set
    s0.add('xxx');              add
    s.delete(1);                delete

iterable
    array
    map
    set

    for (xx of xx) { ... }

 */
var m0 = new Map();
var m1 = new Map([['liwengang',1000], ['shenlei',500], ['lilele',9000]]);

var s0 = new Set();
var s1 = new Set([1,2,3,3,3,3,3]);
//for (var setmember of s1) {
//    alert('for of 遍历set:"s1" ' + setmember);
//}

s1.forEach(function(setmember) {
    alert('forEach() 遍历set:"s1" ' + setmember);
    }
)


