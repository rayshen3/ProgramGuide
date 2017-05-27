/**
 * Created by ray on 17/5/25.
 */
package inheritance;

/**
 *
 * 描述类和接口继承关系的package
 *
 * @author ray
 * @date 2017/05/25
 * @version 0.1
 *
 *
 * 泛型类 GC2 实现 泛型接口 GI1,GI2
 * 普通类 C1  实现 泛型接口 GI1,GI2
 *
 * 泛型接口 GI3 继承 泛型类接口 GI1,GI2
 * 普通接口 I1 继承 泛型类接口 GI1,GI2 且不指定类型参数 类型
 * 普通接口 I5 继承 泛型类接口 GI1,GI2 指定类型参数 String
 *
 * 普通类C5 实现 普通接口I1, I1中继承下来的泛型类中的方法 类型参数会指定为Object
 * 普通类C6 实现 普通接口I5, I1中继承下来的泛型类中的方法 类型参数要指定为String
 *
 * 普通类C2 实现 普通子接口 I1
 * 泛型类 GC3 实现 普通接口 I1 泛型接口 GI1 同时继承了普通类C3
 *
 * 抽象类SC1 实现 普通接口 I1, 泛型接口 GI4
 *
 *
 */